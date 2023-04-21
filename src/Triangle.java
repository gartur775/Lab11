public class Triangle {
    private int a, b, c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void print() {
        System.out.println(a + " " + b + " " + c);
    }
    public void peri() {
        System.out.println("Perimeter: " + a + " " + b + " " + c);
    }
    public void plos() {
        double p = (a + b + c) * 0.5;
        System.out.println("Ploshad: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}