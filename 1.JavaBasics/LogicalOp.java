class LogicalOp {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(false || true && true);
        System.out.println(true || false && false || false);
        System.out.println(!(2 > 3));
        System.out.println((2 > 3) && (3 < 4));
        System.out.println('A' + 1 - 1 + "a");
        System.out.println('a' + 1);
        System.out.println((char) 65);
        System.out.println((char) 48);
        System.out.println((char) 66);

        // System.out.println(!true);
    }
}
