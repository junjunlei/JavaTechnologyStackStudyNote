package code.bean;

/**
 * 汽车实体类测试依赖注入
 * @author Jerry
 *  @create 2019-10-21 19:12
 */
public class Car {
    private String carName;
    private Double carPrice;
    private String carProduce;
    private Integer maxSpeed;

    public Car(String carName, Double carPrice, String carProduce, Integer maxSpeed) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carProduce = carProduce;
        this.maxSpeed = maxSpeed;
    }

    public Car(String carName, Double carPrice, String carProduce) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.carProduce = carProduce;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carProduce='" + carProduce + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarProduce() {
        return carProduce;
    }

    public void setCarProduce(String carProduce) {
        this.carProduce = carProduce;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}