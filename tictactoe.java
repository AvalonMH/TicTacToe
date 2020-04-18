package tictactoe;

//importers
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Tictactoe {

//create array
static String[] tictactoe;

//variables
static String x = " X ";
static String o = " O ";
static String empty = "   ";
static String begin = null;
static int player = 0;
static int puter = 0;
static int win = 0;
static int NumRows = 9;
static int z = 0;
static int playerchoice = -1;
static int computerchoice = -1;
static int loop = 0;


//scanner
static Scanner myScan = new Scanner(System.in);

//---------------now---the---fun---part------------------------------    

//printing
static void printgame()
{
z = 0;

for(int r = 0; r < NumRows; r = r + 1)
    {
   
    System.out.print("|" + tictactoe[r] + "|");
       
    z = z + 1;

    while(z > 2)
        {  
        z = 0;
        System.out.println("\n");
        }
    }
   
}

static void playerturn()
{
System.out.println("Please enter the number associated with the box you "
                 + "wish to place.");  
loop = 0;    
while(loop == 0)
    {
    playerchoice = Integer.parseInt(myScan.nextLine()) -1;
   
    if(tictactoe[playerchoice] == empty)
        {
        tictactoe[playerchoice] = x;
        loop = 1;
        }
    else
        {
        System.out.println("That spot is taken! Please select another.");
        loop = 0;
        }
    }    

}

static void computerturn()
{  
//rando bambo
Random RNG = new Random();

computerchoice = RNG.nextInt(9);

while(puter == 0)
    {
    if(tictactoe[computerchoice].equals(empty))
        {
        tictactoe[computerchoice] = o;
        return;
        }
else if(!(tictactoe[computerchoice].equals(empty))&& computerchoice < 9)
        {
        computerchoice = computerchoice + 1;
       
        if(computerchoice > 8)
            {
            computerchoice = 0;
            }
        }
    }
   
}

//win check
static void wincheck()
{
////a b c
////d e f
////g h i
//wincheck variables
String a = tictactoe[0];
String b = tictactoe[1];
String c = tictactoe[2];
String d = tictactoe[3];
String e = tictactoe[4];
String f = tictactoe[5];
String g = tictactoe[6];
String h = tictactoe[7];
String i = tictactoe[8];
       
// top horizontal win 1
if(a == b && b == c)
{
if(a == x && b == x && c == x)
    {
    win = 1;
   
    System.out.println("Hey, you did it!");
   
    puter = 1;
    return;
    }  
else if(a == o && b == o && c == o)
    {
    win = 1;
   
    System.out.println("Wow... Umm... You lost to a... Hmmmm...");
   
    player = 1;
    return;
    }
}

// middle horizontal win 2
else if(d == e && e == f)
{
if(d == x && e == x && f == x)
    {
    win = 1;
   
    System.out.println("Hey, you did it!");
   
    puter = 1;
    return;
    }  
else if(d == o && e == o && f == o)
    {
    win = 1;
   
    System.out.println("Wow... Umm... You lost to a... Hmmmm...");
   
    player = 1;
    return;
    }            
}

// bottom horizontal win 3
else if(g == h && h == i)
{
if(g == x && h == x && i == x)
    {
    win = 1;
   
    System.out.println("Hey, you did it!");
   
    puter = 1;
    return;
    }  
else if(g == o && h == o && i == o)
    {
    win = 1;
   
    System.out.println("Ha ha! You lost to a bot!");
   
    player = 1;
    return;
    }      
}

// left vertical win 4
else if(a == d && d == g)
{
if(a == x && d == x && g == x)
    {
    win = 1;
   
    System.out.println("You made that look easy!");
   
    puter = 1;
    return;
    }  
else if(a == o && d == o && g == o)
    {
    win = 1;
   
    System.out.println("Losing to a computer now are we?");
   
    player = 1;
    return;
    }      
}  

// middle vertical win 5
else if(b == e && e == h)
{
if(b == x && e == x && h == x)
    {
    win = 1;
   
    System.out.println("You made that look easy!");
   
    puter = 1;
    return;
    }  
else if(b == o && e == o && h == o)
    {
    win = 1;
   
    System.out.println("Losing to a computer now are we?");
   
    player = 1;
    return;
    }      
}

// right vertical win 6
else if(c == f && f == i)
{
if(c == x && f == x && i == x)
    {
    win = 1;
   
    System.out.println("You made that look easy!");
   
    puter = 1;
    return;
    }  
else if(c == o && f == o && i == o)
    {
    win = 1;
   
    System.out.println("Losing to a computer now are we?");
   
    player = 1;
    return;
    }      
}

// downward slope win 7
else if(a == e && e == i)
{
if(a == x && e == x && i == x)
    {
    win = 1;
   
    System.out.println("Wow, you beat me...");
   
    puter = 1;
    return;
    }  
else if(a == o && e == o && i == o)
    {
    win = 1;
   
    System.out.println("I wasn't even worried!");
   
    player = 1;
    return;
    }              
}

// upward slope win 8
else if(g == e && e == c)
{
if(g == x && e == x && c == x)
    {
    win = 1;
   
    System.out.println("Wow, you beat me...");
   
    puter = 1;
    return;
    }  
else if(g == o && e == o && c == o)
    {
    win = 1;
   
    System.out.println("I wasn't even worried!");
   
    player = 1;
    return;
    }
}
// tie game
else if(!(a.equals(empty)) && !(b.equals(empty)) && !(c.equals(empty)) &&
        !(d.equals(empty)) && !(e.equals(empty)) && !(f.equals(empty)) &&
        !(g.equals(empty)) && !(h.equals(empty)) && !(i.equals(empty)))
    {
    win = 1;
    System.out.println("It's a tie!");
       
    player = 1;
    puter = 1;    
    }
}
   
    public static void main(String[] args) {
     
    //more variables
    String yn = "y";  
    String playagain = "y";
    String playagainquestion = "y";

    while(playagain.equalsIgnoreCase("y"))
    {
    //reset variables
    playagainquestion = "y";    
       
    //declare array    
    tictactoe = new String [NumRows];
   
    //labels
    tictactoe[0] = " 1 ";
    tictactoe[1] = " 2 ";
    tictactoe[2] = " 3 ";
    tictactoe[3] = " 4 ";
    tictactoe[4] = " 5 ";
    tictactoe[5] = " 6 ";
    tictactoe[6] = " 7 ";
    tictactoe[7] = " 8 ";
    tictactoe[8] = " 9 ";        
   
    printgame();
   
    //empty array
    tictactoe[0] = empty;
    tictactoe[1] = empty;
    tictactoe[2] = empty;
    tictactoe[3] = empty;
    tictactoe[4] = empty;
    tictactoe[5] = empty;
    tictactoe[6] = empty;
    tictactoe[7] = empty;
    tictactoe[8] = empty;
   
   
    System.out.println("Would you like to make the first play? y / n");
    yn = myScan.nextLine();
   
    if(yn.equalsIgnoreCase("y"))
        {
        while(win == 0)
            {
            //clear variables
            player = 0;
            puter = 0;
           
           
            while(player == 0)
                {
                System.out.println("Go on, make your move.");
               
                while(loop == 0)
                    {
                    try
                        {
                        playerturn();
                        loop = 1;
                        }
                    catch(Exception e)
                        {
                        System.out.println("That didn't make sense to me."
                                + "Try again.");
                        loop = 0;
                        }
                   
                    }
                loop = 0;
               
                printgame();
               
                wincheck();
               
                player = 1;
                }
           
            while(puter == 0)
                {
                System.out.println("My turn...");
                   
                computerturn();
               
                printgame();
               
                wincheck();
               
                puter = 1;
                }      
            }
        }
    else if(yn.equalsIgnoreCase("n"))
        {
        while(win == 0)
            {
            //clear variables
            player = 0;
            puter = 0;
           
            while(puter == 0)
                {
                System.out.println("Get ready to lose!");
               
                computerturn();
               
                printgame();
               
                wincheck();
               
                puter = 1;
                }
           
            while(player == 0)
                {
                System.out.println("Go on, make your move.");
               
                while(loop == 0)
                    {
                    try
                        {
                        playerturn();
                        loop = 1;
                        }
                    catch(Exception e)
                        {
                        System.out.println("That didn't make sense to me."
                                + "Try again.");
                        loop = 0;
                        }                
                    }
                
                loop = 0;
                   
                printgame();
                   
                wincheck();
                   
                player = 1;
                }
            }
        }
    else
        {
            System.out.println("Whoops! What was that?");
        }
   
    while(playagainquestion.equalsIgnoreCase("y"))
    {
        try
        {
            System.out.println("Want to play again? y / n");
            playagain = myScan.nextLine();

            player = 0;
            puter = 0;
            win = 0;

            if(playagain.equalsIgnoreCase("y"))
            {
                playagainquestion = "n";
                playagain = "y";
            }
            else if(playagain.equalsIgnoreCase("n"))
            {
                playagainquestion = "n";
                playagain = "n";
                return;
            }
            else
            {
                System.out.println("I didn't understand that. Try again.");
            }
        }
        catch(Exception e)
        {
            System.out.println("I didn't understand that. Try again.");  
                   
        }
    }
    }
   
}
}
