import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(reader.readLine());
        while(t!=0) {
            String[] x = reader.readLine().split(" ");
            BigInteger a = new BigInteger(x[0]);
            int b = Integer.parseInt(x[1]);
            BigInteger c = a.pow(b);

            System.out.println(c.mod(new BigInteger(String.valueOf(1000000000))));
            t--;
        }
    }
}
