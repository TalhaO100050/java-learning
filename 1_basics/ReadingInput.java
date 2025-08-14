import java.util.Scanner;

public class ReadingInput{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old.");
        scanner.nextLine(); //Buffer clearing

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is " + name + "!");
    }
}