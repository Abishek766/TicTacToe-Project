public class TicTacTao{
    static char[][] board;
    public TicTacTao(){
        board=new char[3][3];
        initBoard();
        
    }
    //Initiallising the board with spaces
    void initBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
    }
    //place the character in the board 'X' or 'Y'
    public static void placeMark(int row,int col,char mark){
        if(row>=0 && row <= 2 && col >=0 && col <=2){
            board[row][col]=mark;
        }
    }
    //Display the board
    public static void dispBoard(){
        System.out.println("-------------");
        for(int i=0;i<=2;i++){
            System.out.print("| ");
            for(int j=0;j<=2;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    //Checking Winning Conditions
    //check coloumn winning Conditions
    static boolean checkColWin(){
      for(int col=0;col<=2;col++){
          if(board[0][col]!=' '&& board[0][col]==board[1][col] && board[1][col]==board[2][col]){
              return true;
          }
      }
      return false;
    }
    //check row winning Conditions
    static boolean checkRowWin(){
        for(int row=0;row<=2;row++){
            if(board[row][0]!=' '&& board[row][0]==board[row][1] && board[row][1]==board[row][2]){
                return true;
            }
        }
        return false;
    }
    //check diagonal winning Conditions
    static boolean checkDigWin(){
      if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] ||board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0])
      {
          return true;
      }
      else{
          return false;
      }
    }
    static boolean checkDraw(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==' ')
                {
                   return false; 
                }
            }
        }
        return true;
    }
    
}