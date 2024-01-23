package Exception;

public class Aritmatic {
    public static void main(String... args) {
        int a = 50, b = 0;
        try {
            int c = divideAndSquare(a, b);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static int divideAndSquare(int x, int y) {
        int z = x / y;
        return z * z;
    }
}

