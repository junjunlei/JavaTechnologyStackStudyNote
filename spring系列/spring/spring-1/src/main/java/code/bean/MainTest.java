package code.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * @author Jerry
 * @create 2019-10-21 17:29
 */
public class MainTest {
    /**
     * 1.获取IOC容器
     */
    private ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
    @Test
    public void test01(){
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        //bean实例使用
        System.out.println(helloWorld.sayHello());
    }
    @Test
    public void test02(){
        Car car02 = (Car) applicationContext.getBean("car02");
        System.out.println(car02);
    }
    @Test
    public void test03(){
        Car car03 = (Car) applicationContext.getBean("car03");
        System.out.println(car03);
    }
    @Test
    public void test04(){
        Car car04 = (Car) applicationContext.getBean("car04");
        System.out.println(car04);
    }
    @Test
    public void test05(){
        Person person01= (Person) applicationContext.getBean("person01");
        System.out.println(person01);
    }
    @Test
    public void test06(){
        Person person02= (Person) applicationContext.getBean("person02");
        System.out.println(person02);
    }
    @Test
    public void test07(){
        Person person03= (Person) applicationContext.getBean("person03");
        System.out.println(person03);
    }
    @Test
    public void test08(){
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
}
