public class Izpis0N4 {
    public static void izpisiKxy(int odmik) {
        System.out.printf("%" + odmik + "s", " "); System.out.println("******");
        System.out.printf("%" + odmik + "s", " "); System.out.println("*    *");
        System.out.printf("%" + odmik + "s", " "); System.out.println("* ** *");
        System.out.printf("%" + odmik + "s", " "); System.out.println("* ** *");
        System.out.printf("%" + odmik + "s", " "); System.out.println("*    *");
        System.out.printf("%" + odmik + "s", " "); System.out.println("******");
        System.out.println();
    }
    public static void main (String[] args) {
        izpisiKxy(6);
        izpisiKxy(13);
        izpisiKxy(20);
    }
}

