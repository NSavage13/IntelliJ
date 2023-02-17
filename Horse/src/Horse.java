public class Horse {
    private String name, color;
    private int birthYear;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void display(){
        System.out.println("Horse name: " + getName());
        System.out.println("Horse color " + getColor());
        System.out.println("Horse age :" + (2023 - getBirthYear()));

    }
}