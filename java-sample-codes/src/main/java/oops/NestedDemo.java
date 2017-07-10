package oops;

public class NestedDemo {

    private static int i = 100;

    static class InnerClass {

        public static void main(String[] args) {
            System.out.println("Accessing outer variables " + NestedDemo.i);
        }

    }

}
