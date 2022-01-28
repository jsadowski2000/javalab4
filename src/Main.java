import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        Kwadrat kwadrat1 = new Kwadrat();
        kwadrat1.a=5;
        kwadrat1.figura="Kwadrat";
        System.out.println(kwadrat1.figura);
        System.out.println("Pole kwadratu = " + kwadrat1.pole());
        System.out.println("Obwod kwadratu = " + kwadrat1.obwod());
        Prostokat prostokat1 = new Prostokat();
        prostokat1.a= 5;
        prostokat1.b = 10;
        prostokat1.figura="Prostokat";
        System.out.println(prostokat1.figura);
        System.out.println("Pole kwadratu = " + prostokat1.pole());
        System.out.println("Obwod kwadratu = " + prostokat1.obwod());




    }
}
