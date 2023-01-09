import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int roll1 = rollDie();
    int roll2 = rollDie();
    int roll3 = rollDie();

    System.out.println("Enter three numbers between 1 and 6:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    if (num1 < 1 || num2 < 1 || num3 < 1 || num1 > 6 || num2 > 6 || num2 > 6) {
      System.out.println("Must be between 1 and 6");
      scan.close();
      System.exit(0);
    }

    int sumNums = num1 + num2 + num3;
    int sumDies = roll1 + roll2 + roll3;

    scan.close();
  }

  public static int rollDie() {
    return (int) (Math.random() * 6 + 1);
  }

  public static boolean checkWin(int sumDies, int sumNumbers) {
    return (sumNumbers > sumDies && sumNumbers - sumDies < 3);
  }
}
