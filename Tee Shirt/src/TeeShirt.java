import java.util.Scanner;

public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    Scanner input = new Scanner(System.in);

    public TeeShirt(int orderNumber, String size, String color) {
        this.orderNumber = orderNumber;
        this.size = size;
        this.color = color;

        if (size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXXL")){
            price = 22.99;
        }else {
            price = 19.99;
        }
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
