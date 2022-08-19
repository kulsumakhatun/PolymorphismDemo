public class Chess implements GamingCansole{

    int player1;
    int player2;

    public void computeScore(){
       if (player1 > player2){
           System.out.println(" Winner = " + player1);
       } else if (player1 < player2){
           System.out.println("player2 is winner= " + player2);
       } else {
           System.out.println("Draw");
       }

    }

    }


