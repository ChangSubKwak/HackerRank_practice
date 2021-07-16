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
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    // Write your code here
        String target = "hackerrank";
        int sIdx = 0;
        int tIdx = 0;
        while(sIdx < s.length()) {
            if (target.charAt(tIdx) != s.charAt(sIdx)) {
                sIdx++;
                continue;
            }
            
            if (target.charAt(tIdx) == 'r') {
                tIdx++;
                sIdx++;
                continue;
            }
            
            while(sIdx < s.length() - 1 && s.charAt(sIdx) == s.charAt(sIdx+1)) {
                sIdx++;
            }
            
            tIdx++;
            
            if (tIdx == target.length()) {
                return "YES";
            }
        }
        
        return "NO";
    }

}

/*
2
hhaacckkekraraannk
rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
*/
public class HackerRankInAString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./result.txt"));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

