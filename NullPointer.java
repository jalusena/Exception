package Exception;

public class NullPointer {
    public static void main(String[] args) {
    String s = "abcd";
    foo(null);
}


    static void foo(String x){
        try {
            System.out.println("Karakter Pertama adalah : " + x.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Terjadi Exception");
            System.out.println(e.getMessage());
        }
    }
}
