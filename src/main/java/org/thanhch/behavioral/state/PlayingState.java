package org.thanhch.behavioral.state;

/**
 * @author thanhch
 * <p>
 * Date: 14/04/2024
 * <p>
 * Class: PlayingState
 */
public class PlayingState extends State{
    public PlayingState(Game game) {
        super(game);
        System.out.println("--- Game on playing ---");
    }

    @Override
    public void onWelcomeScreen() {
        System.err.println("Not allowed!");
    }

    @Override
    public void onPlaying() {
        System.out.println("Currently playing");
    }

    @Override
    public void onBreak() {
        game.changeState(new BreakState(game));
    }

    @Override
    public void onEnd() {
        game.changeState(new EndState(game));
    }
}
