package Lesson;

public class EqualsDemo {
    public static void main(String[] args) {
        Equals equals1 = new Equals("Alex", 55, true);
        Equals equals2 = new Equals("Sam", 48, false);
        Equals equals3 = new Equals("Sam", 48, false);

        System.out.println("equals1 = equals2 ?  ==> " + equals1.equals(equals2));
        System.out.println("equals2 = equals3 ?  ==> " + equals3.equals(equals2));
    }
}
