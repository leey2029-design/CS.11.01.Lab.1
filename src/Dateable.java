import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        int youngestAge = (age / 2) + 7;

        System.out.println(age + " year olds can date somebody who is at least " + youngestAge + " years old. W");
    }
}
.