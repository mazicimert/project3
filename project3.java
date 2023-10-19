import java.util.Scanner;

public class project3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kısa kenar giriniz: ");
        double a = input.nextDouble();

        System.out.print("Diğer kısa kenarı giriniz: ");
        double b = input.nextDouble();

        double c = Math.sqrt(a*a + b*b ) ;
        System.out.println("Hipotenüs: " + c );




    }
}