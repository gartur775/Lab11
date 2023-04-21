public class Rectangle {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println(a + " " + b);
    }

    public void peri() {
        System.out.println("Perimeter: " + (a + b) * 2);
    }

    public void plos() {
        System.out.println("Ploshad: " + a * b);
    }
}