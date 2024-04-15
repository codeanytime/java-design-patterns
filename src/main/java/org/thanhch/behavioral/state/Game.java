package org.thanhch.behavioral.state;

/**
 * @author thanhch
 * <p>
 * Date: 14/04/2024
 * <p>
 * Class: Game
 */
public class Game {
    public State state = new WelcomeState(this);
    public void changeState(State state) {
        this.state = state;
    }
}
