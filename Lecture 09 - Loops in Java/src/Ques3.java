import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();
        int fac=1;
        int i=2;

        while(i<=num){
            fac*=i;
            i++;
        }

        System.out.println("Factorial = "+fac);

    }
}
