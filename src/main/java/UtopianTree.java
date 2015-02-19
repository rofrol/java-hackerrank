import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UtopianTree {

    public static void main(String[] args) {
        UtopianTree classUnderTest = new UtopianTree();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int a;
        try {
            input = in.readLine();
            int lines = Integer.parseInt(input);
            for(int i = 0; i < lines; i++) {
                input = in.readLine();
                a = Integer.parseInt(input);
                System.out.println(classUnderTest.utopianTree(a));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long utopianTree(long a) {
        long tree = 1;
        for(int i = 0; i < a; i++) {
            tree = i % 2 == 0 ? tree * 2: tree + 1;
        }
        return tree;
    }
}
