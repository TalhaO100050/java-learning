import java.util.Date;

import java.awt.Point;

public class VariableTypes {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        //Primitive type variables
        byte age = 40;
        long videoViews = 3_123_456_789L;
        float price = 10.99f;
        char letter = 'A';
        boolean isTrue = true;

        //Reference type variables
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        //String
        String message = new String("Hello ");
        String message2 = "world" + "!!";
        System.out.println(message + message2);

        System.out.println(message2.endsWith("!!"));
        System.out.println(message2.startsWith("Hello"));

        System.out.println(message.length());

        System.out.println(message.indexOf("H"));

        System.out.println(message2.replace("!", "*"));

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message3 = "  hello :)  ";
        System.out.println(message3.trim());

        String message4 = "hello \"world\"";
        System.out.println(message4);

        String message5 = "C:\\Windows\\...";
        System.out.println(message5);

        String message6 = "Hello\nmy\nname\nis\nTalha";
        System.out.println(message6);

        String message7 = "Name\tAge\tGender\nAli\t27\tMale\nAyşe\t24\tFemale";
        System.out.println(message7);
    }
}
