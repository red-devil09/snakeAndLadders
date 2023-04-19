package org.example.model;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Game {

    private String id;
    private Queue<Player> playerList;

    public Game(String id){
        this.id = id;
        playerList = new LinkedList<>();

    }

    public void addPlayer(Player p){
          playerList.add(p);
    }

    public void startGame(int boardSize,int snakes,int ladders){
        Board board = new Board(boardSize,snakes,ladders);
        Dice d = new Dice(1,6);

        while(true){
            Player p = playerList.poll();
            playerList.add(p);

            String name = p.getName();
            Integer position = p.getPosition();
            Integer initialPos = position;
            Integer num = d.rollDice();

            position+=num;

            int cordX = position/boardSize;
            int cordY = position%boardSize;

            if(Objects.nonNull(board.getCells()[cordX][cordY].getJump())){
                position = board.getCells()[cordX][cordY].getJump().getEnd();
                System.out.println("player " + name + " got a " + board.getCells()[cordX][cordY].getJump());
            }

            if(position>=boardSize*boardSize-1){
                System.out.println("player " + name +" has won the game ");
                break;
            }

            //ye krna bhi to zruri hai fir
            //vo parking lot mei list wala scene alag tha, yaha integers khud se akag tara se handle hote hai to consume
            //less memory hence its always better to use setters
            p.setPosition(position);

            System.out.println("player " + name + " has moved from " + initialPos + " to " + position);


        }
    }

}
