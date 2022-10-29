import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        long numOfLetterZ = name.chars().filter(letter -> letter == 'z').count();
        long numOfLetterO = name.chars().filter(letter -> letter == 'o').count();
        if (name.length() <= 21 && numOfLetterZ*2 == numOfLetterO)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

