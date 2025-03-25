import java.io.IOException;
import java.util.Random;

public class PR{

    static Random Srand = new Random();

    static int genRam(int Max){
        int x = Srand.nextInt(Max)+1;
        return x;
    }
    public static void main(String[] var0) throws IOException{
        int n = 10;
        System.out.println(genRam(n));
    }
}