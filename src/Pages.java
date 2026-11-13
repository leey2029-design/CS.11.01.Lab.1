import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hi, please enter your age");
        int age = input.nextInt();
        int pagesToRead = 100 - age;

        System.out.println("Your are " + age + " so you should read at least " + pagesToRead + " pages before you give up. gl");
    }
}
.