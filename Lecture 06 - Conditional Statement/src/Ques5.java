import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("two operands: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" + - / * % ");
        System.out.println("Enter a operator which operation you want to do: ");
        char exp=sc.next().charAt(0);

        switch(exp){
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case '%':
                System.out.println(a+" % "+b+" = "+(a%b));
                break;
            default :
                System.out.println("Enter a valid input..!");
        }
    }
}
