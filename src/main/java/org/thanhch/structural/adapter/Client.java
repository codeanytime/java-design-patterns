package org.thanhch.structural.adapter;

import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        List<MyData> input = new MyDataGenerator().generateData();
        Adapter adapter = new AdapterImpl();
        List<LibData> output = adapter.convert(input);
        output.forEach(dd -> {
            dd.displayData(dd.index, dd.data);
        });
    }
}
