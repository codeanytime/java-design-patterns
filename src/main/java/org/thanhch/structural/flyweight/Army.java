package org.thanhch.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 08/04/2024
 * <p>
 * Class: Army
 */
public class Army {
    private List<Fighter> army = new ArrayList<>();

    public void spawnFighter(Rank rank) {
        Fighter f = FighterFactory.getFighter(rank);
        army.add(f);
    }

    public void drawArmy() {
        for (Fighter fighter: army) {
            switch(fighter.getRank()) {
                case PRIVATE:
                    System.out.print("P ");
                    break;
                case SERGEANT:
                    System.out.print("S ");
                    break;
                default:
                    System.out.println("M ");
                    break;
            }
        }
    }
}
