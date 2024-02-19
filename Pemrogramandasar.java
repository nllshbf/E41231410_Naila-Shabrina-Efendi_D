package pemrogramandasar;
import java.util.Scanner;
public class Pemrogramandasar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih warna (merah / kuning / hijau) : ");
        String warna = sc.nextLine();
        
        switch (warna){
            case "merah" :
                System.out.println("Anda harus berhenti");
                break;
            case "kuning" :
                System.out.println("Persiapan berhenti");
                break;
            case "hijau" :
                System.out.println("Silahkan jalan");
                break;
            default :
                System.out.println("Warna salah");
        }
    }
    
}
