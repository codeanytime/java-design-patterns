package org.thanhch.behavioral.state;

/**
 * @author thanhch
 * <p>
 * Date: 14/04/2024
 * <p>
 * Class: State
 */
public abstract class State {
    public Game game;

    public State(Game game) {
        this.game = game;
    }

    public abstract void onWelcomeScreen();
    public abstract void onPlaying();
    public abstract void onBreak();
    public abstract void onEnd();
}
