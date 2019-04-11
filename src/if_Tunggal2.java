import java.util.Scanner;

public class if_Tunggal2 {
    public static void main(String[] args) {
        //membuat scanner
        Scanner input = new Scanner(System.in);

        //mengambil input
        System.out.print("Nama      : ");
        String nama = input.nextLine();
        System.out.print("Nilai     : ");
        int nilai = input.nextInt();

        //cek apakah dia lulus atau tidak

        if (nilai >= 70) {
            System.out.print();
        }
    }
}
