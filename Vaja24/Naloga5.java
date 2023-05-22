public class Naloga5 {
  public static void main(String[] args) {
    String s1 = "MATIC";
    String s2 = "MAKS";
    String s3 = s1 + s2;
    System.out.println(s3);
    String s4 = s1.concat(s2);
    System.out.println(s4);
    String s5 = (new StringBuilder()).append(s1).append(s2).toString();
    System.out.println(s5);
  }
}
