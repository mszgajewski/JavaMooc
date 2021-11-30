package PrintingCollection;



public class Main {
    public static void main(String[] args) {
        SimpleCollection a = new SimpleCollection("wooo");

        System.out.println("Longest: " + a.longest());

        System.out.println(a);
        a.add("a");
        System.out.println(a);
        a.add("b");
        System.out.println(a);
        a.add("c");
        System.out.println(a);

        System.out.println("Longest: " + a.longest());

        a.add("magneto");
        a.add("mystique");
        a.add("phoenix");

        System.out.println("Longest: " + a.longest());

    }
}
