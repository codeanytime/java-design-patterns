package org.thanhch.behavioral.memento;

import java.util.ArrayList;

/**
 * @author thanhch
 * <p>
 * Date: 19/05/2024
 * <p>
 * Class: CareTaker
 */
public class CareTaker {
    ArrayList<Memento> mementoList = new ArrayList<>();
    public void saveState(Memento memento) {
        mementoList.add(memento);
    }

    public Memento restoreState(int index) {
        return mementoList.get(index);
    }
}
