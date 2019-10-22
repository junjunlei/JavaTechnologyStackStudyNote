package code.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean之间的关系测试
 *
 * @author Jerry
 * @create 2019-10-22 10:07
 */
public class BeanRelationTest {
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext-relation.xml");

    @Test
    public void test01() {
        Address address = (Address) applicationContext.getBean("address02");
        System.out.println(address);
    }

    @Test
    public void test02() {
        Person person= (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
