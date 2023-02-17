public class FiveDice {
    protected int value;

    public FiveDice() {
        roll();

    }

    public void roll() {
        value = (int) (Math.random() * 6) + 1;
    }

    public int getValue() {
        return value;
    }
}
