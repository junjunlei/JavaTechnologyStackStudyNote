package code.scope;

import code.autowire.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的作用域测试
 * @author Jerry
 * @create 2019-10-22 10:45
 */
public class ScopeTest {
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext-scope.xml");

    /**
     * singleton 单例
     * 在初始化容器的时候就实例化bean
     * bean作用域默认singleton
     */
    @Test
    public void test01(){
        Car car01= (Car) applicationContext.getBean("car");
        Car car02= (Car) applicationContext.getBean("car");
        //true
        System.out.println(car01==car02);
    }

    /**
     * prototype 原型
     * 每次在调用getBean的时候都会创建一个新的实例
     */
    @Test
    public void test02(){
        Car car01= (Car) applicationContext.getBean("car02");
        Car car02= (Car) applicationContext.getBean("car02");
        //false
        System.out.println(car01==car02);
    }

    /**
     * request
     * 该作用域在每次HTTP请求都会创建一个新得到Bean,该作用域仅适用于
     * WebApplicationContext环境
     */

    /**
     * session
     * 同一个HTTP Session共享一个Bean,不同的HTTP Session使用不同的Bean.该作用域
     * 仅适用于 WebApplicationContext环境
     */
}
