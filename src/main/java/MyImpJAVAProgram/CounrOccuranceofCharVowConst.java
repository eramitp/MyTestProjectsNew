package MyImpJAVAProgram;

import java.util.*;

public class CounrOccuranceofCharVowConst {

    public static void main(String args[]){
        String orgStr = "elcLoAAmemellacompan";
        String str = orgStr.toLowerCase();
        //creating an array of size 256 (ASCII_SIZE)
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++){
            //initialize count array index
            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
            int occurance = 0;
            for (int j = 0; j <= i; j++){
                if (str.charAt(i) == ch[j])
                    occurance++;
            }
            if (occurance == 1)
                //prints occurrence of the character
                System.out.println(str.charAt(i)+ " = " + count[str.charAt(i)]);
        }
        //Print Vowel and cons char
        Set<Character> vowel = new HashSet<Character>();
        Set<Character> cons = new HashSet<Character>();
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
                    str.charAt(i)=='o'||str.charAt(i)=='u')
                vowel.add(str.charAt(i));
            else
                cons.add(str.charAt(i));
        }
        System.out.println("Vowel = "+vowel);
        System.out.println("Consonant = "+cons);
    }
}