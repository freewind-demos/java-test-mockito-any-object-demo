package demo;

public class Hello {

  private final Util util;

  public Hello(Util util) {
    this.util = util;
  }

  public String hello(User user) {
    return "Hello, " + this.util.toString(user);
  }

}
