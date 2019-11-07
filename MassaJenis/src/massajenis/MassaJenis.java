/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massajenis;

import java.util.Scanner;

/**
 * NAMA      : Moch Rizki Maulana N
 * KELAS     : IF-1
 * NIM       : 10118012
 * Deskripsi Program   : Program ini berisi program menghitung massa jenis
 *
 * @author Moch Rizki Maulana N
 */
public class MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        Kubus K=new Kubus();
        
        System.out.println("===== Massa Jenis Kubus =====");
        System.out.print("Sisi : ");
        K.setSisi(input.nextInt());
        System.out.print("Massa : ");
        K.setMassa(input.nextInt());
        
        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("Volume : "+K.hitungVolume(K.getSisi()));
        System.out.println("Massa Jenis : "+K.hitungMassaJenis(K.getMassa(),K.hitungVolume(K.getSisi())));
        
        
    }
    
}
