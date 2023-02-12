import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Cost Price: ");
        int costPrice=sc.nextInt();
        System.out.println("Enter Selling Price: ");
        int sellingPrice=sc.nextInt();

        if(sellingPrice>=costPrice)
            System.out.println("profit = "+(sellingPrice-costPrice));
        else
            System.out.println("loss = "+(costPrice-sellingPrice));
    }
}
