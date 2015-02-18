import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlippingBits {

    public static void main(String[] args) {
        FlippingBits classUnderTest = new FlippingBits();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        long a;
        try {
            input = in.readLine();
            int lines = Integer.parseInt(input);
            for(int i = 0; i < lines; i++) {
                input = in.readLine();
                a = Long.parseLong(input);
                System.out.println(classUnderTest.flippingBits(a));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long flippingBits(long a) {
        // http://stackoverflow.com/a/22938125/588759
        //long mask = 0xffffffffl;
        // http://stackoverflow.com/a/6351383/588759
        long mask = (1L << 32) - 1;
        //System.out.println(Long.toBinaryString(1L << 32)); // 100000000000000000000000000000000 // 1 and 32 zeros
        //System.out.println(Long.toBinaryString(mask)); // 11111111111111111111111111111111 // 32 ones
        return ~a & mask;
    }
}
