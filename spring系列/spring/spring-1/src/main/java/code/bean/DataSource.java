package code.bean;

import java.util.Properties;

/**
 * 属性值
 * @author Jerry
 * @create 2019-10-21 20:41
 */
public class DataSource {
    private Properties properties;

    public DataSource(Properties properties) {
        this.properties = properties;
    }

    public DataSource() {
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
