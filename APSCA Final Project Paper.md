# 💡 Ideas

# Ideas

Poem Writer  
Species Identifier  
???  
???  
???

# 🕐 Work

# Work

Input various words \~\> sort based on syllables or letters

Sorted words \~\> structured poem

Input poem type \~\> change format accordingly

Use string inputs, count number of letters in each string input, sort into a poem.

# Code

import java.util.Arrays;

public class SimplePoem {  
    public static void main(String\[\] args) {  
        String\[\] words \= {"beautiful", "sky", "the", "shines", "brightly", "above", "star"};  
          
        String poemType \= "COUPLET"; 

        for (int i \= 0; i \< words.length; i++) {  
            for (int j \= i \+ 1; j \< words.length; j++) {  
                if (words\[i\].length() \> words\[j\].length()) {  
                    String temp \= words\[i\];  
                    words\[i\] \= words\[j\];  
                    words\[j\] \= temp;  
                }  
            }  
        }

        System.out.println("--- Poem Type: " \+ poemType \+ " \---");  
          
        if (poemType.equals("COUPLET")) {  
            for (int i \= 0; i \< words.length; i++) {  
                System.out.print(words\[i\] \+ " ");  
                if (i % 2 \!= 0\) {   
                    System.out.println();   
                }  
            }  
        }  
 else {  
            for (String word : words) {  
                System.out.println(word);  
            }  
        }  
    }  
}  
