import java.util.*;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if ((num % 400) == 0 || ((num % 100 != 0) && (num % 4 == 0)))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}