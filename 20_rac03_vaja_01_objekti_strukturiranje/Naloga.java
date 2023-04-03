public class Naloga {
  public static void main(String[] args) {
    Tocka t = new Tocka(4,5);
	  System.out.println( t.getX() );
	  t.setY(12);
	  System.out.println( t.getY() );

    Daljica d = new Daljica( new Tocka(4,5), new Tocka(1,2) );
	  System.out.println( d + " je dolga " + d.getDolzina() );
  
    System.out.println(t);
    System.out.println(d);

    Daljica a = new Daljica( new Tocka(0,0), new Tocka(0,6) );
    Daljica b = new Daljica( new Tocka(0,6), new Tocka(3,6) );
    Daljica c = new Daljica( new Tocka(3,6), new Tocka(3,6) );
    Trikotnik tr = new Trikotnik(a, b, c);
    tr.sestaviTrikotnik();
  }
}
