import java.util.Arrays;

public class U2_L1_Activity_One{
public static void main(String[] args) {
String[] words = {"beautiful", "sky", "the", "shines", "brightly", "above", "star"};

    String poemType = "COUPLET"; 

    for (int i = 0; i < words.length; i++) {  
        for (int j = i + 1; j < words.length; j++) {  
            if (words[i].length() > words[j].length()) {  
                String temp = words[i];  
                words[i] = words[j];  
                words[j] = temp;  
            }  
        }  
    }

    System.out.println("--- Poem Type: " + poemType + " ---");  
      
    if (poemType.equals("COUPLET")) {  
        for (int i = 0; i < words.length; i++) {  
            System.out.print(words[i] + " ");  
            if (i % 2 != 0) {   
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
