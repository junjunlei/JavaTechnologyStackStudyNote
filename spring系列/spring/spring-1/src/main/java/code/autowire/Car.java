package code.autowire;

/**
 * bean自动装配测试类
 * @author Jerry
 * @create 2019-10-22 9:37
 */
public class Car {
    private String brand;
    private Double price;

    public Car() {
    }

    public Car(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Person{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
