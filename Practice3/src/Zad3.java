import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Scanner scanner = new Scanner(System.in);
        double IHave = scanner.nextDouble();
        String s = Double.toString(IHave);
        fmt.format("У меня есть %s рублей", s);
        System.out.println(fmt);
        NumberFormat Dollar = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat Euro = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double MbIHad = IHave / 25.58;
        System.out.println("В 2007-м у меня бы было " + Dollar.format(MbIHad));
        System.out.println("А вот сейчас у меня только " + Dollar.format(IHave/63.06));
        System.out.println("Хотя это ,на удивление, целых " + Euro.format(IHave/62.47));
    }
}
