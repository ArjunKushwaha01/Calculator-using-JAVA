import java.util.Scanner;
public class calculator {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter  num 😁");
            int a =sc.nextInt();
            System.out.println("enter  num2 😁");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("sum :");
            System.out.println(sum);

            int diff= a-b;
            System.out.println("difference :");
            System.out.println(diff);

            int multi = a*b;
            System.out.println("multiplication :");
            System.out.println(multi);

            int div = a/b;
            System.out.println("division :");
            System.out.println(div);

            int modul = a%b;
            System.out.println("modulo :");
            System.out.println(modul);
        }
    }

