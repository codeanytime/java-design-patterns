package org.thanhch.structural.flyweight;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Random;

/**
 * @author thanhch
 * <p>
 * Date: 08/04/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int toDraw = 10;
        Army army = new Army();
        Rank currentRank;
        Random random = new Random();

        for (int i = 0; i < toDraw; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    currentRank = Rank.PRIVATE;
                    break;
                case 1:
                    currentRank = Rank.SERGEANT;
                    break;
                default:
                    currentRank = Rank.MAJOR;
            }
            army.spawnFighter(currentRank);
        }
        army.drawArmy();
        long endTime = System.currentTimeMillis();
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
    }
}
