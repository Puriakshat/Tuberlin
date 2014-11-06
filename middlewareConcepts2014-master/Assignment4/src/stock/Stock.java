package stock;

public class Stock {

    private String name;
    private String id;
    private double quote;
    private String instant;

    public Stock(String name, String id, double quote, String instant) {
        this.name = name;
        this.id = id;
        this.quote = quote;
        this.instant = instant;
    }

    public void setStockName(String name) {
        this.name = name;
    }

    public void setStockId(String id) {
        this.id = id;
    }

    public void setStockQuote(double quote) {
        this.quote = quote;
    }

    public void setStockInstant(String instant) {
        this.instant = instant;
    }

    public String getStockId() {
        return this.id;
    }

    public String getStockName() {
        return this.name;
    }

    public double getStockQuote() {
        return this.quote;
    }

    public String getState() {
        return (String.valueOf(this.quote) + ":" + this.instant);
    }
}
