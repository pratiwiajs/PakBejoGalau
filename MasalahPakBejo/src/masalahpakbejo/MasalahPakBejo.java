/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masalahpakbejo;
/* Pak Bejo ingin memasang keramik untuk lantai rumahnya yang berukuran luas total 100 m2 .
Sesampainya di toko keramik, Pak Bejo kebingungan dikarenakan ada 3 pilihan keramik yang menurutnya bagus, yaitu:
• Keramik A:
Ukuran: 30 cm x 30 cm
Harga per box (isi 10 pcs): Rp 54.000
• Keramik B:
Ukuran: 40 cm x 40 cm
Harga per box (isi 5 pcs): Rp 65.000
• Keramik C:
Ukuran: 30 cm x 40 cm
Harga per box (isi 8 pcs): Rp 60.000 */

/**
 *
 * @author pratiwiajs
 */
public class MasalahPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi -> proses membuat obyek */
        
        /*Keramik A*/
        Keramik keramikA = new Keramik ();
        keramikA.harga = 54000;
        keramikA.panjang = 30;
        keramikA.lebar = 30;
        keramikA.perBox = 10;
        keramikA.macam = 'A';
        keramikA.luasKeramikPerBox();
        keramikA.jumlahBox();
        keramikA.harganya();
        
        
        /*Keramik B*/
        Keramik keramikB = new Keramik ();
        keramikB.harga = 65000;
        keramikB.panjang = 40;
        keramikB.lebar = 40;
        keramikB.perBox = 5;
        keramikB.macam = 'B';
        keramikB.luasKeramikPerBox();
        keramikB.jumlahBox();
        keramikB.harganya();
        
        
        /*Keramik C*/
        Keramik keramikC = new Keramik ();
        keramikC.harga = 60000;
        keramikC.panjang = 30;
        keramikC.lebar = 40;
        keramikC.perBox = 8;
        keramikC.macam = 'C';
        keramikC.luasKeramikPerBox();
        keramikC.jumlahBox();
        keramikC.harganya();
        
        
        
        /*Sehingga Keramik Termurah dan sesuai kebutuhan adalah Keramik A*/
       Keramik yangMurah = new Keramik();
       yangMurah.macam = 'A';
       yangMurah.murah();
        
                
    }
    
}
