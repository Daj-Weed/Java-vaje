public class Izpis0N5 {
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
        for (int i = 0; i < 35; i++) {
            int odmik = (int)(Math.random()*(90-6+1)+6);
            izpisiKxy(odmik);
        }
    }
}
