import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;

        while(scn.hasNextInt()){
            int num=scn.nextInt();
            if(num<0){
                sum=-1;
                break;
            }
            sum+=num;
        }
        System.out.println("sum = "+sum);
    }
}
