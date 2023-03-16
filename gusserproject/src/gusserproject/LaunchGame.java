package gusserproject;

import java.util.*;



class Guesser
{
    int guesNum;
    public int guessingNumber()
    {
       System.out.println("Guesser! kindly guess the number");
       Scanner scan= new Scanner(System.in); 
       guesNum=scan.nextInt();
       return guesNum; 
    }
}
class player
{
    int guesNum;
   int guessingNumber()
    {  Scanner scan=new Scanner(System.in);
        System.out.println("player!kindly guess the number");
        guesNum=scan.nextInt();
        return guesNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumFromGuesser()
    {
      Guesser g=new Guesser();
      numFromGuesser=g.guessingNumber();
    }
     void collectNumFromPlayers()
    { player p1=new player();
      player p2=new player();
      player p3=new player();
     numFromPlayer1=p1.guessingNumber();
     numFromPlayer2=p2.guessingNumber();
     numFromPlayer3=p3.guessingNumber();


    }
    void  compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            System.out.println("player1 won the game");
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            System.out.println("player2  won the game");
        }
        else if(numFromGuesser==numFromPlayer3)
       {
        System.out.println("player3 is won  won the game ");
       }
       else
       {
        System.out.println("no one won the game! try next time");
       }
    }



}


class LaunchGame
{
public static void main(String []args)
{
    System.out.println("Game Started");
    Umpire u=new Umpire();
    u.collectNumFromGuesser();
    u.collectNumFromPlayers();
    u.compare();
}
} 