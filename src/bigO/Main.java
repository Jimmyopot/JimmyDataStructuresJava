package bigO;

public class Main {
    public static void main(String[] args) {
        printItems3(3);

         /*
        - O(1) -> CONSTANT TIME
        - O(log n) -> DIVIDE AND CONQUER
        - O(n) -> PROPORTIONAL
        - O(n^2) -> LOOP WITHIN A LOOP
    */
    }


//***********************************************************************************************************


    /*
        - Big O: O(n)
        - Dropping the constants for simplification: O(2n) == O(n)
    */

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }

    /*
        - Big O: O(n^2)
        - Less efficient in time
    */

    public static void printItems2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    /*
        - Big O: O(n^2 + n) = 0(n^2)
        - n^2 is more dominant than n
        - Drop non dominants
        - Less efficient in time
    */

    public static void printItems3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }

    /*
        - Big O: O(1)
        - Constant time
        - Most efficient in time
    */

    public static int addItems(int n) {
        return n + n + n;
    }

    /*
        - Big O: O(log n)
        - Next best after constant time
    */

}
