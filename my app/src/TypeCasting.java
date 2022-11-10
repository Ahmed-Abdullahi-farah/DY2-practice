import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num = input.nextInt();
       // int num = input.nextInt();
        //System.out.println(num);
         //teype casting
        //int num = (int) (56.764);
        //System.out.println(num);
        //outomatic  type promotion and expresstion
       // int a = 257;
       // byte b= (byte)(a); //257 % 256=1
        byte a = 10;
        byte b = 5;
        byte c = 3;
        int d = (a * b) / c ;
        System.out.println(d);

    }
}
