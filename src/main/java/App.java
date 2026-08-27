public class App {
    public static void main(String[] args) {
        int total = countItems("apples", "pears");
        System.out.println("Total: " + total);
    }

    static int countItems(String... names) {
        return names.length;
    }
}
