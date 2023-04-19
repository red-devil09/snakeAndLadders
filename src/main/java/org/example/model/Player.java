package org.example.model;

public class Player {
    private String name;
    private Integer position;

    public Player(String name){
        this.name = name;
        this.position = new Integer(0);
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
