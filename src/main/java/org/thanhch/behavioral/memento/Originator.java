package org.thanhch.behavioral.memento;

/**
 * @author thanhch
 * <p>
 * Date: 19/05/2024
 * <p>
 * Class: Originator
 */
public class Originator {
    String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restore(Memento memento) {
        state = memento.state;
    }
}
