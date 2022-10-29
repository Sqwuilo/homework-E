import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numV = scanner.nextInt();
        int numT = scanner.nextInt();

        mkad(numV, numT);



    }

    public static void mkad(int a, int b){
        if (a >= 0){
            int c = (a * b) % 109;
            System.out.println(c);
        }else{

            int c = (a * b) % 109;
            System.out.println(-(109 * c - (a * b)));
        }

    }

}