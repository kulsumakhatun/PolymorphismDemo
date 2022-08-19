public class Badminton implements GamingCansole {

    int player1;
    int player2;

    public void computeScore(){
        if (player1 > player2){
            System.out.println(" Winner = " + player1);
        } else {
            System.out.println("player2 is winner= " + player2);
        }
    }





}
