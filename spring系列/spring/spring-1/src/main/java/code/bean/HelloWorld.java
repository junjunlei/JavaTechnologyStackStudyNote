package code.bean;

/**
 * spring学习入门
 * @author Jerry
 * @create 2019-10-21 17:27
 */
public class HelloWorld {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HelloWorld() {
        System.out.println("HelloWorld's Constructor ...");
    }

    public HelloWorld(String userName) {
        this.userName = userName;
    }

    public String sayHello(){
        return "Hello";
    }
}
