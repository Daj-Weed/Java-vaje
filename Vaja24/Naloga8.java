public class Naloga8 {
  public static void main(String[] args) {
    String niz1 = "Hello";
    String niz2 = "Hello";
    String niz3 = "World";
    boolean enaka1 = niz1.equals(niz2);
    boolean enaka2 = niz1.equals(niz3);
    System.out.println(enaka1);  // true
    System.out.println(enaka2);  // false


    String niz4 = "Apple";
    String niz5 = "Banana";
    String niz6 = "Apple";

    int rezultat1 = niz4.compareTo(niz5);  // negativen rezultat (-1)
    int rezultat2 = niz5.compareTo(niz4);  // pozitiven rezultat (1)
    int rezultat3 = niz4.compareTo(niz6);  // rezultat je 0
    
    System.out.println(rezultat1);  // negativen rezultat (-1)
    System.out.println(rezultat2);  // pozitiven rezultat (1)
    System.out.println(rezultat3);  // rezultat je 0
    // torej .eqals primerja ali je vebinsko enko, 
    // .compareTo pa vsebinsko po vrednostih crk v ASCII tabeli
  }
}
