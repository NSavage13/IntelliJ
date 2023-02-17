public class TestLoadedDie {

    public static void main(String[] args){
        Die dieOne = new Die();
        Die dieTwo = new Die();
        LoadedDie loadedDie = new LoadedDie();

        int countOne = 0;
        int countTwo = 0;

        for (int i=0;i<1000;i++){
            dieOne.roll();
            dieTwo.roll();
            if (dieOne.getNumber() > dieTwo.getNumber()){
                countOne++;
            }else {
                countTwo++;
            }
        }

        if (countOne > countTwo){
            System.out.println("With two regular dice, the first dice won " + countOne + " times out of 1000");
        }else if ( countTwo > countOne){
            System.out.println("With two regular dice, the second dice won " + countTwo + " times out of 1000");
        }else {
            System.out.println("Tie!");
        }
        int countFour = 0;
        int countThree = 0;
        for (int i=0;i<1000;i++){
            dieOne.roll();
            loadedDie.roll();
            if (dieOne.getNumber() > loadedDie.getLoadedNumber()){
                countThree++;
            }else {
                countFour++;
            }
        }
        System.out.println("With one die against a loaded die, the first die won " + countThree + " times out of 1000");


    }
}
