
package posttest3;

import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


public class menu {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static Jersey Jry = new Jersey();//OBJEK
    static ArrayList<Jersey> JryList;//ARRAYLIST
    static TokoSepatu TS = new TokoSepatu();//OBJEK
    static ArrayList<TokoSepatu> TSList;//ARRAYLIST
    
    public static void menu () throws IOException{
        Boolean ulang,ulang2;
        System.out.println("|==================================================================|");
        System.out.println("|                   SELAMAT DATANG DI WEBSITE JERSEY               |");
        System.out.println("|==================================================================|");
        ulang = true;
        while (ulang) {
            menuPertama();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                menuKedua();
                    switch (admin){
                        case "1":
                            Jry.tambahJersey();
                            break;
                        case "2":
                            Jry.tampiljersey();
                            break;
                        case "3":
                            Jry.ubahJersey(JryList);
                            break;
                        case "4":
                            Jry.hapusJersey();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                ulang2=true;
                while(ulang2){
                menuKetiga();
                    switch (admin){
                        case "1":
                            TS.tambahSepatu();
                            break;
                        case "2":
                            TS.tampilSepatu();
                            break;
                        case "3":
                            TS.ubahSepatu(TSList);
                            break;
                        case "4":
                            TS.hapusBarang();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "3":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String menuKedua (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t|             PROGRAM PENDATAAN JERSEY             |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA JERSEY            |");
        System.out.println("\t|                 2. TAMPIL DATA JERSEY            |");
        System.out.println("\t|                 3. UBAH DATA JERSEY              |");
        System.out.println("\t|                 4. DELETE DATA JERSEY            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
     public static String menuKetiga (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t| PROGRAM PENDATAAN TOKO JERSEY                    |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  TOKO SEPATU                     |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA SEPATU            |");
        System.out.println("\t|                 2. TAMPIL DATA SEPATU            |");
        System.out.println("\t|                 3. UBAH DATA SEPATU              |");
        System.out.println("\t|                 4. DELETE DATA SEPATU            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static String menuPertama (){
      System.out.println();
      System.out.println("\t|==================================================|");
      System.out.println("\t| PROGRAM PENDATAAN JESEY                          |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                PILIH MENU                        |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                                                  |");
      System.out.println("\t|           1. TOKO BAJU                           |");
      System.out.println("\t|           2. TOKO SEPATU                         |");
      System.out.println("\t|           3. EXIT PROGRAM                        |");
      System.out.println("\t|==================================================|");
      System.out.print("Masukan Pilihan menu : ");
      option = input.nextLine();
      return option;
    }


    public static void main(String[] args) throws IOException  {
       menu();
    }
    
    
}

