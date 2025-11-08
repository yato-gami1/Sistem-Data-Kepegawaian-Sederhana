
public class Manajer extends Pegawai {
    
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {

        super(nama, gajiPokok); 
        this.tunjangan = tunjangan;
    }
    @Override
    public void tampilkanInformasi() {

        super.tampilkanInformasi(); 
        System.out.println("Jabatan     : Manajer");
        System.out.println("Tunjangan   : Rp" + tunjangan);
    }
    
    public double hitungTotalGajiBulanan() {
        return gajiPokok + tunjangan;
    }
}