import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wybor;

        do {
            System.out.println("\n=== KALKULATOR ===");
            System.out.println("Wybierz działanie:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Pole Prostokąta (a * b)");
            System.out.println("6. Pole Trójkąta (wzór Herona)");
            System.out.println("7. Suma kwadratów a, b i c");
            System.out.println("8. Najmniejsza z liczb a, b, c");
            System.out.println("0. Wyjście z programu");
            System.out.print("Twój wybór: ");

            // Sprawdzenie, czy użytkownik podał liczbę
            while (!scanner.hasNextInt()) {
                System.out.println("Błąd: podaj liczbę od 0 do 8!");
                System.out.print("Twój wybór: ");
                scanner.next();
            }

            wybor = scanner.nextInt();

            switch (wybor) {
                case 1 -> {
                    System.out.print("Podaj liczbę a: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Podaj liczbę b: ");
                    double b1 = scanner.nextDouble();
                    System.out.println("Suma: " + (a1 + b1));
                }
                case 2 -> {
                    System.out.print("Podaj liczbę a: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Podaj liczbę b: ");
                    double b2 = scanner.nextDouble();
                    System.out.println("Różnica: " + (a2 - b2));
                }
                case 3 -> {
                    System.out.print("Podaj liczbę a: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Podaj liczbę b: ");
                    double b3 = scanner.nextDouble();
                    System.out.println("Iloczyn: " + (a3 * b3));
                }
                case 4 -> {
                    System.out.print("Podaj liczbę a: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Podaj liczbę b: ");
                    double b4 = scanner.nextDouble();
                    if (b4 == 0) {
                        System.out.println("Nie można dzielić przez zero!");
                    } else {
                        System.out.println("Iloraz: " + (a4 / b4));
                    }
                }
                case 5 -> {
                    System.out.print("Podaj długość boku a: ");
                    double a5 = scanner.nextDouble();
                    System.out.print("Podaj długość boku b: ");
                    double b5 = scanner.nextDouble();
                    if (a5 <= 0 || b5 <= 0) {
                        System.out.println("Nie można obliczyć pola prostokąta z liczb mniejszych lub równych zero!");
                    } else {
                        System.out.println("Pole prostokąta: " + (a5 * b5));
                    }
                }
                case 6 -> {
                    System.out.print("Podaj bok a: ");
                    double a6 = scanner.nextDouble();
                    System.out.print("Podaj bok b: ");
                    double b6 = scanner.nextDouble();
                    System.out.print("Podaj bok c: ");
                    double c6 = scanner.nextDouble();
                    double p = (a6 + b6 + c6) / 2;
                    if (a6 + b6 > c6 && a6 + c6 > b6 && b6 + c6 > a6) {
                        double pole = Math.sqrt(p * (p - a6) * (p - b6) * (p - c6));
                        System.out.println("Pole trójkąta: " + pole);
                    } else {
                        System.out.println("Z podanych boków nie można zbudować trójkąta!");
                    }
                }
                case 7 -> {
                    System.out.print("Podaj liczbę a: ");
                    double a7 = scanner.nextDouble();
                    System.out.print("Podaj liczbę b: ");
                    double b7 = scanner.nextDouble();
                    System.out.print("Podaj liczbę c: ");
                    double c7 = scanner.nextDouble();
                    System.out.println("Suma kwadratów: " + (a7 * a7 + b7 * b7 + c7 * c7));
                }
                case 8 -> {
                    System.out.print("Podaj liczbę a: ");
                    double a8 = scanner.nextDouble();
                    System.out.print("Podaj liczbę b: ");
                    double b8 = scanner.nextDouble();
                    System.out.print("Podaj liczbę c: ");
                    double c8 = scanner.nextDouble();
                    double min = Math.min(a8, Math.min(b8, c8));
                    System.out.println("Najmniejsza z liczb: " + min);
                }
                case 0 -> System.out.println("Zamykanie programu... Do zobaczenia!");
                default -> System.out.println("Błąd: wybierz cyfrę od 0 do 8!");
            }

        } while (wybor != 0);

        scanner.close();
    }
}
