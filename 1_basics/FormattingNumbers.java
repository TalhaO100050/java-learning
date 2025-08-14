import java.text.NumberFormat;

public class FormattingNumbers{
    public static void main(String[] arg){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        result = percent.format(0.1);
        System.out.println(result);

        result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}