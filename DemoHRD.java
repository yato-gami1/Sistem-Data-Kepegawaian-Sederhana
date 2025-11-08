public class DemoHRD {

    public static void main(String[] args) {
        
        Pegawai karyawanA = new Pegawai("Budi Santoso", 4500000);
        
        System.out.println("--- Data Karyawan A (Pegawai Biasa) ---");
        karyawanA.tampilkanInformasi();
        System.out.println("Gaji Tahunan: Rp" + karyawanA.hitungGajiTahunan());
        System.out.println("\n===================================\n");


        Manajer manajerB = new Manajer("Citra Dewi", 8000000, 2000000);
        
    
        System.out.println("--- Data Manajer B (Inheritance & Overriding) ---");
        
        manajerB.tampilkanInformasi();
        

        System.out.println("Gaji Tahunan: Rp" + manajerB.hitungGajiTahunan()); 
        

        System.out.println("Total Gaji Bulanan: Rp" + manajerB.hitungTotalGajiBulanan()); 
        System.out.println("===================================");
    }
}