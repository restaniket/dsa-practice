import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int k=n-i; k>0; k--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            if (i > 1) 
            {
                for(int j=1; j<=i-1; j++){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
