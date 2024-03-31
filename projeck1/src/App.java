public class PersegiPanjang {
    private int panjang;
    private int lebar;

    // Constructor tanpa parameter
    public PersegiPanjang() {
        this.panjang = 1;
        this.lebar = 1;
    }

    // Constructor dengan parameter
    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    // Method untuk mendapatkan luas persegi panjang
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk mendapatkan keliling persegi panjang
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk mengatur panjang persegi panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    // Method untuk mengatur lebar persegi panjang
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public static void main(String[] args) {
        // Membuat objek persegiPanjang1 dengan constructor tanpa parameter
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();

        // Membuat objek persegiPanjang2 dengan constructor parameter
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);

        // Membuat objek persegiPanjang3 dengan constructor parameter
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        // Menghitung dan mencetak luas dan keliling untuk persegiPanjang1
        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + persegiPanjang1.getLuas());
        System.out.println("Keliling: " + persegiPanjang1.getKeliling());

        // Menghitung dan mencetak luas dan keliling untuk persegiPanjang2
        System.out.println("\nPersegi Panjang 2:");
        System.out.println("Luas: " + persegiPanjang2.getLuas());
        System.out.println("Keliling: " + persegiPanjang2.getKeliling());

        // Menghitung dan mencetak luas dan keliling untuk persegiPanjang3
        System.out.println("\nPersegi Panjang 3:");
        System.out.println("Luas: " + persegiPanjang3.getLuas());
        System.out.println("Keliling: " + persegiPanjang3.getKeliling());
    }
}
