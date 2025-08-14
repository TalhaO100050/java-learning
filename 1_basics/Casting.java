public class Casting {
    public static void main(String[] str){
        //Imlicit casting
        //byte -> short -> int -> long
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        //byte -> short -> int -> long -> float -> double 
        double a = 1.1;
        double b = a + 2; // 2.0
        System.out.println(b);

        double c = 1.1;
        int  d = (int)c + 1;
        System.out.println(d);


        String e = "1";
        int f = Integer.parseInt(e) + 2;
        System.out.println(f);

    }
}
