

public class Main {

    public static void main(String[] args) {

        int x=2,y=4;
        System.out.println(x*y);

        char c='A';
        int asciiValue=c;
//        System.out.println((int)c);    or
        System.out.println(asciiValue);

        int length=4,breadth=7;
        System.out.println(length*breadth);

        int num=4;
        System.out.println(Math.pow(num,3));

        int n1=2,n2=3;
//        int temp=n1;
//        n1=n2;
//        n2=temp;   or
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println(n1+" "+n2);

    }

}