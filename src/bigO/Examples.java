package bigO;

public class Examples {
    public static void main(String[] args) {

    }

    /*
        - This is NOT Big O: O(n)
        - It is O(a + b)
    */
    public static void printItems(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < b; j++) {
            System.out.println(j);
        }
    }

    /*
        - This is O(a * b)
    */
    public static void printItems2(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i + " " +j);
            }
        }
    }
}
