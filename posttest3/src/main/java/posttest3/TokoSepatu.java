
package posttest3;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TokoSepatu extends TokoBaju {
    private final String kodeTS = "TS";
    private long noKodeTS;
    
    TokoSepatu(String namaJry, String ukuran, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeJry){
        super(namaJry,ukuran,stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual,noKodeJry);
    }
    
    TokoSepatu() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    TokoSepatu TS;
    ArrayList<TokoSepatu> TSList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    protected void tambahSepatu () throws IOException{
        boolean ulang=true;
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMBAH DATA SEPATU                |");
        System.out.println("\t|==================================================|");
        System.out.print("Nama Sepatu : ");
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
            System.out.print("Harga Beli Sepatu [ukuran] : ");
            String strHargaBeli=inp.nextLine();
            System.out.print("Harga Jual Sepatu [ukuran] : ");
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
                    System.out.println("No Kode Sepatu : " + kodeTS + noKodeTS);
                    TS = new TokoSepatu(namaJry, ukuran, stokAwal, stokMasuk, stokKeluar, hargaBeli, hargaJual, noKodeJry); // OBJEK ke - 1
                    TSList.add(TS);
                    System.out.println("\n>> Tambah Data Sepatu Berhasil <<");
                    ulang=false;
                }catch(NumberFormatException e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    
    protected void tampilSepatu(){
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMPIL DATA SEPATU                 |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TSList.size(); i++){
            System.out.println("|===============================================================|");
            System.out.println("\tNo Kode Sepatu : " + kodeTS + TSList.get(i).getnoKodeJry());
            System.out.println("\tNama Sepatu : " + TSList.get(i).getnamaJry());
            System.out.println("\tJenis ukuran : " + TSList.get(i).getukuran());
            System.out.println("\tStok Awal : " + TSList.get(i).getStokAwal());
            System.out.println("\tStok Masuk : " + TSList.get(i).getStokMasuk());
            System.out.println("\tStok Keluar : " + TSList.get(i).getStokKeluar());
            System.out.println("\tStok Akhir : " + (TSList.get(i).getStokAwal()+TSList.get(i).getStokMasuk()-TSList.get(i).getStokKeluar()));
            System.out.println("\tHarga Beli Sepatu [ukuran] : Rp" + TSList.get(i).hargaBeli);
            System.out.println("\tHarga Jual Sepatu [ukuran] : Rp" + TSList.get(i).hargaJual);
            System.out.println("|===============================================================|");
            System.out.println(" ");
        }
    }
    
    public ArrayList<TokoSepatu> ubahSepatu(ArrayList<TokoSepatu> Jrylist) throws IOException {
        int ubah;
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  UBAH DATA Sepatu               |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TSList.size(); i++){
            System.out.println("No Kode Sepatu : " + kodeTS +
            TSList.get(i).getnoKodeJry());
            System.out.println("Nama Sepatu : " + TSList.get(i).getnamaJry());
            System.out.println(" ");
        }
        if (TSList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama Sepatu : ");
//        TSList.get(ubah).namaJry = (inp.nextLine());
        TSList.get(ubah).setnamaJry(br.readLine());
        System.out.print("Ubah Jenis ukuran : ");
        TSList.get(ubah).setukuran(br.readLine());
        System.out.print("Ubah Stok Awal : ");
        TSList.get(ubah).setStokAwal(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Stok Masuk : ");
        TSList.get(ubah).setStokMasuk(Integer.parseInt(br.readLine()));
         System.out.print("Ubah Stok Keluar : ");
        TSList.get(ubah).setStokKeluar(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Harga Beli Sepatu [ukuran] : ");
        TSList.get(ubah).setHargaBeli(Integer.parseInt(br.readLine()));
        System.out.print("Ubah Harga Jual Sepatu [ukuran] : ");
        TSList.get(ubah).setHargaJual(Integer.parseInt(br.readLine()));
        System.out.println("\n>> Data Sepatu Berhasil Di Ubah <<\n");

        return TSList;
    }
    
    public void hapusBarang() {
        System.out.println("\t|==================================================|");
        System.out.println("\t|               HAPUS DATA SEPATU                  |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TSList.size(); i++){
            System.out.println("No Kode Sepatu : " + kodeTS +
            TSList.get(i).getnoKodeJry());
            System.out.println("Nama Sepatu : " + TSList.get(i).getnamaJry());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Data Sepatu [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        TSList.remove(hapus);
        System.out.println("\n>> Data Sepatu Berhasil di Hapus <<\n");
    }

    
    
}
