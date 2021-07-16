import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
    // Write your code here
        int unmatchedCount = 0;
        int len = s.length();
        for (int i = 0 ; i < len ; i+=3) {
            if (s.charAt(i)   != 'S') unmatchedCount++;
            if (s.charAt(i+1) != 'O') unmatchedCount++;
            if (s.charAt(i+2) != 'S') unmatchedCount++;
        }
        return unmatchedCount;
    }

}

/*
SOSPOP
*/
public class MarsExploration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./result.txt"));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

