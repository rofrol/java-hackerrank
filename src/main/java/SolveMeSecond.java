import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolveMeSecond {

    public static void main(String[] args) {
        SolveMeSecond classUnderTest = new SolveMeSecond();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int a, b;
        String[] parts;
        try {
            input = in.readLine();
            int lines = Integer.parseInt(input);
            for(int i = 0; i < lines; i++) {
                input = in.readLine();
                parts = input.split(" ");
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);
                System.out.println(classUnderTest.add(a, b));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int add(int a, int b) {
        return a + b;
    }
}
