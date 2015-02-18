import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolveMeFirst {

    public static void main(String[] args) {
        SolveMeFirst classUnderTest = new SolveMeFirst();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            input = in.readLine();
            int a = Integer.parseInt(input);
            input = in.readLine();
            int b = Integer.parseInt(input);
            System.out.println(classUnderTest.add(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int add(int a, int b) {
        return a + b;
    }
}
