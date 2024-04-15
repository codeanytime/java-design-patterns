package org.thanhch.behavioral.state;

/**
 * @author thanhch
 * <p>
 * Date: 14/04/2024
 * <p>
 * Class: WelcomeState
 */
public class WelcomeState extends State{
    public WelcomeState(Game game) {
        super(game);
        System.out.println("--- Game in welcome state ---");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Currently on welcome state");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.err.println("Not allowed!");
    }

    @Override
    public void onEnd() {
        System.err.println("Not allowed!");
    }
}
