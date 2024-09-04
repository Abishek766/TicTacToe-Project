import java.util.*;
public class Human extends Player{
    public Human(String name,char mark){
        this.name=name;
        this.mark=mark;
        
    }
    @Override
    public void makeMove(){
        Scanner sc = new Scanner(System.in);
        int row=0,col=0;
        //if it is invalid to give a another chance it will run util its valid
        do{
          System.out.println("Enter the row and col");
          row=sc.nextInt();
          col=sc.nextInt();
        }while(!isValid(row,col));
        //pass the parameters to placeMark
        TicTacTao.placeMark(row,col,mark);
    }
}