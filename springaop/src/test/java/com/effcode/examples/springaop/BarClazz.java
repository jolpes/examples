package com.effcode.examples.springaop;

public class BarClazz implements BarIface {
    
    @Override
    public String getBarIface() {
        return "bar-iface";
    }

    public String getBarClazz() {
        return "bar-clazz";
    }
}
