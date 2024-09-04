
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Player1 name: ");
	    String player1=sc.next();
	    /*System.out.println("Enter the Player2 name: ");
	    String player2=sc.next();*/
	    
	    TicTacTao t= new TicTacTao();
	    //Creating objects for 2 persons
	    HumanPlayer p1=new HumanPlayer(player1,'X');
	    HumanPlayer p2=new HumanPlayer(player2,'O');
	    //creating a reference objects to whom is playing
	    HumanPlayer cp;
	    //the palyer who will have X is a first player
	    cp=p1;
	    while(true){
		 System.out.println(cp.name +" turn");
		 cp.makeMove();
		 TicTacTao.dispBoard();
		 if(TicTacTao.checkColWin() || TicTacTao.checkRowWin()       || TicTacTao.checkDigWin()){
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
