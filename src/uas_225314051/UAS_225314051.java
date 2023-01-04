package uas_225314051;
/**
 *
 * @author owner
 */
public class UAS_225314051 {

    public static void main(String[] args) {
        int[] deforestasi = {5, 1500, 266, 32, 7500, 94, 130, 108, 2190, 75};
        tampilkanData(deforestasi);
    }

    static String checkZona(int data) {
        if (data < 100) {
            return "Hijau";
        } else if (data > 100 && data <= 1000) {
            return "Orange";
        } else if (data > 1000) {
            return "Merah";
        } else {
            return "Tidak ada Data";
        }
    }

    static int jmlhTotal(int[] data) {
        int jumlah = 0;
        for (int a : data) {
            jumlah += a;
        }
        return jumlah;
    }

    static double rataRata(int[] data) {
        int panjangData = data.length;
        int jumlahTotal = jmlhTotal(data);
        return (double) jumlahTotal/panjangData;
    }

    static int jmlHijau(int[] data) {
        int jumlah = 0;
        String cek;
        for (int a : data) {
            cek = checkZona(a);
            if (cek.equalsIgnoreCase("hijau")) {
                jumlah++;
            }
        }
        return jumlah;
    }

    static int jmlOrange(int[] data) {
        int jumlah = 0;
        String cek;
        for (int a : data) {
            cek = checkZona(a);
            if (cek.equalsIgnoreCase("orange")) {
                jumlah++;
            }
        }
        return jumlah;
    }

    static int jmlMerah(int[] data) {
        int jumlah = 0;
        String cek;
        for (int a : data) {
            cek = checkZona(a);
            if (cek.equalsIgnoreCase("merah")) {
                jumlah++;
            }
        }
        return jumlah;
    }

    static void tampilkanData(int[] jumlahArea) {
        System.out.println("Daerah Jml area  Kategori");
        System.out.println("============================");
        for (int a = 0; a < jumlahArea.length; a++) {
            System.out.println(a + 1 + " \t " + jumlahArea[a] + " \t  " + checkZona(jumlahArea[a]));

        }
        System.out.println("============================");
        System.out.println("Jumlah total area         = " + jmlhTotal(jumlahArea));
        System.out.println("Rata - rata jumlah area   = " + rataRata(jumlahArea));
        System.out.println("Jumlah daerah zona hijau  = " + jmlHijau(jumlahArea));
        System.out.println("Jumlah daerah zona orange = " + jmlOrange(jumlahArea));
        System.out.println("Jumlah daerah zona merah  = " + jmlMerah(jumlahArea));
    }
}
