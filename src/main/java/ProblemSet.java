import java.util.Scanner;
import java.util.HashMap;
public class ProblemSet {


	public static void main(String args[]) {
Scanner scanner=new Scanner(System.in);
//print Welcome to the Text Analyzer.
System.out.println("Welcome to the Text Analyzer.\n");
//print Please enter a sentence or paragraph:
System.out.println("Please enter a sentence or paragraph: \n");
//get the input.
String sentence=scanner.nextLine();
//get the length of input.
int totalCharacter=sentence.length();
	int space=0;
//count the times of space in input.
for(int i=0;i<totalCharacter;i++){
 if(sentence.charAt(i)==' '){
 space++;
 }
}
//declear the variable call vowel.
int vowel = 0;
//convert the input to lowercase.
String text = sentence.toLowerCase();
//count times of vomel
 for (int i = 0; i < text.length(); i++) {
char vowels = text.charAt(i);
//use the || and list all vowels to determine the word have vowels or not.
if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {
//if have the vowel the count of vowels plus one.
 vowel++;
 }
 }
 //remove
String[] words = sentence.split("[,\\.?!\\s]+");

 // Count total words
 int totalWords = 0;

 // Create HashMap for word frequency
   HashMap<String, Integer> frequency = new HashMap<String, Integer>();

 // Common words to ignore
String[] ignoreWords = {"the", "a", "an", "and", "is"};

for (int i = 0; i < words.length; i++) {

    String word = words[i];

    // Skip empty words
    if (word.length() == 0) {
        continue;
    }
//convert to lowercase.
    word = word.toLowerCase();
    totalWords++;
// declear a boolean call ignore
    boolean ignore = false;
//Count frequency if  ignored
    for (String common : ignoreWords) {
        if (word.equals(common)) {
            ignore = true;
            break;
        }
    }

    // Count frequency if not ignored
    if (!ignore) {
        if (frequency.containsKey(word)) {
            frequency.put(word, frequency.get(word) + 1);
        } else {
            frequency.put(word, 1);
        }
    }
}

//print character
System.out.println("\nTotal Characters: " + totalCharacter);
//print word
System.out.println("Total Words: " + totalWords);
//print vowel
System.out.println("Total Vowels: " + vowel);
//print space
System.out.println("Total Spaces: " + space);

// Print word frequency
System.out.println("\nWord Frequency:\n");

for (String key : frequency.keySet()) {
    System.out.println(key + " - " + frequency.get(key));
}
        }

}


        
    

	


