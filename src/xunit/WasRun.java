package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun extends TestCase {
    public Boolean wasRun= false;

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        wasRun = true;
    }

}
