import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        for (int i = rows ; i >= 1 ; i--){
            for (int j = 1 ; j <= (2 * i) ; j++){
                System.out.print("*");
            }
            System.out.println();
            for (int k = rows ; k >= i ; k--){
                System.out.println("*");
            }

        }
    }
}