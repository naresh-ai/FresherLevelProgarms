package commaninterview;

class Multiply {
    void mul(int a, int b) {
        System.out.println("Sum of two=" + (a + b));
    }

    void mul(int a, int b, int c) {
        System.out.println("Sum of three=" + (a + b +c));
    }
}
 class polymorshim {
    public static void main(String args[]) {
        Multiply m = new Multiply();
        m.mul(6, 10);
        m.mul(10, 6, 5);
    }
}


