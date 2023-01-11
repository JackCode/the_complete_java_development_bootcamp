public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 10000, 2023, "Green", new String[] { "Wheel", "Brake" });
    Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] { "Seat", "Battery" });
    Car nissan2 = new Car(nissan);

    System.out.println(nissan);
    System.out.println(dodge);
    System.out.println(nissan2);

    Car[] cars = new Car[] {
        new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
        new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
        new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
        new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
        new Car("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" })
    };

    Dealership dealership = new Dealership(cars);
  }

}