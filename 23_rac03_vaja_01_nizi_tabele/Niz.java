public class Niz {
  String niz;
  public Niz() {
    niz = new String();
  }

  public void setNiz(String niz) {
    this.niz = niz;
  }

  public int primerjaj(String niz1, String niz2) {
    int dolzina1 = niz1.length();
    int dolzina2 = niz2.length();
    
    if (dolzina1 == dolzina2) {
        return 0;
    } else if (dolzina1 < dolzina2) {
        return -1;
    } else {
        return 1;
    }
  }

  public int primerjaj(String niz2) {
    int dolzina1 = this.niz.length();
    int dolzina2 = niz2.length();
    
    if (dolzina1 == dolzina2) {
        return 0;
    } else if (dolzina1 < dolzina2) {
        return -1;
    } else {
        return 1;
    }
  }
}
