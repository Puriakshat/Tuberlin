package a.server;

import QuoterPackage.InvalidStockID;
import QuoterPackage.InvalidStockName;
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
    private final ArrayList<StockQuote> daxCompanies;

    public QuoterImpl() {
        this.daxCompanies = new ArrayList<>(NUMBER_OF_COMPANIES);
        this.configFile = Paths.get("../../DAX_Info/DAX.in").toAbsolutePath().normalize();

        List<String> numberOfCompanies = readAllDAXLines();

        StockQuote stockQ = new StockQuote(null, null, -1);
        int i = 0;
        
        for (String line : numberOfCompanies) {
            switch (i % 3) {
                case 0:
                    stockQ = new StockQuote(null, null, -1);
                    stockQ.setStockName(line);
                    break;
                case 1:
                    stockQ.setStockID(line);
                    break;
                case 2:
                    stockQ.setStockPrice(line);
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
    public float getQuoteByName(String stockName) throws InvalidStockName {
        for (StockQuote stockQ : daxCompanies) {
            if (stockName.equals(stockQ.getStockName())) {
                return stockQ.getStockPrice();
            }
        }
        //did not find a stockQuote with this name
        throw new InvalidStockName();
    }

    @Override
    public float getQuoteByID(String stockID) throws InvalidStockID {
        for (StockQuote stockQ : daxCompanies) {
            if (stockID.equals(stockQ.getStockID())) {
                return stockQ.getStockPrice();
            }
        }
        //did not find a stockID with this name
        throw new InvalidStockID();
    }

}
