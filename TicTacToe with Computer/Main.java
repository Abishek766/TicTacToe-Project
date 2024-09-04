/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Player1 name: ");
	    String player1=sc.next();
	    TicTacTao t= new TicTacTao();       				 
         Human p1=new Human(player1,'X');
	    AIplayer p2=new AIplayer("Bot",'O');
	    Player cp;
	    cp=p1;
	    while(true){
		 System.out.println(cp.name +" turn");
		 cp.makeMove();
		 TicTacTao.dispBoard();
		 if(TicTacTao.checkColWin() || TicTacTao.checkRowWin() || TicTacTao.checkDigWin()){
		    System.out.println(cp.name+" Won!!!!");
		    break;
		    }
		    //checking if it is draw
		    else if(TicTacTao.checkDraw()){
		        System.out.println("Match is Tied !!!!");
		    }
		    //After bob turns reference the current object to next player
		    else{
		      if(cp==p1){
		        cp=p2;
		      }
		      else{
		        cp=p1;
		      }
		   }
		}
	}
}
