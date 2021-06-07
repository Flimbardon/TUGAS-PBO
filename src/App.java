import java.util.Scanner;
 
public class App {
    public float luasPermukaan(float r) {
        float phi = 3.14f;
        float hasil;

        hasil = 4 * phi * r * r;
        return hasil;
    }

    public float volumeBola(float r) {
        float phi = 3.14f;
        float hasil;

        hasil = 4 / (float) 3 * phi * r * r * r;
        return hasil;
    }


    public static void main(String[] args) {
        
        
        char choice;
        do{
            Scanner userInput = new Scanner(System.in);
            float rusuk, luasP, volume;
            
            App Rusuk = new App();

            System.out.println("\t Luas Permukaan & Volume Bola \n");
            System.out.print(" Masukkan Rusuk : ");
            rusuk = userInput.nextFloat();
        
            luasP = Rusuk.luasPermukaan(rusuk);
            System.out.println("\n Luas Permukaannya : " + luasP);
        
            volume = Rusuk.volumeBola(rusuk);
            System.out.println("\n Volume Bolanya    : " + volume);
            
            System.out.print("Apakah mau melanjutkan perhitungan? (Y/N)? ");

            Scanner sc = new Scanner(System.in);
            choice = sc.next().charAt(0);

        }while(choice == 'Y' || choice == 'y');
    }       
}







































     
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
