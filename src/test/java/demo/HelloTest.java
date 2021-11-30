package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class HelloTest {
    @Test
    public void test1() {
        Util util = mock(Util.class);
        when(util.toUpper(anyString())).thenReturn("###");
        Hello hello = new Hello(util);
        Assert.assertEquals(hello.hello("a"), "Hello, ###");
        Assert.assertEquals(hello.hello("b"), "Hello, ###");
        Assert.assertEquals(hello.hello(anyString()), "Hello, ###");
    }

}


