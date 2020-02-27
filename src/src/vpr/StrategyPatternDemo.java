package src.vpr;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new Binar());
        System.out.println("number in binary = " + context.executeStrategy(173));

        context = new Context(new Octal());
        System.out.println("number in octal = " + context.executeStrategy(173));

        context = new Context(new Hexadec());
        System.out.println("number in hexadecimal = " + context.executeStrategy(173));
    }
}
