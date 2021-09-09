package sumon;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match Type: " +matchType);
        System.out.println("Over of the match: " +over);
        System.out.println("Name of the player: " +player.playerName);
        System.out.println("Jersey number of the player: " +player.jerseyNumber);
    }
}
/*
Name: Md. Atikul Islam Sumon
ID: 2012020122
Section: C
Email: cse_2012020122@lus.ac.bd
Date: 09-09-2021
*/

