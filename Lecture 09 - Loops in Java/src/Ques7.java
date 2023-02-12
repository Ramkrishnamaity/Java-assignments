import java.util.Scanner;
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){

                if(i==(row/2)+1){
                    System.out.print("*");
                }
                else {
                    if (j == (row / 2) + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
