public class Naloga1 {
    public static void main(String[] args) {
        char[] tabelaZlogov = {'A','B','C','D','E','F','G'};
        String niz = new String(tabelaZlogov);
        System.out.println(niz);

        byte[] ba = {65,66,67,68,69,70,71};
        String nizSt = new String(ba);
        System.out.println(nizSt);

        char[] tc = {'F','U','G','L','O','V','Ž'};
        String nizTc = new String(tc);
        System.out.println(nizTc);

        byte[] b2 = {'F','U','G','L','O','V',(byte)'Ž'};
        String nizB2 = new String(b2);
        System.out.println(nizB2);
        //Je pomebno ker ko gre za byte izpise } in ne Ž
    }
}
