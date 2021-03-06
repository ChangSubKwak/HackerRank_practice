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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        k %= 26;
        String result = new String();
        int len = s.length();
        for(char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                c = (char)('A' + ((c - 'A') + k ) % 26);
            }
            if ('a' <= c && c <= 'z') {
                c = (char)('a' + ((c - 'a') + k ) % 26);
            }
            
            result += (char)c;            
        }
        
        return result;
    }

}

/**
Sample Input
11
middle-Outz
2

Sample Output
okffng-Qwvb
*/
public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./result.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

