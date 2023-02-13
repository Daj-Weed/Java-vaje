public class Naloga4 {
  public static void main(String[] args) {
    int tabela[] = {1,2,6,3,5,6,7,9,1,3};
    int zacetek[] =  {1,2,2};

    System.out.println(seZacneZ(zacetek, tabela));
  }
  
  static boolean seZacneZ(int[] zacetek, int[] tabela) {
    if (zacetek.length > tabela.length) {
        return false;
    }

    for (int i = 0; i < zacetek.length; i++) {
        if (zacetek[i] != tabela[i]) {
            return false;
        }
    }

    return true;
  }
}
