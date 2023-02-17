public class LoadedDie {
    protected int loadedNumber;

    public void roll(){
        loadedNumber = (int) (Math.random() * 5)+1;
    }
    public void loadedDie(){
        roll();
    }
    public int getLoadedNumber(){
        return loadedNumber;
    }


}
