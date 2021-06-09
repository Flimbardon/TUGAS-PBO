import java.util.Scanner;
public class Balok {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int panjang, lebar, tinggi, hasil1, hasil2;
    System.out.println("Program Menghitung Volume dan Keliling balok");



    System.out.print("Masukan Panjang Balok: ");
    panjang = input.nextInt();
    System.out.print("Masukan Lebar balok: ");
    lebar = input.nextInt();
    System.out.print("Masukan Tinggi Balok: ");
    tinggi = input.nextInt();


    hasil1 =  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    hasil2 = 4 * (panjang + lebar + tinggi);

    System.out.println("Volume Balok tersebut adalah: " + hasil1);
    System.out.println("Keliling Balok tersebut adalah: " + hasil2);


}

}



