package org.thanhch.behavioral.state;

/**
 * @author thanhch
 * <p>
 * Date: 14/04/2024
 * <p>
 * Class: EndState
 */
public class EndState extends State{
    public EndState(Game game) {
        super(game);
        System.out.println("--- On end ---");
    }

    @Override
    public void onWelcomeScreen() {
        System.err.println("Not allowed!");
    }

    @Override
    public void onPlaying() {
        System.err.println("Not allowed!");
    }

    @Override
    public void onBreak() {
        System.err.println("Not allowed!");
    }

    @Override
    public void onEnd() {
        System.out.println("Currently on end");
    }
}
