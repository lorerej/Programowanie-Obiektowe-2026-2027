import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //ZADANIE 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita n: ");
        int n = scanner.nextInt();
        System.out.println((n%2==0) ? "Liczba jest parzysta." : "Liczba nie jest parzysta");
        System.out.println((n%3==0) ? "Liczba jest podzielna przez 3." : "Liczba nie jest podzielna przez 3");
        int sumOfDigits=0, evenDigits=0;
        for (int i=1; i<=n; i++){
            sumOfDigits+=i;
            evenDigits = (i%2==0) ? evenDigits+1 : evenDigits;
        }
        System.out.println("Suma liczb od 1 do n wynosi: " + sumOfDigits);
        System.out.println("Liczb parzystych jest: " + evenDigits);

        //ZADANIE 3

    }
}