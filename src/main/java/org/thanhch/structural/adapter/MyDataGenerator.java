package org.thanhch.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: MyDataGenerator
 */
public class MyDataGenerator {
    public List<MyData> generateData() {
        List<MyData> list = new ArrayList<>();
        list.add(new MyData(1, 10));
        list.add(new MyData(2, 29));
        list.add(new MyData(3, 30));
        return list;
    }
}
