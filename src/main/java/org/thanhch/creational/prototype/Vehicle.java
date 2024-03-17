package org.thanhch.creational.prototype;

/**
 * @author thanhch
 * <p>
 * Date: 16/03/2024
 * <p>
 * Class: Vehicle
 */
public abstract class Vehicle {
    public int wheels;
    public long price;

    public Vehicle() {
    }

    public Vehicle(Vehicle target) {
        if (target != null) {
            this.wheels = target.wheels;
            this.price = target.price;
        }
    }

    public abstract Vehicle clone();
    public abstract boolean isClone(Vehicle target);
}
