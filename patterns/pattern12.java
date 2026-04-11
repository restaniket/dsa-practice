import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int k=i; k<n; k++) {
                System.out.print(" ");
            }
            for (int k=i; k<n; k++) {
                System.out.print(" ");
            }
            for(int m=i; m>=1; m--){
                System.out.print(m);
            }
            System.out.println();
    }
}}
