package Posttest1;

import java.util.Scanner;
import java.util.ArrayList;

public class MenuAwal {
    public static void main(String[] args){
        System.out.println("Program Jasa Pengiriman Barang");
        System.out.println("Latifah Nur Rahmawati");
        System.out.println("2009106097");
        System.out.println("Informatika B 2020\n\n");

        System.out.println("==============================================");
        System.out.println("||      Jasa Pengiriman Barang              ||");
        System.out.println("==============================================");
        System.out.println("||  [1] Input Data Pengiriman Barang        ||");
        System.out.println("||  [2] Data Pengiriman Barang              ||");
        System.out.println("||  [3] Edit Data                           ||");
        System.out.println("||  [4] Hapus Data                          ||");
        System.out.println("||  [5] Keluar                              ||");
        System.out.println("==============================================");

        Scanner pilihan = new Scanner(System.in);
        System.out.println("Masukkan Pilihan : ");
        int pilih = pilihan.nextInt();
        switch(pilih){
            case(1):
                ArrayList NamaPengirim = new ArrayList();
                ArrayList AlamatPengirim = new ArrayList();
                ArrayList NoTelpPengirim = new ArrayList();
                ArrayList KotaPengirim = new ArrayList();
                ArrayList PropinsiPengirim = new ArrayList();
                ArrayList Barang = new ArrayList();
                ArrayList Berat = new ArrayList();
                ArrayList OngkosKirim = new ArrayList();
                ArrayList NamaPenerima = new ArrayList();
                ArrayList AlamatPenerima = new ArrayList();
                ArrayList NoTelpPenerima = new ArrayList();
                ArrayList KotaPenerima = new ArrayList();
                ArrayList PropinsiPenerima = new ArrayList();
                ArrayList KodePos = new ArrayList();
            case(2):
                System.out.println("Nama Pengirim : "+NamaPengirim);

            case(3):
                System.out.println("Edit Data");

            case(4):
                System.out.println("Hapus Data");

            case(5):
                System.exit(pilih);                  
        }

    }
}
