package com.springapp.light.util.functionJSP;
import java.beans.PropertyDescriptor;
import org.apache.commons.beanutils.PropertyUtils;


public class FunctionJSP {

    public static boolean hasProperty(Object o, String propertyName) {
        if (o == null || propertyName == null) {
            return false;
        }
        try
        {
            PropertyDescriptor pu = PropertyUtils.getPropertyDescriptor(o, propertyName);
            boolean bool = (pu != null && pu.getWriteMethod() != null && pu.getWriteMethod() != null);
            return bool;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
