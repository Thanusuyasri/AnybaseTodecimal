import java.util.Scanner;

public class AnybaseTodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base = scanner.nextInt();
        int decimalnumber=0,i=0;
        while(number>0)
        {
            decimalnumber+=(number%10)*(Math.pow(base,i));
            number/=10;
            i++;
        }
        System.out.println(decimalnumber);
    }
}
