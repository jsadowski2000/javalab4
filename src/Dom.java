public class Dom implements Budynek {
    int liczbaMieszkancow;
    KolorEnum kolorDomu;
    int liczbaOkien;


    public double powierzchnia(double pow) {
        return pow;

    }
    public String adresBudynku(String adres) {
        return adres;
    }
    public int liczbaOkien(int value) {
        return value;
    }
    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;
    }
    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }
    public void setLiczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public void kolorDomu(KolorEnum kolor) {
    this.kolorDomu = KolorEnum.SZARY;
}

    public KolorEnum getKolorDomu() {
        return kolorDomu;
    }

    public void setKolorDomu(KolorEnum kolorDomu) {
        this.kolorDomu = kolorDomu;
    }
    public String mieszkanie (int pietro, int numerMieszkania) {
        return "";
    }

    @Override
    public String toString() {
        return "Dom{" +
                "liczbaMieszkancow=" + liczbaMieszkancow +
                ", kolorDomu=" + kolorDomu +
                '}';
    }
}

