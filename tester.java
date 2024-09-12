import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    
        //mencegah eror karena tipe data tidak sesuai
        try {
            System.out.println("silahkan pilih 1 unutk CD atau 2 untuk DVD");
            int pilihan = in.nextInt();
        if (pilihan == 1){
            CD c = new CD();
            c.print();
        }else if (pilihan == 2){
            DVD d = new DVD();
            d.print();
        }else{
            System.out.println("pilihan salah");
        }
     } catch (Exception e) {
        System.out.println("tipe data salah, hanya menerima angka");}
        in.close();
    

    }
}
