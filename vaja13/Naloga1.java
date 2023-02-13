public class Naloga1 {
  public static void main(String[] args) {
    int[] zaporedje = {1,2,4,6,8,9,12,15,16,19,21};
    System.out.println(iskanje(zaporedje, 10));
    System.out.println(iskanjeDvojisko(zaporedje, 10));
  }

  static int iskanje(int[] tabela, int stevilo) {
    int kolikoPrimerjav = 0;

    for (int i = 0; i < tabela.length; i++) {
      kolikoPrimerjav++;

      if (tabela[i] == stevilo) {
        return kolikoPrimerjav;
      }

    }
    return -1;
  }
  static int iskanjeDvojisko(int[] tabela, int stevilo) {
    int kolikoPrimerjav = 0;
    int konec = tabela.length - 1;
    int zacetek = 0;

    while (zacetek <= konec) {
      int sredina = zacetek + (konec - zacetek) / 2;
      kolikoPrimerjav++;
      if (tabela[sredina] == stevilo)
        return kolikoPrimerjav;
      if (tabela[sredina] < stevilo)
        zacetek = sredina + 1;
      else
        konec = sredina - 1;
    }
    return -1;
  }
}
