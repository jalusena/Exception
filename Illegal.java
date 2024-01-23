package Exception;

public class Illegal {
    public static void main(String[] args) {
        try {
            // Memanggil metode dengan argumen ilegal
            printPositiveNumber(-5);

            // Baris ini tidak akan dijalankan jika IllegalArgumentException terjadi
            System.out.println("Metode berhasil dipanggil.");
        } catch (IllegalArgumentException e) {
            // Menangani IllegalArgumentException di sini
            System.err.println("Terjadi IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void printPositiveNumber(int number) {
        // Memeriksa apakah argumen positif, jika tidak, lemparkan IllegalArgumentException
        if (number <= 0) {
            throw new IllegalArgumentException("Angka harus positif");
        }

        System.out.println("Angka positif: " + number);
    }
}
