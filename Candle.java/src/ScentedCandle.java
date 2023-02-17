public class ScentedCandle extends Candle {

    private String scent;


    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(int height){
        super.setHeight(height);
        this.price = height * 3;

    }

    public void displayScent(){
        System.out.println("Candle color: " + getColor());
        System.out.println("Candle height: " + getHeight() + " inches");
        System.out.println("Candle scent: " + getScent());
        System.out.println("Candle price: $" + String.format("%.2f", getPrice()));
    }
}
