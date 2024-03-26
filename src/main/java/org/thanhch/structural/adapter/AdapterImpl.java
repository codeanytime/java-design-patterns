package org.thanhch.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 26/03/2024
 * <p>
 * Class: AdapterImpl
 */
public class AdapterImpl implements Adapter {
    @Override
    public List<LibData> convert(List<MyData> input) {
        List<LibData> output = new ArrayList<>();
        for (MyData data : input) {
            output.add(new LibData(data.position, String.valueOf(data.amount)));
        }
        return output;
    }
}
