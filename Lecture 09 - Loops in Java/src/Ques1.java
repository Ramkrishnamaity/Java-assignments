import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term no");
        int n=sc.nextInt();
        int i=1;

        int firstTerm=1;
        int secondTerm=1;
        int nextTerm;

        while(i<=n){
            System.out.println(firstTerm);
            nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
            i++;
        }


    }
}
