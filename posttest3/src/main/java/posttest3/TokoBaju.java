
package posttest3;


public class TokoBaju {
    protected String namaJry, ukuran;
    public int stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual;
    protected long noKodeJry;
    
    TokoBaju(String namaJry, String ukuran, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeJry){
        this.namaJry = namaJry;
        this.ukuran = ukuran;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.stokAwal = stokAwal;
        this.stokMasuk = stokMasuk;
        this.stokKeluar = stokKeluar;
        this.noKodeJry = noKodeJry;
    }
    
    TokoBaju() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    

    public long getnoKodeJry() {
        return noKodeJry;
    }

    public String getnamaJry() {
        return namaJry;
    }
    
    public void setnamaJry(String namaJry) {
        this.namaJry = namaJry;
    }

    public String getukuran() {
        return ukuran;
    }
    
    public void setukuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getStokAwal() {
        return stokAwal;
    }
    
    public void setStokAwal(int stokAwal) {
        this.stokAwal = stokAwal;
    }
    
    public int getStokMasuk() {
        return stokMasuk;
    }
    
    public void setStokMasuk(int stokMasuk) {
        this.stokMasuk = stokMasuk;
    }
    public int getStokKeluar() {
        return stokKeluar;
    }
    
    public void setStokKeluar(int stokKeluar) {
        this.stokKeluar = stokKeluar;
    }

    
    public int getHargaBeli() {
        return hargaBeli;
    }
    
    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }
    public int getHargaJual() {
        return hargaJual;
    }
    
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    public long getNoKode() {
        return noKodeJry;
    }
}

