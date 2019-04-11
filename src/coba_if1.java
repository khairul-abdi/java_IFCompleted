import java.util.Scanner;

public class coba_if1 {
    public static void main(String[] args) {
        //membuat variabel belanja dan scanner
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Total Belanja");
        int belanja = scan.nextInt();

        //cek apakah dia belanja di atas 100000
        if (belanja > 100000) {
            System.out.println("Selamat, Anda mendapatkan hadiah!");
        }

        System.out.println("Terima kasih sudah berbelanja");
    }
}
