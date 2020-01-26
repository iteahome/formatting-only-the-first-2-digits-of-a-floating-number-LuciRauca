
        import java.util.Scanner;
public class Float {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please insert a float you want to round to 2 decimals:_");
        if (scanner.hasNextFloat()){
            float number = scanner.nextFloat();
            System.out.println(String.format("%.2f", number));
        }
        else {
            System.out.println("The input is not float.");
        }
    }
}