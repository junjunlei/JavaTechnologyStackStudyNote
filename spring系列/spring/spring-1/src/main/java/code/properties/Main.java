package code.properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 外部属性文件测试
 * @author Jerry
 * @create 2019-10-22 11:49
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:ApplicationContext-properties.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
