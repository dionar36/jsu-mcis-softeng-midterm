package edu.jsu.mcis;

public class ConnectFour {
    public enum Location {EMPTY, RED, BLACK};
    private int ROWS = 6;
    private int COLUMN = 7;
    private Location[][] board;
    private boolean redTurn;
    
    public ConnectFour() {
    	board = new Location[ROWS][COLUMN];
        for(int i = 0; i < board.length; i++){
        	for(int j = 0; j < board[i].length; j++){
        		board[i][j] = Location.EMPTY;
        	}
        }
        redTurn = true;
    }
    
    public Location getTopOfColumn(int column) {
    	if(board[0][column] != Location.EMPTY && board[0][column] != Location.BLACK){
            return Location.RED;
        }
        else if(board[0][column] != Location.EMPTY && board[0][column] != Location.RED){
            return Location.BLACK; 
        }
        else{
            return Location.EMPTY;
        }
    }
    
    public int getHeightOfColumn(int column) {
        return 0;
    }
    
    public void dropToken(int column) {

       	if (redTurn == true){
        	board[0][column] = Location.RED;
            redTurn = false;
        }
        else{
            board[0][column] = Location.BLACK;
            redTurn = true;
        }  
    }
}