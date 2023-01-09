public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 10000, 2023, "Green", new String[] { "Wheel", "Brake" });
    Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] { "Seat", "Battery" });
    Car nissan2 = new Car(nissan);

    System.out.println(nissan);
    System.out.println(dodge);
    System.out.println(nissan2);
  }

}