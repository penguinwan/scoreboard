package com.jt.scoreboard.api;

/**
 * Created with IntelliJ IDEA.
 * User: superman
 * Date: 6/28/15
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Score {

    private int left;
    private int right;

    public Score(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
