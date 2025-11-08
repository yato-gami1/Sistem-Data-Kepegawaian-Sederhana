
public class Pegawai {
    
    protected String nama;
    protected double gajiPokok;

   
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

   
    public void tampilkanInformasi() {
        System.out.println("--- Detail Pegawai ---");
        System.out.println("Nama        : " + nama);
        System.out.println("Gaji Pokok  : Rp" + gajiPokok);
    }

    
    public double hitungGajiTahunan() {
        return gajiPokok * 12;
    }
}