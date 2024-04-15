package org.thanhch.behavioral.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author thanhch
 * <p>
 * Date: 14/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        Game game = new Game();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        do {
            System.out.print("--- Please input command ---");
            try {
                input = reader.readLine().trim().toLowerCase();
                switch (input) {
                    case "w":
                        game.state.onWelcomeScreen();
                        break;
                    case "p":
                        game.state.onPlaying();
                        break;
                    case "b":
                        game.state.onBreak();
                        break;
                    case "e":
                        game.state.onEnd();
                        break;
                    default:
                        System.out.println("--- Unknown command ---");
                        break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (input != "exit");
    }
}
