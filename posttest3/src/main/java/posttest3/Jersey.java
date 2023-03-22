
package posttest3;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Jersey extends TokoBaju {
    private final String kodeJry = "Jry";
    private long noKodeJry;
    
    Jersey(String namaJry, String ukuran, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeJry){
        super(namaJry,ukuran,stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual,noKodeJry);
    }
    
    
    Jersey() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    Jersey Jry;
    ArrayList<Jersey> JryList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    protected void tambahJersey () throws IOException{
        boolean ulang=true;
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMBAH JERSEY                      |");
        System.out.println("\t|==================================================|");
        System.out.print("Nama Jersey : ");
        namaJry = inp.nextLine();
        System.out.print("ukuran : ");
        ukuran = inp.nextLine();
        System.out.print("Stok Awal  : ");
        stokAwal = Integer.parseInt(br.readLine());
        System.out.print("Stok Masuk  : ");
        stokMasuk = Integer.parseInt(br.readLine());
        System.out.print("Stok Keluar  : ");
        stokKeluar = Integer.parseInt(br.readLine());

        while(ulang){
            System.out.print("Harga Beli Jersey [ukuran] : ");
            String strHargaBeli=inp.nextLine();
            System.out.print("Harga Jual Jersey [ukuran] : ");
            String strHargaJual=inp.nextLine();
            if (strHargaJual.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }else if(strHargaBeli.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    hargaBeli = (Integer.parseInt(strHargaBeli));
                    hargaJual = (Integer.parseInt(strHargaJual));
                    noKodeJry++;
                    System.out.println("No Kode Jersey : " + kodeJry + noKodeJry);
                    Jry = new Jersey(namaJry, ukuran, stokAwal, stokMasuk, stokKeluar, hargaBeli, hargaJual, noKodeJry); // OBJEK ke - 1
                    JryList.add(Jry);
                    System.out.println("\n>> Tambah Data Jersey Berhasil <<");
                    ulang=false;
                }catch(NumberFormatException e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    
    protected void tampiljersey(){
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMPIL BARANG JERSEY               |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<JryList.size(); i++){
            System.out.println("|===============================================================|");
            System.out.println("\tNo Kode Jersey : " + kodeJry + JryList.get(i).getnoKodeJry());
            System.out.println("\tNama Jersey : " + JryList.get(i).getnamaJry());
            System.out.println("\tJenis ukuran : " + JryList.get(i).getukuran());
            System.out.println("\tStok Awal : " + JryList.get(i).getStokAwal());
            System.out.println("\tStok Masuk : " + JryList.get(i).getStokMasuk());
            System.out.println("\tStok Keluar : " + JryList.get(i).getStokKeluar());
            System.out.println("\tStok Akhir : " + (JryList.get(i).getStokAwal()+JryList.get(i).getStokMasuk()-JryList.get(i).getStokKeluar()));
            System.out.println("\tHarga Beli Jersey [ukuran] : Rp" + JryList.get(i).hargaBeli);
            System.out.println("\tHarga Jual Jersey [ukuran] : Rp" + JryList.get(i).hargaJual);
            System.out.println("|===============================================================|");
            System.out.println(" ");
        }
    }
    
    public ArrayList<Jersey> ubahJersey(ArrayList<Jersey> Jrylist) throws IOException {
        int ubah;
        System.out.println("\t|==================================================|");
        System.out.println("\t|                     UBAH JERSEY                  |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<JryList.size(); i++){
            System.out.println("No Kode Jersey : " + kodeJry +
            JryList.get(i).getnoKodeJry());
            System.out.println("Nama Jersey : " + JryList.get(i).getnamaJry());
            System.out.println(" ");
        }
        if (JryList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama Jersey : ");
//        JryList.get(ubah).namaJry = (inp.nextLine());
        JryList.get(ubah).setnamaJry(br.readLine());
        System.out.print("Ubah Jenis ukuran : ");
        JryList.get(ubah).setukuran(br.readLine());
        System.out.print("Ubah Stok Awal : ");
        JryList.get(ubah).setStokAwal(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Stok Masuk : ");
        JryList.get(ubah).setStokMasuk(Integer.parseInt(br.readLine()));
         System.out.print("Ubah Stok Keluar : ");
        JryList.get(ubah).setStokKeluar(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Harga Beli Jersey [ukuran] : ");
        JryList.get(ubah).setHargaBeli(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Harga Jual Jersey [ukuran] : ");
        JryList.get(ubah).setHargaJual(Integer.parseInt(br.readLine()));
        System.out.println("\n>> Data Jersey Berhasil Di Ubah <<\n");

        return JryList;
    }
    
    public void hapusJersey() {
        System.out.println("\t|==================================================|");
        System.out.println("\t|               HAPUS JERSEY                       |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<JryList.size(); i++){
            System.out.println("No Kode Jersey : " + kodeJry +
            JryList.get(i).getnoKodeJry());
            System.out.println("Nama Jersey : " + JryList.get(i).getnamaJry());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Jersey [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        JryList.remove(hapus);
        System.out.println("\n>> Data Jersey Berhasil di Hapus <<\n");
    }



    
}
