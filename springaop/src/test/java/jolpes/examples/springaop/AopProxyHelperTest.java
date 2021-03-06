package jolpes.examples.springaop;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jolpes.examples.springaop.AopProxyHelper;

public class AopProxyHelperTest {

    @Test
    public void testGetProxy() {
        FooClazz foo = AopProxyHelper.getProxy(new FooClazz(), new PrefixAspect());
        assertTrue(foo.getBarIface().startsWith("aspect-prefix"));
        assertTrue(foo.getBarClazz().startsWith("aspect-prefix"));
        assertTrue(foo.getFooClazz().startsWith("aspect-prefix"));
        assertTrue(foo.getFooIface().startsWith("aspect-prefix"));
    }

}
