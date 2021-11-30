package demo;

public class Hello {

    private final Util util;

    public Hello(Util util) {
        this.util = util;
    }

    public String hello(String name) {
        return "Hello, " + this.util.toUpper(name);
    }

}
