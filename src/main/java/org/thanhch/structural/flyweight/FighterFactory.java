package org.thanhch.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thanhch
 * <p>
 * Date: 08/04/2024
 * <p>
 * Class: FighterFactory
 */
public class FighterFactory {
    static Map<Rank, Fighter> fighters = new HashMap<>();

    public static synchronized Fighter getFighter(Rank rank)  {
        Fighter fighter = fighters.get(rank);
        if (fighter == null) {
            waitingCreateFighters();
            fighter = new Fighter(rank);
            fighters.put(rank, fighter);
        }
        return fighter;
    }

    private static void waitingCreateFighters() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
