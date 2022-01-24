public class Main {
    public static void main(String[] args) {


  /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */
        Dom dom1 = new Dom();
        dom1.setKolorDomu(KolorEnum.KREMOWY);
        dom1.setLiczbaMieszkancow(5);
        dom1.setLiczbaOkien(0);
        dom1.powierzchnia(100.00);
        dom1.adresBudynku("Porucznia.Macieja");
        System.out.println(dom1);

        Budynek budynek1 = new Dom ();
        //budynek1.setKolorDomu(KolorEnum.KREMOWY);
        //budynek1.setLiczbaMieszkancow(5);
        //budynek1.setLiczbaOkien(0);
        //budynek1.powierzchnia(100.00);
        //budynek1.adresBudynku("Porucznia.Macieja");



    }
}
