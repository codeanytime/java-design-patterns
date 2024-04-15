package org.thanhch.behavioral.state;

/**
 * @author thanhch
 * <p>
 * Date: 14/04/2024
 * <p>
 * Class: BreakState
 */
public class BreakState extends State{
    public BreakState(Game game) {
        super(game);
        System.out.println("--- On break state ---");
    }

    @Override
    public void onWelcomeScreen() {
        System.err.println("Not allowed!");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Currently on break");
    }

    @Override
    public void onEnd() {
        System.err.println("Not allowed!");
    }
}
