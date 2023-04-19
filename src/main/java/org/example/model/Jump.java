package org.example.model;


public class Jump {
    private int start;
    private int end;

    public Jump(int start,int end){
        this.start = start;
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public String toString(){
        return " jump from " + start + " to " + end;
    }
}
