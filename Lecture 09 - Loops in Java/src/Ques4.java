import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int num=sc.nextInt();
        int i=0;

        while(i<=num){
            int j=i;
            int revN=0;
            while(j!=0){
                int digit=j%10;
                revN+=Math.pow(digit,3);
                j/=10;
            }
            if(i==revN)
                System.out.print(i+" ");

            i++;
        }



    }
}
