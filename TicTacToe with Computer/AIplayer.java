import java.util.*;
public class AIplayer extends Player{
    public AIplayer(String name,char mark){
        this.name=name;
        this.mark=mark;
        
    }
    @Override
    public void makeMove(){
        //take input Randomly
        Random r = new Random();
        int row=0,col=0;
        //if it is invalid to give a another chance it will run util its valid
        do{
          System.out.println("Enter the row and col");
          row=r.nextInt(3);
          col=r.nextInt(3);
        }while(!isValid(row,col));
        //pass the parameters to placeMark
        TicTacTao.placeMark(row,col,mark);
    }
}