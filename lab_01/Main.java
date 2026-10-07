package com.company;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //ZADANIE 2
        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita n: ");
        int n = scanner.nextInt();
        System.out.println((n%2==0) ? "Liczba jest parzysta." : "Liczba nie jest parzysta");
        System.out.println((n%3==0) ? "Liczba jest podzielna przez 3." : "Liczba nie jest podzielna przez 3");
        int sumOfDigits=0, evenDigits=0;
        for (int i=1; i<=n; i++){
            sumOfDigits+=i;
            if (i%2==0) evenDigits++;
        }
        System.out.println("Suma liczb od 1 do n wynosi: " + sumOfDigits);
        System.out.println("Liczb parzystych jest: " + evenDigits);
         */

        //ZADANIE 3
        /*
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = new int[10];
        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE, sumOfValues=0;
        for (int i=0; i<numberArray.length; i++){
            System.out.println("Wprowadz liczbe nr: " + (i+1));
            numberArray[i] = scanner.nextInt();
            minValue = (minValue < numberArray[i]) ? minValue : numberArray[i];
            maxValue = (maxValue > numberArray[i]) ? maxValue : numberArray[i];
            sumOfValues+=numberArray[i];
        }

        float mean = (float) sumOfValues/10;
        int valuesGreaterThanMean = 0;
        for (int number: numberArray) {
            System.out.println(number);
            if (number > mean) valuesGreaterThanMean++;
        }
        System.out.println("Wartosc najmniejsza: " + minValue);
        System.out.println("Wartosc najwieksza: " + maxValue);
        System.out.println("Suma: " + sumOfValues);
        System.out.println("Srednia: " + mean);
        System.out.println("Suma liczb wiekszych od sredniej: "+ valuesGreaterThanMean);
        */

        //ZADANIE 4
        /*
        Scanner scanner = new Scanner(System.in); //brakujacy srednik, blad wykrywa kompilator

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {  //brakujacy operator porownania (przypisanie zamiast porownania), blad wykrywa kompilator
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); //brakujacy srednik, blad wykrywa kompilator
        }

        for (int i = 0; i <= 5; i++) { //petla nieskonczona (zakladamy ze ma liczyc od 0;5 wtedy -- zamieniamy na ++), blad wykrywany przy dzialaniu programu
            System.out.println(i);
        }

        scanner.close();
        */

        //ZADANIE 5
        /*
        //ODPOWIEDZI PRZED ODPALENIEM: i=undefined (poza petla nic nie znaczy w przeciwnym wypadku, ktoras z tych 0, 1, 2, 3), x=32, wynik=30
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) {
            wynik += x;
            x *= 2;
        }

        System.out.println(x);
        System.out.println(wynik);
        */

        //ZADANIE 6
        /*
        Klasa nr 1: Biblioteka

        Stan:
        - Zawiera liste obiektow czytelnik, liste obiektow ksiazka, i liste wypozyczen

        Odpowiedzialności:
        - pozwala na dodawanie, usuwanie, modyfikowanie dodatkowych ksiazek i czytelnikow
        - pozwala na wypozyczanie ksiazek przez czytelnikow
        - pozwala na sprawdzenie dostepnosci danych ksiazek

        Klasa nr 2: Ksiazka

        Stan:
        - Ma tytuł, autora, ISBN oraz rok wydania

        Odpowiedzialności:
        - zawiera szczegolowe informacje o danej ksiazce i pozwala na ich wyswietlenie

        Klasa nr 3: Czytelnik

        Stan:
        - Ma imię, nazwisko oraz numer karty bibliotecznej.

        Odpowiedzialności:
        - zawiera szczegolowe informacje o danym czytelniku i pozwala na ich wyswietlenie

        Klasa nr 4: Wypozyczenie

        Stan:
        - Ma date wypozyczenia i zwrotu, zawiera referencje do ksiazki i czytelnika.

        Odpowiedzialności:
        - pozwala na przypisanie do siebie czytelnika i ksiazki w celu identyfikacji dat


        Zaleznosci pomiedzy klasami: Biblioteka zawiera w sobie listy obiektow innych klas, wypozyczenie powiazuje ze soba jeden obiekt ksiazka i czytelnik
         */

        //ZADANIE 7
        /*
        Wybrany system Kino
        Klasy: Kino, Sala, Film, Bilet, Seans

        Klasa: Kino
        Stan: Zawiera liste sal, liste filmow, liste biletow, liste seansow
        Odpowiedzialnosci:
        - pozwala na dodawanie, usuwanie, modyfikowanie dodatkowych sal i filmow
        - pozwala na przypisanie/kupienie biletu do danego seansu
        - pozwala na tworzenie nowych seansow

        Klasa: Seans
        Stan: zawiera referencje do filmu, sali, czas rozpoczecia, czas zakonczenia, liczbe zajetych miejsc
        Odpowiedzialnosci:
        - pozwala na laczenie wydarzen w kinie (polacznie filmu, sali)
        - pozwala na sprawdzenie dostepnosci biletow i miejsc

        Klasa: Sala
        Stan: Zawiera nazwe sali, ilosc miejsc
        Odpowiedzialnosci:
        - pozwala na wyswietlenie szczegolowych informacji o sali

        Klasa: Film
        Stan: Zawiera tytul filmu, krotki opis, czas trwania, rezysera
        Odpowiedzialnosci:
        - pozwala na wyswietlenie szczegolowych informacji o filmie

        Klasa: Bilet
        Stan: zawiera referencje seansu, nr miejsca
        Odpowiedzialnosci:
        - przechowuje informacje o bilecie i je udostepnia

        1. Bilet powinien wiedziec o seansie, Kino wie o wszystkich klasach, seans posiada referencje do filmu i sali
        2. Chyba nie
        3, 4.Użytkowników kina, nie ma potrzeby ich dodawanie gdyz bilety nie sa przypisywane na osobe,
         */

        //ZADANIE 8
        /*
        A.
                nr rejestracyjny, vin, przeglad techniczny,  model, marka, rocznik, informacje o silniku, cena wypozyczenia za dzien/tydzien/miesiac, kolor
        B.
                opis pojazdu, wyglad pojazdu, predkosc, przyspieszenie, przyczepnosc, poziom uszkodzen,  cena(albo jej brak w zaleznosci od gry)
        C.
                opis problemu, model, marka, vin, kod silnika, rodzaj paliwa, kolor lakieru, przebieg

        Odpowiedz: Poniewaz klasy tworzymy aby rozwiazac dany problem w strukturze i przechowywac TYLKO!!!! dane potrzebne do jego dzialania (abstraktujemy rzeczywistosc na nasz model),
        jedna klasa na wszystkie modele posiadalaby zbyt duzo niepotrzebnych informacji dla naszego modelu
         */

        //ZADANIE DODATKOWE
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int value = scanner.nextInt();
        int reversedValue = 0;

        while (value!=0){
            int digit = value%10;
            reversedValue = reversedValue*10+digit;
            value/=10;
        }

        System.out.println("Odwrocony numer:" + reversedValue);
         */
    }
}