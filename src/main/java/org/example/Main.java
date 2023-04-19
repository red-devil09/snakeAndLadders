package org.example;


import org.example.model.Game;
import org.example.model.Player;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("game1");
        Player p1 = new Player("nikhil");
        Player p2 = new Player("yadav");

        game.addPlayer(p1);
        game.addPlayer(p2);

        game.startGame(10,15,10);
    }
}