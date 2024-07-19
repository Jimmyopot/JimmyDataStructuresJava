package classes;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("blue");
        Cookie cookieTwo = new Cookie("red");

        cookieTwo.setColor("yellow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
