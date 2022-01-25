public class Student implements StudentI {
    int semestr;
    String wydzial;
    int nrIndeksu;


    public int nrIndeksu(int indeks){
        return nrIndeksu;
    }

    public String wydzial(String wydzial){
        return wydzial;
    }

    public void semestr(int value) {
        this.semestr =value;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Wydzial=" + wydzial +
                "Indeks=" + nrIndeksu +
                "Semestr=" + semestr +

                '}';
    }
}
