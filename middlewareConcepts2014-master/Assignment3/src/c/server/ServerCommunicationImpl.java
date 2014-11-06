package c.server;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServerCommunicationImpl extends ServerCommunicationPOA {

    private HashMap<Responder, String> map = new HashMap<>();
    private final int NUMBER_OF_COMPANIES = 30;
    private final Path configFile;
    private final ArrayList<Quote> daxCompanies;

    public ServerCommunicationImpl() {
        this.daxCompanies = new ArrayList<>(NUMBER_OF_COMPANIES);
        this.configFile = Paths.get("../../DAX_Info/DAX.in").toAbsolutePath().normalize();

        List<String> numberOfCompanies = readAllDAXLines();

        Quote stockQ = new Quote();
        int i = 0;

        for (String line : numberOfCompanies) {
            switch (i % 3) {
                case 0:
                    stockQ = new Quote();
                    stockQ.name = line;
                    break;
                case 1:
                    stockQ.id = line;
                    break;
                case 2:
                    stockQ.price = line;
                    daxCompanies.add(stockQ);
                    break;
            }
            i++;
        }
        System.out.println("\nServer initialized\n");
    }

    private List<String> readAllDAXLines() {
        List<String> ans = null;
        try {
            ans = Files.readAllLines(configFile, Charset.defaultCharset());
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return ans;
    }
    
        public Quote getQuote(String quoteInfo) {
        for (Quote quote : daxCompanies) {
            if (quoteInfo.equals(quote.name) || quoteInfo.equals(quote.id)) {
                return quote;
            }
        }
        return null;
    }

    @Override
    public void register_callback(String Quote_info, Responder responder) {
        map.put(responder, Quote_info);
        Quote q = getQuote(Quote_info);
        try{
            responder.push(q);
        }catch(Exception ex){
            q = new Quote();
            q.price="-1";
            q.name ="";
            q.id="";
            responder.push(q);
        }
        System.out.println("Request from client");
    }

    @Override
    public void unregister_callback(Responder responder) {
        map.remove(responder);
    }

}
