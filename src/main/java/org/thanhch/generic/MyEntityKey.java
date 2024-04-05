package org.thanhch.generic;

import java.io.Serializable;

/**
 * @author thanhch
 * <p>
 * Date: 05/04/2024
 * <p>
 * Class: MyEntityKey
 */
public class MyEntityKey implements Serializable {
    private int id;

    public MyEntityKey(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyEntityKey{" +
                "id=" + id +
                '}';
    }
}
