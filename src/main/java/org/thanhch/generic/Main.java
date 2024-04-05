package org.thanhch.generic;

/**
 * @author thanhch
 * <p>
 * Date: 05/04/2024
 * <p>
 * Class: Main
 */
public class Main {
    public static void main(String[] args) {
        Class<MyEntityKey> keyClass = MyEntityKey.class;
        BaseClass<MyEntity, MyEntityKey> baseClass = new BaseClass<>(keyClass);
        MyEntity entity = new MyEntity(new MyEntityKey(1));
        MyEntityKey idValue = baseClass.getId(entity);
        System.out.println(baseClass.getId(entity).getClass());
        System.out.println(idValue);
    }
}
