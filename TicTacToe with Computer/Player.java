public abstract class Player{
    String name;
    char mark;
    
    abstract void makeMove();
    
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