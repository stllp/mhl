package com.lp.game;

public class HorseBoard {
    int x;
    int y;
    int sortNo;
//    boolean loop;

    public HorseBoard() {
    }

    public HorseBoard(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSortNo() {
        return sortNo;
    }

    public void setSortNo(int sortNo) {
        this.sortNo = sortNo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
