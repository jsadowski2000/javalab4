public class Pracownik implements PracownikI{
    int wyplata;
    int ileH;
    String dzial;
    public void wyplata (int value){
        this.wyplata = value;
    }

    public int getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }
    public String dzial(String dzial){
        return dzial;
    }
    public void ileH(int value){
        this.ileH=value;
    }

    public int getIleH() {
        return ileH;
    }

    public void setIleH(int ileH) {
        this.ileH = ileH;
    }

    @Override
    public String toString() {
        return "Pracownik{" +

                ", ileH=" + ileH +
                ", dzial='" + dzial +
                "wyplata=" + wyplata + '\'' +
                '}';
    }
}
