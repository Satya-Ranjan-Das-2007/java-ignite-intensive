package day6;

public class CricketMatch {
	String playerName;
    int runs;
    int balls;
    double strikeRate;

    CricketMatch(String pn, int r, int b)
    {
        playerName = pn;
        runs = r;
        balls = b;
        if (balls > 0) 
        {
            strikeRate = (double) (runs * 100) / balls;
        } else
        {
            strikeRate = 0;
        }
    }
    void display() {
        System.out.println("Strike Rate = " + (int) strikeRate);
    }

    public static void main(String[] args) {
        CricketMatch player1 = new CricketMatch("KOHLI", 250, 50);
        player1.display();
    }
}
