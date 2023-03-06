package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    boolean[][] board;

    private int size;
    PApplet p;

    public LifeBoard(int size, PApplet p) {
        this.size = size;
        this.p = p;
        board = new boolean[size][size];
        randomize();
    } // End 

    public void render() {
        drawBoard();
    } // End remder

    private void drawBoard() {
        int windowWidth = p.width;
        int windowHeight = p.height;

        int gap = windowWidth / size;

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                if(board[row][col]) {
                    p.fill(255, 255, 255);
                }
                else {
                    p.fill(0, 0, 0);
                }
                
                p.square(row * gap, col * gap, gap);
            } // End for
        } // End for
    } // End void drawBoard()

    private void randomize() {      
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                board[row][col] = ( p.random(0, 1)  >= 0.5);
            } // End for
        } // End for
    } // End void drawBo

    private boolean getCell(int row, int col) {
        if(row >= 0 && row < size && col >= 0 && col < size) {
            return board[row][col];
        } // End for
        return false;
    } // End boolean getCell

    private int countCells(int row, int col) {
        int count = 0;
        
        for( int i = -1; i <= 1; i++) {
            for(int j = 0; j <= 1; j++) {
                if(!(i == 0) && (j == 0)) {
                    if(getCell(i, j)) {
                        count++;
                    }
                } // End if
            } // End for
        } // End for

        return count;
    } // End countCells

    private void applyRules() {
        	
    } // 
} // End randomeize

