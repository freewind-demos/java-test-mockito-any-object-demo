package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class HelloTest {
  @Test
  public void test1() {
    Util util = mock(Util.class);
    when(util.toString(any(User.class))).thenReturn("###");
    Hello hello = new Hello(util);
    // Note: `any` is a matcher, we should use `mock` to create a mock instance
    // Assert.assertEquals(hello.hello(any(User.class)), "Hello, ###");
    Assert.assertEquals(hello.hello(mock(User.class)), "Hello, ###");
  }

}


