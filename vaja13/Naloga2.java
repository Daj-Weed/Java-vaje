import java.nio.file.SecureDirectoryStream;
import java.util.Arrays;

public class Naloga2 {
  public static void main(String[] args) {
    int[] t = new int[]{1,2,3,5,1,7,8,9};
    int[] t2 = {2,4,5,6,7,8,9};

	  System.out.println(Arrays.toString(t));	 
	  Arrays.sort(t); 
    System.out.println(Arrays.toString(t));
    System.out.println(Arrays.equals(t, t2));
    
    System.out.println(enakiTab(t, t2));
  }

  static boolean enakiTab(int[] tabela1, int[] tabela2) {
    if (tabela1.length != tabela2.length) 
      return false;
    for (int i = 0; i < tabela1.length; i++) {
      if (tabela1[i] != tabela2[i])
        return false;
    }
    return true;
  }
}
