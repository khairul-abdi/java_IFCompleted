import java.util.Scanner;

public class if_Tunggal1 {
    public static void main(String[] args) {

        //membuat Scanner
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Nama      : ");
        String nama = input.nextLine();
        System.out.println("Nilai   : ");
        int nilai = input.nextInt();

        //cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.print("Selamat"+nama+", anda lulus");
        }else{
            System.out.print("Maaf"+nama+",anda gagal");
        }


    }
}
