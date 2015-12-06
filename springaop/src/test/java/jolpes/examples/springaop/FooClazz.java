package jolpes.examples.springaop;

public class FooClazz extends BarClazz implements FooIface {

    @Override
    public String getFooIface() {
        return "foo-iface";
    }
    
    public String getFooClazz() {
        return "foo-clazz";
    }

}
