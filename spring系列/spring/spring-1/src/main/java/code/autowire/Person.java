package code.autowire;

/**
 * bean自动装配测试类
 * @author Jerry
 * @create 2019-10-22 9:38
 */
public class Person {
    private String name;
  private Car car;
  private Address address;

    public Person() {

    }

    public Person(String name, Car car, Address address) {
        this.name = name;
        this.car = car;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", address=" + address +
                '}';
    }
}

