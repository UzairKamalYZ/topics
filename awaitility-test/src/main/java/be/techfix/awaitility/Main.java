package be.techfix.awaitility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);

        }
    }

    public static boolean isStringRotated(String line){
        String [] words = line.split(",");

        String nstr ="";

        for (int i=0; i<words[0].length(); i++)
        {
            char ch= words[0].charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);

    if(nstr.equalsIgnoreCase(words[1]))
        return true;
    else return false;
    }


}