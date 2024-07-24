package com.lp.game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * 马踏棋盘
 */
public class HorseBoardGame {
    static int x = 6;
    static int y = 6;
    static int step = 0;
    HashMap<Integer, HorseBoard> horseBoards;
    HashMap<String, HorseBoard> stringHorseBoardHashMap;


    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        HorseBoardGame.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        HorseBoardGame.y = y;
    }

    @Test
    public void Test() {
        horseBoards = new HashMap<>();
        stringHorseBoardHashMap = new HashMap<>();

        int a = 3;
        int b = 3;
        horseBoards.put(0, new HorseBoard(a, b));
        stringHorseBoardHashMap.put(a + "-" + b, new HorseBoard(a, b));
        long start = System.currentTimeMillis();
        boolean b1 = hosreRun(new HorseBoard(a, b));
        long end = System.currentTimeMillis();
        System.out.println(stringHorseBoardHashMap.size());
        System.out.println("耗时=" + (end - start));
        for (int i = 0; i < getY(); i++) {
            for (int j = 0; j < getX(); j++) {
                System.out.print("\t"+stringHorseBoardHashMap.get(i + "-" + j).getSortNo());
            }
            System.out.println("");
        }
    }

    public boolean hosreRun(HorseBoard horseBoard) {
        int have = 0;
        ArrayList<HorseBoard> next = getNext(horseBoard.getX(), horseBoard.getY());
        step++;
        horseBoard.setSortNo(step);
        stringHorseBoardHashMap.put(horseBoard.getX() + "-" + horseBoard.getY(), horseBoard);
        if (next.size()==0  && step == getX() * getY()) {
            return true;
        }
        if (next == null){
            return false;
        }
        next.sort(new Comparator<HorseBoard>() {
            @Override
            public int compare(HorseBoard o1, HorseBoard o2) {
                return getNext(o1.getX(), o1.getY()).size() - getNext(o2.getX(), o2.getY()).size();
            }
        });
        System.out.println(horseBoard.getX() + "-" + horseBoard.getY() + "step=" + step);
        for (int i = 0; i < next.size(); i++) {
            HorseBoard nexted = next.get(i);
            if (stringHorseBoardHashMap.containsKey(nexted.getX() + "-" + nexted.getY())) continue;
            if (hosreRun(nexted)) {
                have = 1;
                break;
            }

        }
        if (have == 1) {
            return true;
        }
        step--;
        stringHorseBoardHashMap.remove(horseBoard.getX()+"-"+horseBoard.getY(),horseBoard);
        return false;
    }

    public ArrayList<HorseBoard> getNext(int x, int y) {
        int tempx = 0;
        int tempy = 0;
        ArrayList<HorseBoard> list = new ArrayList<>();
        if ((tempx = (x - 2)) >= 0 && (tempy = (y - 1)) >= 0) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        if ((tempx = (x - 1)) >= 0 && (tempy = (y - 2)) >= 0) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        if ((tempx = (x + 1)) < getX() && (tempy = (y - 2)) >= 0) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        if ((tempx = (x + 2)) < getX() && (tempy = (y - 1)) >= 0) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        if ((tempx = (x + 2)) < getX() && (tempy = (y + 1)) < this.getY()) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        if ((tempx = (x + 1)) < getX() && (tempy = (y + 2)) < this.getY()) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        if ((tempx = (x - 1)) >= 0 && (tempy = (y + 2)) < this.getY()) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        if ((tempx = (x - 2)) >= 0 && (tempy = (y + 1)) < this.getY()) {
            if (!stringHorseBoardHashMap.containsKey(tempx + "-" + tempy)) list.add(new HorseBoard(tempx, tempy));
        }
        return list;
    }
}

