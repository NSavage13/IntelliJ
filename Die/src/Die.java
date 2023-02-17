public class Die {
    protected int number;
    public void roll(){
        number =(int) (Math.random() * 6)+1;
    }
    public int getNumber(){
        return number;
    }
    public Die(){
        roll();
    }






}