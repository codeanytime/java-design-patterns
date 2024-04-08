package org.thanhch.structural.flyweight;

/**
 * @author thanhch
 * <p>
 * Date: 08/04/2024
 * <p>
 * Class: Fighter
 */
public class Fighter implements Sprite{
    private Rank rank;

    public Fighter(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public void draw() {
        System.out.println("Drawing fighter");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving to position: " + x + ", " + y);
    }
}
