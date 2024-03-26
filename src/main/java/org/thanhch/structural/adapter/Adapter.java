package org.thanhch.structural.adapter;

import java.util.List;

/**
 * @author thanhch
 * <p>
 * createdDate: 26/03/2024
 * Interface Adapter
 */
public interface Adapter {
    List<LibData> convert(List<MyData> input);
}
