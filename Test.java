
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
        // değişkenler
        int degree;
        Scanner bob = new Scanner(System.in);
        // değerler
        System.out.print("degree:");
        degree = bob.nextInt();
        if (degree<5) {
            System.out.println("you can go skiing");
        }else if (degree>=5 && degree<15) {
            System.out.println("you can go to the cinema");
        } else if (degree>=15 && degree<25) {
            System.out.println("you can go to the picnic");
        } else if (degree>25) {
            System.out.println("you can swim");
            
        }


    } }