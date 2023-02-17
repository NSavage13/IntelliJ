public class FiveDice2 {

    private static  void display(FiveDice[] die){
        for (int i = 0; i < die.length; i++) {
            System.out.print(die[i].getValue() + " ");
        }
        System.out.println();
    }
    private static int getHighestCombinationValue(FiveDice[] dice) {
        int[] count = new int[7];

        for (int i = 0; i < dice.length; i++) {
            count[dice[i].getValue()]++;
        }

        for (int i = 6; i >= 1; i--) {
            if (count[i] == 5) {
                return 5; // Five of a kind
            } else if (count[i] == 4) {
                return 4; // Four of a kind
            } else if (count[i] == 3) {
                return 3; // Three of a kind
            } else if (count[i] == 2) {
                for (int j = i - 1; j >= 1; j--) {
                    if (count[j] == 2) {
                        return 2; // A pair
                    }
                }
            }
        }

        return 1;
    }



    public static void main(String[] args){
        FiveDice[] player = new FiveDice[5];
        FiveDice[] computer = new FiveDice[5];

        for (int i =0; i < 5; i++){
            player[i] = new FiveDice();
            computer[i] = new FiveDice();
        }
        System.out.println("Player's results");
        display(player);
        System.out.println("Computer's results");
        display(computer);

       int playerCombos = getHighestCombinationValue(player);
       int computerCombos = getHighestCombinationValue(computer);

       if (playerCombos > computerCombos){
           System.out.println("Player Wins");
       } else if (computerCombos > playerCombos) {
           System.out.println("Computer Wins");
       }else {

           System.out.println("Tie");
       }


    }
}
