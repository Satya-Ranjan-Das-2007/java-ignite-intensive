package day6;

public class Treasure_Chest_Game {
	String PlayerName;
    int CoinsCollected;
    String RewardRequirement;

    public Treasure_Chest_Game(String name, int coins) 
    {
        PlayerName = name;
        CoinsCollected = coins;
        
        if(CoinsCollected >= 1000) 
        {
            RewardRequirement = "Diamond Sword";
        } 
        else if (CoinsCollected > 500)
        {
            RewardRequirement = "Gold Sword";
        } 
        else if (CoinsCollected >= 100) 
        {
            RewardRequirement = "Iron Sword";
        } 
        else 
        {
            RewardRequirement = "Wooden Sword";
        }
    }
    
    public void displayStatus() {
    	System.out.println("Player: " + PlayerName);
        System.out.println("Coins: " + CoinsCollected);
        System.out.println("Unlocked: " + RewardRequirement);
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        Treasure_Chest_Game player1 = new Treasure_Chest_Game("STWATRA", 2000);
        Treasure_Chest_Game player2 = new Treasure_Chest_Game("SUBHENDU", 700);
        Treasure_Chest_Game player3 = new Treasure_Chest_Game("BALDEV", 1900);
        Treasure_Chest_Game player4 = new Treasure_Chest_Game("HRUSHIKESH", 90);
        Treasure_Chest_Game player5 = new Treasure_Chest_Game("SATYAJIT", 400);
        

        player1.displayStatus();
        player2.displayStatus();
        player3.displayStatus();
        player4.displayStatus();
        player5.displayStatus();
    }

}
