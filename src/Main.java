import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę: ");
    double a = scanner.nextDouble();
    System.out.println("Podaj drugą liczbę: ");
    double b = scanner.nextDouble();
    System.out.println("Suma liczb: " + (a + b ));
  }
}