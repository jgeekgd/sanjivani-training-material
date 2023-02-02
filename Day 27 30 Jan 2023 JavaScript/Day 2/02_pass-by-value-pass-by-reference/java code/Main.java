public class Main {
  public static void main(String[] args) {
    Car lambo = new Car("Orange");
    Garage.morph(lambo);
    System.out.println(lambo.color);
  }
}
class Car {
  String color;
  Car(String color) {
    this.color = color;
  }
}
class Garage {
  public static void morph(Car customerCar) {
    //customerCar.color = "RED";
    customerCar = null;
  }
}
