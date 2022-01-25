import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        Student student1 = new Student();
        student1.nrIndeksu(44432);
        student1.wydzial("INFORMATYCZNY");
        student1.semestr(4);

        Student student2 = new Student();
        student2.nrIndeksu(22222);
        student2.wydzial("FIZYCZNY");
        student2.semestr(3);

        System.out.println(student1);
        System.out.println(student2);

        Pracownik pracownik1 = new Pracownik();
        pracownik1.wyplata(3500);
        pracownik1.dzial("SEKRETARIAT");
        pracownik1.ileH(164);

        Pracownik pracownik2 = new Pracownik();
        pracownik2.wyplata(4800);
        pracownik2.dzial("KSIEGOWOSC");
        pracownik2.ileH(120);
        System.out.println(pracownik1);
        System.out.println(pracownik2);



        /* zad.3

        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów


        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
    }
}
