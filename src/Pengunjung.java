public class Pengunjung {

    String nama;
    int umur;
    int tinggiBadan;
    int uang;

    public Pengunjung(String visitor, int age, int height, int money) {
        nama = visitor;
        umur = age;
        tinggiBadan = height;
        uang = money;
    }

    // eligible method
    public void eligible () {
        if (umur < 18) {
            System.out.println("Maaf " + nama + ", kamu tidak dapat memasuki kawasan ini!");
        } else if (uang < 50000 && tinggiBadan < 166) {
            int selTinggiBadan = 166 - tinggiBadan;
            int selUang = 50000 - uang;
            System.out.println("Tinggi kamu kurang " + selTinggiBadan + "cm dan kurang uang sebanyak " + selUang + " untuk menaiki wahana favorit! Tapi tenang, kamu dapat menaiki wahana Kuda Putar!");
        } else if (uang < 50000 && tinggiBadan >= 166){
            int selTinggiBadan = 166 - tinggiBadan;
            int selUang = 50000 - uang;
            System.out.println("Kamu kurang uang sebanyak " + selUang + " untuk menaiki wahana favorit, Tapi tenang, kamu dapat menaiki wahana Lontang-Lanting!");
        } else if (uang >= 50000 && tinggiBadan < 166) {
            int selTinggiBadan = 166 - tinggiBadan;
            int selUang = 50000 - uang;
            System.out.println("Tinggi kamu kurang " + selTinggiBadan  + " untuk menaiki wahana favorit! Tapi tenang, kamu dapat menaiki wahana Trilili!");
        } else {
            System.out.println("Yeay kamu dapat menaiki wahana favorit! Yaitu Kocar-Kacir!");
        }
    }

    public static void main(String[] args) {
        Pengunjung Idaz = new Pengunjung("Idaz", 20, 180, 80000);
        Pengunjung Anggara = new Pengunjung("Anggara", 23, 165, 49000);
        Pengunjung Rahmat = new Pengunjung("Rahmat", 17, 180, 10000);
        Pengunjung Yahya = new Pengunjung("Yahya", 15, 165, 30000);
        Pengunjung Halal = new Pengunjung("Halal", 18, 166, 30000);

        Idaz.eligible();
        Anggara.eligible();
        Rahmat.eligible();
        Yahya.eligible();
        Halal.eligible();
    }
}
