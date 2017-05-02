package com.junzew.pomodoro.state;

import com.junzew.pomodoro.MainActivity;

/**
 * Created by junze on 2017-05-02.
 */

public class LongBreakState extends State {

    private LongBreakState() {
        this.stateName = states[2];
        this.duration = 15;
        this.isBreak = true;
    }
    private static LongBreakState INSTANCE;
    public static State getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LongBreakState();
        }
        return INSTANCE;
    }


    @Override
    public void next(MainActivity context) {
        context.setState(PomodoroState.getInstance());
    }

    @Override
    public String toString() {
        return "LongBreakState{}";
    }


}
