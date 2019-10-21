package code.bean;

import java.util.List;

/**
 * @author Jerry
 * @create 2019-10-21 19:59
 */
public class Person {
    private String personName;
    private List<Car> carList;

    public Person() {
    }

    public Person(String personName, List<Car> carList) {
        this.personName = personName;
        this.carList = carList;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", carList=" + carList +
                '}';
    }
}
