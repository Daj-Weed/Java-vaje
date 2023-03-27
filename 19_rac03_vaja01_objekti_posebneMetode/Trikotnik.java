public class Trikotnik {
    private static double tocka[] = new double[6];
    private static double premikX = 0;
    private static double premikY = 0;
    
    public static double[] getTocke() {
        premikX = Math.random() * 700;
        premikY = Math.random() * 700;
        tocka[0] = 0.0 + premikX;
        tocka[1] = 0.0 + premikY;
        tocka[2] = (Math.random() * (40 - 5) + 5) + premikX;
        tocka[3] = (Math.random() * (40 - 5) + 5) + premikY;
        tocka[4] = (Math.random() * (40 - 10) + 10) + premikX;
        tocka[5] = (Math.random() * (40 - 10) + 10) + premikY;
        
        return tocka;
    }
}
