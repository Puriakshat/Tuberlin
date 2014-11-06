package a.server;

public class StockQuote {

    private String stockName;
    private String stockID;
    private float stockPrice;

    public StockQuote(String stockName, String stockID, int stockPrice) {
        this.stockName = stockName;
        this.stockID = stockID;
        this.stockPrice = stockPrice;
    }
    
    public float getStockPrice(){
        return this.stockPrice;
    }
    
    public String getStockID(){
        return this.stockID;
    }
    
    public String getStockName(){
        return this.stockName;
    }
    
    public void setStockPrice(String stockPrice){
        this.stockPrice = Float.parseFloat(stockPrice);
    }
    
    public void setStockID(String stockID){
        this.stockID = stockID;
    }
    
    public void setStockName(String stockName){
        this.stockName = stockName;
    }
    
    @Override
    public String toString(){
        return "\nStock Name: " + this.stockName + "\nStock ID: "+ this.stockID +
                "\nStock Price: " + this.stockPrice;
    }
}
