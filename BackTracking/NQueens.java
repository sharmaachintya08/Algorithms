//N queens algorithm

public class NQueens {
    final int N = 4;

    void printNQ(int board[][]){
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                System.out.print(
                    " "+ board[i][j] +" "
                );
            }
            System.out.println();
        }
    }
    boolean isSafe(int board[][], int row , int col){
        int i , j ;
        for(i = 0 ; i < col ; i++ ){
            if(board[row][i] == 1) return false;
        }
        for(i = row , j = col ; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 1) return false;
        }
        return true;
    }
    boolean solveNQ(int board[][] , int col){
        if(col >= N) return true;
        for(int i = 0 ; i < N ; i++){
            if(isSafe(board,i,col)){
                board[i][col] = 1;
                if(solveNQ(board, col + 1)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    boolean solve(){
        int board[][] = {{ 0 , 0 , 0 , 0},
                         { 0 , 0 , 0 , 0},
                         { 0 , 0 , 0 , 0},
                         { 0 , 0 , 0 , 0}};
        if(solveNQ(board,0) == false){
            System.out.println("Solution does not exist");
            return false;
        }
        printNQ(board);
        return true;
    }
    public static void main(String[] args){
        NQueens nqueens = new NQueens();
        nqueens.solve();
    }
}
