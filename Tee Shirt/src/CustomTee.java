public class CustomTee extends TeeShirt {
    private String slogan;

    public CustomTee(int orderNumber, String size, String color) {
        super(orderNumber, size, color);
    }

    public CustomTee(int orderNumber, String size, String color, String slogan) {
        super(orderNumber, size, color);
        this.slogan = slogan;
    }


    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
