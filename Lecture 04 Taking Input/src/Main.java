import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter your name, roll no and field of interest : ");
//        String name=sc.next();
//        String surName=sc.next();
//        long roll=sc.nextLong();
//        String field=sc.next();
//        System.out.println("Name: "+name+", Roll no: "+roll+" ,Field of Interest: "+field);

//        String s1="level",s2="up";
//        System.out.println(s1+s2);

//        int phys=78,chem=89,math=96;
//        int totalMark=phys+chem+math;
//        int percent=totalMark/3;
//        System.out.println(totalMark);
//        System.out.println(percent+"%");

//        int t=3;
//        for(int i=0;i<t;i++) {
//            int n1=sc.nextInt();
//            int n2=sc.nextInt();
//            System.out.println(n1+n1);
//        }

        String s=sc.next();
        while(sc.hasNextLine()){
            String a=sc.next();
            String b=sc.next();
            System.out.println(a+b);
        }




    }
}