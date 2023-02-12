import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row ");
        int row = sc.nextInt();
        int firstP = (row/2)+1;
        int secondP = row -firstP;

        for(int i=1;i<=firstP;i++){
            char c='A';
            for(int j=1;j<=firstP-i;j++)
                System.out.print(" ");

            for(int k=1;k<=2*i-1;k++) {
                System.out.print(c);
                c++;
            }

            System.out.println();
        }
        for(int i=secondP;i>=1;i--){
            char c='A';
            for(int j=1;j<=(secondP+1)-i;j++)
                System.out.print(" ");

            for(int k=1;k<=2*i-1;k++){
                System.out.print(c);
                c++;
            }

            System.out.println();
        }
    }
}