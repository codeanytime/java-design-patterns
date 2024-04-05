package org.thanhch.generic;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * @author thanhch
 * <p>
 * Date: 05/04/2024
 * <p>
 * Class: BaseClass
 */
public class BaseClass<T, ID extends Serializable> {
    Class<ID> idClass;

    public BaseClass(Class<ID> idClass) {
        this.idClass = idClass;
    }

    ID getId(T t) {
        try {
            Method idMethod = t.getClass().getMethod("getId");
            Object idValue = idMethod.invoke(t);
            return (ID) idClass.cast(idValue);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get ID value", e);
        }
    }
}
