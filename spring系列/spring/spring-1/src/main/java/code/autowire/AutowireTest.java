package code.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean自动装配测试
 *
 * @author Jerry
 * @create 2019-10-22 9:52
 */
public class AutowireTest {
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext-autowire.xml");

    @Test
    public void test01() {
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

}
