public class GamingCansoleMain {
    public static void main(String[] args) {
        Badminton badminton = new Badminton();
        badminton.player1 = 10;
        badminton.player2 = 20;
        Chess chess = new Chess();
        chess.player1 = 10;
        chess.player2 = 10;

        badminton.computeScore();
        chess.computeScore();
        GamingCansole gamingCansole1 = badminton;
        GamingCansole gamingCansole2 = chess;

        gamingCansole1.computeScore();
        gamingCansole2.computeScore();


    }
}
