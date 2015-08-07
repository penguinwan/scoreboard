package com.jt.scoreboard.core;

import com.jt.scoreboard.api.Score;

import java.util.Random;

/**
 * Created by superman on 8/7/2015.
 */
public class StorageManager {
    public Score readLatest() {
        Random r = new Random();
        int low = 0;
        int high = 100;
        int left = r.nextInt(high - low) + low;
        int right = r.nextInt(high - low) + low;

        return new Score(left, right);
    }
}
