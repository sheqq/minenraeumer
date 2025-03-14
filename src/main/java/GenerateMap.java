package main.java;

public class GenerateMap {

    private Field[][] board = new Field[9][9];
    private int bombsToInitialize = (9 * 9) / 4;





    public GenerateMap() {
        int random;
        for (int a = 0; a < this.board.length; a++) {
            for(int b = 0; b < this.board[a].length; b++) {
                random = (int) (Math.random()*4);
                System.out.println(random);
                if(bombsToInitialize > 0) {
                    if(random == 1){
                        this.board[a][b] = new Field(true);
                        bombsToInitialize--;
                    }
                }
                if(this.board[a][b] == null) {
                    this.board[a][b] = new Field(false);
                }
            }
        }
        initializeSurround();
        printBackend();
    }

    private void initializeSurround() {
        int counter = 0;
        for(int a = 0; a < this.board.length; a++) {
            for(int b = 0; b < this.board[a].length; b++) {
                try {
                    if(a > 0 && b > 0) {
                        if (this.board[a - 1][b - 1].isBomb()) {
                            counter++;
                        }
                    }
                    if(a > 0) {
                        if (this.board[a - 1][b].isBomb()) {
                            counter++;
                        }
                    }
                    if(a > 0 && b < 8) {
                        if (this.board[a - 1][b + 1].isBomb()) {
                            counter++;
                        }
                    }
                    if(b > 0) {
                        if (this.board[a][b - 1].isBomb()) {
                            counter++;
                        }
                    }
                    if(b < 8) {
                        if (this.board[a][b + 1].isBomb()) {
                            counter++;
                        }
                    }
                    if(a < 8 && b > 0) {
                        if (this.board[a + 1][b - 1].isBomb()) {
                            counter++;
                        }
                    }
                    if(a < 8) {
                        if (this.board[a + 1][b].isBomb()) {
                            counter++;
                        }
                    }
                    if(a < 8 && b < 8) {
                        if (this.board[a + 1][b + 1].isBomb()) {
                            counter++;
                        }
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new RuntimeException(e);
                }
                this.board[a][b].setBombsSurrounded(counter);
                counter = 0;
            }
        }
    }

    public void printBackend() {
        for (int a = 0; a < this.board.length; a++) {
            for (int b = 0; b < this.board.length; b++) {
                if(this.board[a][b].isBomb()) {
                    System.out.print("X ");
                } else {
                    System.out.print(this.board[a][b].getBombsSurrounded() + " ");
                }
            }
            System.out.println();
        }
    }

    public Field getField(int row, int col) {
        return this.board[row][col];
    }
}
