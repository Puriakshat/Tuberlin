package d.server;

import StockExchangeD.Quote;
import StockExchangeD.QuoterPOA;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class QuoterImpl extends QuoterPOA {

    private final int NUMBER_OF_COMPANIES = 30;
    private final Path configFile;
    private final ArrayList<Quote> daxCompanies;

    public QuoterImpl() {
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


    @Override
    public Quote getQuote(String quoteInfo)  {
        for (Quote quote : daxCompanies) {
            if (quoteInfo.equals(quote.name) || quoteInfo.equals(quote.id)) {
                return quote;
            }
        }
        Quote q = new Quote("","","-1");
        return q;
    }

}
