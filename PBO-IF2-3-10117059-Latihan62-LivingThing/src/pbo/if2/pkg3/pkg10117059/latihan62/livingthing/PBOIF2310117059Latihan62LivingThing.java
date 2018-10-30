/*
 * NAMA       : Nizar Fauzi Ryamizard
 * KELAS      : IF-2
 * NIM        : 10117059
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Data Living Thing
 */
package pbo.if2.pkg3.pkg10117059.latihan62.livingthing;

/**
 *
 * @author kitttyyyy
 */
public class PBOIF2310117059Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        Human nHuman = new Human();
        nHuman.setNama("Rizki Adam Kurniawan");
        nHuman.walk(nHuman.getNama());       
        nHuman.breath("Rizki Adam Kurniawan");
        nHuman.eat("Rizki Adam Kurniawan");
    }
    
}
