package org.thanhch.creational.prototype;

/**
 * @author thanhch
 * <p>
 * Date: 16/03/2024
 * <p>
 * Class: Car
 */
public class Car extends Vehicle {
    private String color;

    public Car(int wheels, long price, String color) {
        this.wheels = wheels;
        this.price = price;
        this.color = color;
    }

    public Car(Car target) {
        super(target);
        if (target != null) {
            this.color = target.color;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Car) {
            Car car = (Car) target;
            return car.wheels == wheels && car.price == price && car.color == color;
        }
        return false;
    }
}
