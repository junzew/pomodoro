package com.junzew.pomodoro.state;

import com.junzew.pomodoro.MainActivity;

/**
 * Created by junze on 2017-05-02.
 */

public class ShortBreakState extends State {

    private ShortBreakState() {
        this.stateName = states[1];
        this.duration = 5;
        this.isBreak = true;
    }
    private static ShortBreakState INSTANCE;
    public static State getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ShortBreakState();
        }
        return INSTANCE;
    }


    @Override
    public void next(MainActivity context) {
        context.setState(PomodoroState.getInstance());
    }

    @Override
    public String toString() {
        return "ShortBreakState{}";
    }
}
