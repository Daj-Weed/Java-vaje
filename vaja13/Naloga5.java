public class Naloga5 {
  public static void main(String[] args) {
      int tabela[] = {1,2,6,3,5,6,7,9,1,3};
      int zacetek[] =  {9,1,3};
    
      System.out.println(seZacneZ(zacetek, tabela));
    }
      
    static boolean seZacneZ(int[] zacetek, int[] tabela) {
    if (zacetek.length > tabela.length) {
      return false;
    }
    
    for (int i = 0; i < zacetek.length; i++) {
      if (zacetek[i] != tabela[tabela.length - 1 - i]) {
        return false;
      }
    }
    
    return true;
  }
}    
