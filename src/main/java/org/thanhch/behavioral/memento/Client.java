package org.thanhch.behavioral.memento;

/**
 * @author thanhch
 * <p>
 * Date: 19/05/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        Originator origin = new Originator("initial state");
        CareTaker careTaker = new CareTaker();

        careTaker.saveState(origin.createMemento());
        System.out.println("Current state is: " +  origin.state);

        origin.state = "state 1";
        careTaker.saveState(origin.createMemento());
        System.out.println("Current state is: " + origin.state);

        origin.state = "state 2";
        careTaker.saveState(origin.createMemento());
        System.out.println("Current state is: " + origin.state);

        System.out.println("------------------");
        origin.restore(careTaker.restoreState(0));
        System.out.println("Current state is: " + origin.state);

    }
}
