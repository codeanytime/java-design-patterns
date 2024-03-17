package org.thanhch.creational.prototype;

/**
 * @author thanhch
 * <p>
 * Date: 17/03/2024
 * <p>
 * Class: Bicycle
 */
public class Bicycle extends Vehicle {
    private boolean cityBike;

    public Bicycle(int wheels, long price, boolean cityBike) {
        this.wheels = wheels;
        this.price = price;
        this.cityBike = cityBike;
    }

    public Bicycle(Bicycle target) {
        super(target);
        if (target != null) {
            this.cityBike = target.cityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Bicycle) {
            Bicycle t = (Bicycle) target;
            return t.wheels == wheels && t.price == price && t.cityBike == cityBike;
        }
        return false;
    }
}
