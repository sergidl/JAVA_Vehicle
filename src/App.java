public class App {
    public static void main(String[] args) {
        Cotxe c=new Cotxe("Citroen", 4, "blau", "1234");
        Patinet p=new Patinet("Xiaomi", 2, "1S");
        c.bikeLine();
        c.needITV();
        p.bikeLine();
        p.needITV();
    }
}
