import java.util.Random;
import java.util.Scanner;

class TebakAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int angkaTebakan = random.nextInt(100) + 1; // Angka antara 1 dan 100
        int tebakanUser = 0;
        
        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 sampai 100.");
        System.out.println("Coba tebak angka tersebut!");

        while (tebakanUser != angkaTebakan) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakanUser = scanner.nextInt();

            if (tebakanUser < angkaTebakan) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else if (tebakanUser > angkaTebakan) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else {
                System.out.println("Selamat! Anda berhasil menebak angka " + angkaTebakan);
            }
        }
        scanner.close();
    }
}
