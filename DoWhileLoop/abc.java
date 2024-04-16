public class abc {
    static int a;

    public static void main(String[] args) {
        a = test();
        System.out.println(a);
    }

    public static int test() {
        int x = 78;
        if (x > 50)
            return 50;

        return 0;
    }

}
