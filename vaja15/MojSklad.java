public class MojSklad {
  private final static int N = 2000;
   private static int[] sklad = new int[N]; 
   private static int vrh = -1;

  public static boolean isEmpty(){ 
    return vrh == -1;
  }
   
  public static int pop() { 
    if(!isEmpty()) {  
      vrh--;
      return sklad[vrh + 1];
    }
    return -1;
  }
   
  public static void push(int kaj){ 
    if(vrh < N - 1) {
      vrh++; 
      sklad[vrh] = kaj;
    }
  }
}
