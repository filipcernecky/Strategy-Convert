package src.vpr;

public class Binar implements Strategy {

    @Override
    public String convert(int num) {
        String bin = Integer.toBinaryString(num);
        return bin;
        //System.out.println("number " + bin);
    }
}

