package org.example.model;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private Cell[][] cells;

    public Cell[][] getCells() {
        return cells;
    }

    public Board(int boardSize, int ladders, int snakes){
        this.cells = new Cell[boardSize+1][boardSize+1];

        //upar to sirf memory hi di hai, usko initialize bhi to krna hai
        for(int i = 0 ;i<=boardSize;i++){
            for(int j=0;j<=boardSize;j++){
                cells[i][j] = new Cell();
            }
        }
        addLadders(ladders,boardSize);
        addSnakes(snakes,boardSize);
    }

    private void addSnakes(int snakes, int boardSize) {
        while(snakes-->0){
            int start = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);
            int end = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);

            if(start<=end)
                continue;

            Jump jump = new Jump(start,end);

            int x = start/boardSize;
            int y = start%boardSize;



            cells[x][y].setJump(jump);

        }
    }

    private void addLadders(int ladders,int boardSize) {
        while(ladders-->0){
            int start = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);
            int end = ThreadLocalRandom.current().nextInt(1,boardSize*boardSize-1);

            if(start>=end)
                continue;

            Jump jump = new Jump(start,end);

            int x = start/boardSize;
            int y = start%boardSize;

            cells[x][y].setJump(jump);

        }

    }


}
