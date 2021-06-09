import java.util.Scanner;
public class Kubus {
    public static void main(String[] args) throws Exception {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Sisi = ");

    int s = input.nextInt();

    int luas = 6*(s*s );
    int volume = s*s*s;
    int keliling = 12*s;

    System.out.println("Luas = "+luas);
    System.out.println("Volume = "+volume);
    System.out.println("Keliling = "+keliling);
    }
}
