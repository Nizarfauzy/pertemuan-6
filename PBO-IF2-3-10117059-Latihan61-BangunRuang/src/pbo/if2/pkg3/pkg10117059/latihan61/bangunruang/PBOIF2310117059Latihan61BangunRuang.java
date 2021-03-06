/*
 * NAMA       : Nizar Fauzi Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Data Bangun Ruang.
 */
package pbo.if2.pkg3.pkg10117059.latihan61.bangunruang;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        Bola nBola = new Bola();
        Tabung nTabung = new Tabung();
        Kerucut nKerucut = new Kerucut();

        nBola.setR(7);
        System.out.println("1. Volume Bola :");
        System.out.printf("   Hasil = %,12.1f%n", (double) nBola.hitungVolume());
        System.out.println("");

        nTabung.setH(21);
        nTabung.setR(10);
        System.out.println("2. Volume Tabung : ");
        System.out.println("Hasil = " + (int) nTabung.hitungVolume());
        System.out.println("");

        nKerucut.setR(14);
        nKerucut.setT(9);

        System.out.println("3. Volume Kerucut : ");
        System.out.println("   Hasil = " + (int) nKerucut.hitungVolume());
    }
    
}
