import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Wybierz działanie: ");
    System.out.println("1. Dodawanie");
    System.out.println("2. Odejmowanie");
    System.out.println("3. Mnożenie");
    System.out.println("4. Dzielenie");
    System.out.println("5. Pole Prostokąta(a*b)");
    System.out.println("6. Pole Trójkąta(wzór Herona)");
    System.out.println("7. suma kwadratów a b i c");
    System.out.println("8. Najmniejsza z liczb a b c");
    int wybor = scanner.nextInt();
    
    switch (wybor){
      case 1:
        System.out.println("Podaj liczbę a: ");
        double a1 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b1 = scanner.nextDouble();
        System.out.println("Suma: " + (a1 + b1));
      break;
      case 2:
        System.out.println("Podaj liczbę a: ");
        double a2 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b2 = scanner.nextDouble();
        System.out.println("Różnica: " + (a2 - b2));
      break;
      case 3:
        System.out.println("Podaj liczbę a: ");
        double a3 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b3 = scanner.nextDouble();
        System.out.println("Iloczyn: " + (a3 * b3));
      break;
      case 4:
        System.out.println("Podaj liczbę a: ");
        double a4 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b4 = scanner.nextDouble();
        if (b4 == 0)
        System.out.println("Nie można dzielić przez zero");
        System.out.println("Iloraz: " + (a4/ b4));
      break;
      case 5:
        System.out.println("Podaj liczbę a: ");
        double a5 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b5 = scanner.nextDouble();
        if (a5 <= 0 || b5 <= 0);
        System.out.println("Nie można obliczyć pola prostokąta z liczb mniejszych lub równych zero");
        System.out.println("Pole Prostokąta: " + (a5 * b5));
      break;
      case 6:
        System.out.println("Podaj liczbę a: ");
        double a6 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b6 = scanner.nextDouble();
        System.out.println("Podaj liczbę c: ");
        double c6 = scanner.nextDouble();
        double p = (a6+b6+c6)/2;
        System.out.println("Pole Trójkąta: " + (Math.sqrt(p*(p-a6)*(p-b6)*(p-c6))));
      break;
      case 7:
        System.out.println("Podaj liczbę a: ");
        double a7 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b7 = scanner.nextDouble();
        System.out.println("Podaj liczbę c: ");
        double c7 = scanner.nextDouble();
        System.out. println("Suma kwadratów: " + (a7*a7 + b7*b7 + c7*c7));
      break;
      case 8:
        System.out.println("Podaj liczbę a: ");
        double a8 = scanner.nextDouble();
        System.out.println("Podaj liczbę b: ");
        double b8 = scanner.nextDouble();
        System.out.println("Podaj liczbę c: ");
        double c8 = scanner.nextDouble();
        System.out.println("Najmniejsza z liczb: " + Math.min(a8, Math.min(b8, c8)));
      break;
    }
    scanner.close();
    }
}