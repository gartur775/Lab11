public class test {
    public static void main(String[] args) {
        Triangle tr = new Triangle(1, 2, 5);
        tr.print();
        tr.peri();
        tr.plos();
        Rectangle rc = new Rectangle(3, 4);
        rc.print();
        rc.peri();
        rc.plos();
        Mas arr = new Mas(4);
        arr.enter();
        arr.print();
        arr.sort();
        arr.print();
    }
}