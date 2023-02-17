public class Candle {
    private String color;
    private int height;
    int price;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = height * 2;
    }

    public double getPrice() {
        return price;
    }

    public void display(){
        System.out.println("Candle color: " + getColor());
        System.out.println("Candle height: " + getHeight() + " inches");
        System.out.println("Candle price: $" + String.format("%.2f", getPrice()));
    }
}