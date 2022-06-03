package com.deckOfCards;

public class Players extends DeckOfCards{
    static String player1;
    static String player2;
    static String player3;
    static String player4;
    public static void players()
    {
        int count = 9;
        int player1Index;
        int player2Index;
        int player3Index;
        int player4Index;
        while(count>0) {
             player1Index = (int) (Math.random() * finalDeck.length);
             player2Index = (int) (Math.random() * finalDeck.length);
             player3Index = (int) (Math.random() * finalDeck.length);
             player4Index = (int) (Math.random() * finalDeck.length);
             if(finalDeck[0][player1Index] != null||finalDeck[0][player2Index] != null||finalDeck[0][player3Index] != null||finalDeck[0][player4Index] != null)
             {
                 System.out.println("The player 1 is "+finalDeck[0][player1Index]);

                 System.out.println("The player 2 is "+finalDeck[0][player2Index]);

                 System.out.println("The player 3 is "+finalDeck[0][player3Index]);

                 System.out.println("The player 4 is "+finalDeck[0][player4Index]);
             }

            count--;
        }
    }
}
