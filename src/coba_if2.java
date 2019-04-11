import java.util.Scanner;
public class coba_if2 {
    public static void main(String[] args) {

        //membuat scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Total Belanja : Rp ");
        int belanja = input.nextInt();
        
        //cek apakah belanjanya lebih dari 100000
        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }
        System.out.println("Terima kasih sudah berbelanja");
    }
}
