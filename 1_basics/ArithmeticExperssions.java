public class ArithmeticExperssions {
    public static void main(String[] arg){
        int result;
        float resultFloat;

        result = 10 + 3;
        System.out.println("Sum: " + result + "\n");

        result = 10 / 3;
        System.out.println("Int division: " + result + "\n");

        resultFloat = 10 / 3;
        System.out.println("Float division with ints: " + resultFloat + "\n");

        resultFloat = (float)10 / (float)3;
        System.out.println("Float divisions: " + resultFloat + "\n");

        int x = 1;
        int y = x++;
        System.out.println("x: " + x);
        System.out.println("y: " + y + "\n");
        
        x = 1;
        y = 0;
        y = ++x;
        System.out.println("x: " + x);
        System.out.println("y: " + y + "\n");

        x += 10;
        System.out.println("x: " + x);
        x %= 5;
        System.out.println("x: " + x + "\n");

        result = 10 + 3 * 2;
        System.out.println("Order of operations: " + result);
    }
}