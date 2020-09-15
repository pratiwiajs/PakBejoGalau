/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masalahpakbejo;

/**
 *
 * @author pratiwiajs
 */
public class Keramik {
    /* membuat atribut */
    int panjang, lebar, butuh = 1000000, perBox, harga, hargaTotal, luasKeramik, totalBox;
    char macam;
    
    /* membuat method */
    void luasKeramikPerBox(){
        luasKeramik = this.panjang * this.lebar * this.perBox;
        System.out.println(("Luas Keramik") + this.macam + (" satu boxnya adalah " + luasKeramik + " cm"));
    }
    
    void jumlahBox(){
        totalBox = this.butuh / this.luasKeramik;
        System.out.println(("Jumlah box keramik ") + this.macam + (" yang diperlukan untuk mencukupi kebutuhan Pak Budi adalah " + totalBox ));
    
    }
    
    void harganya() {
        hargaTotal = this.totalBox * this.harga;
        System.out.println(("Uang yang harus dikeluarkan untuk membeli keramik ") + this.macam + (" totalnya adalah " + hargaTotal ));
    }
    
    
    void murah(){
        System.out.println(("Dapat disimpulkan keramik dengan harga paling murah dan sesuai dengan kebutuhan Pak Budi adalah Keramik ") + this.macam );
    }
}

