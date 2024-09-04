import java.util.*;
public class HumanPlayer extends Player{
    String name;
    char mark;
    public HumanPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
        
    }
    // to make move with X or O
    @Override
    public void makeMove(){
        //take input from keyboard
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
    // to check the move is valid or not
    public boolean isValid(int row,int col){
        if(row>=0 && row <=2 && col >=0 && col <=2){
            //check if the board coordinates is empty or space;
            if(TicTacTao.board[row][col]==' '){
                return true;
            }
        }
        return false;
    }
   
}