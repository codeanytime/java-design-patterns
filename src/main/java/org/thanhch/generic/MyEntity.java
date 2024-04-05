package org.thanhch.generic;

/**
 * @author thanhch
 * <p>
 * Date: 05/04/2024
 * <p>
 * Class: MyEntity
 */
class MyEntity {
    private MyEntityKey id;

    public MyEntityKey getId() {
        return id;
    }

    public void setId(MyEntityKey id) {
        this.id = id;
    }

    public MyEntity(MyEntityKey id) {
        this.id = id;
    }
}
