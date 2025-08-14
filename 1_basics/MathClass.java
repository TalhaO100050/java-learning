public class MathClass {
    public static void main(String[] arg){
        int result = Math.round(1.1f);
        System.out.println(result);

        result = (int)Math.ceil(1.1f);
        System.out.println(result);

        result = (int)Math.floor(1.9);
        System.out.println(result);

        result = Math.max(5, 10);
        System.out.println(result);

        double result2 = Math.random();
        System.out.println(result2);
    }
}
