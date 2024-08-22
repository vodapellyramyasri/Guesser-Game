import java.util.*;

class Guesser{
    private int gnum;
    int guessNum(int low,int high)
    {
        System.out.print("Guesser!Kindly guess number between "+low+"to"+high);
        Scanner scan =new Scanner(System.in);
        gnum=scan.nextInt();
        if((gnum>=low)&&(gnum<=high))
        {
            return gnum;
        }
        else
        {
            System.out.print("please guess a valid number within the range specified");
            return guessNum(low,high);
        }
    }
    
}
class Player{
    private int pnum;
    int predictNum(int low,int high)
    {
        System.out.print("Player!Kindly predict number between "+low+"to"+high);
        Scanner scan =new Scanner(System.in);
        pnum=scan.nextInt();
        if((pnum>=low)&&(pnum<=high))
        {
            return pnum;
        }
        else
        {
            System.out.print("predict a valid number within the range specified");
            return predictNum(low,high);
        }
    }
    
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromGuesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.guessNum(1,100);
    }
    void collectNumFromPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.predictNum(1,100);
        numFromPlayer2=p2.predictNum(1,100);
        numFromPlayer3=p3.predictNum(1,100);
    }
     void compare{
        if(numFromGuesser==numFromPlayer1)
        {
            System.out.print("player1 wins it");
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            System.out.print("player2 wins it");
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.print("player3 wins it");
        }
        else
        {
            System.out.print("Game lost!Try again");
        }
    }
}

public class GuesserGameApp{
    public static final int CHANCES=3;
    public static void main(String args[])
    {
        Umpire u= new Umpire();
        int i=1;
        while(i<=CHANCES){
            u.collectNumFromGuesser();
            u.collectNumFromPlayer();
            u.compare();
            ++i;
        }
    }
}