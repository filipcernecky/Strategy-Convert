package src.vpr;

public class Hexadec implements Strategy {

    @Override
    public String convert(int num) {
        String hex = Integer.toHexString(num);
        return hex;
        //System.out.println("number " + hex);
    }
}
