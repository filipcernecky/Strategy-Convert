package src.vpr;

public class Octal implements Strategy {

    @Override
    public String convert(int num) {
        String oct = Integer.toOctalString(num);
        return oct;
        //System.out.println("number " + oct);
    }
}

