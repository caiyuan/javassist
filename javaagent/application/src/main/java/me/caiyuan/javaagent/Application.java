package me.caiyuan.javaagent;

/**
 * @author Ryan
 */
public class Application {

    static Welcome welcome = new Welcome();

    public static void main(String[] args) {
        System.out.println("Application.main()");
        welcome.welcome("Tom");
    }
}
