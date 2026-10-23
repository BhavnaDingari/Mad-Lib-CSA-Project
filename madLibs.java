import java.util.Scanner;
public class madLibs {
    public static void main (String[]args){

        // Sentence 1
        // store incomplete Mad Lib in a variable with placeholders
        String incompleteMadLib = "I walked into the kitchen and saw a <adjective> cat eating a <noun> right off the <noun>.";

        // initiate scanner object to take user input
        Scanner sc = new Scanner (System.in);
        
        // prompt user for an adjective and store it
        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        // prompt user for a noun and store it
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        // prompt user for a noun and store it
        System.out.print("Enter a noun: ");
        String noun2 = sc.nextLine();
        
        // find positions of first '<' and '>' and extract text before the first placeholder 
        int start1 = incompleteMadLib.indexOf("<");
        int end1 = incompleteMadLib.indexOf(">");
        String part1 = incompleteMadLib.substring(0, start1);

        // find positions of second '<' and '>' and extract text between first and second placeholder
        int start2 = incompleteMadLib.indexOf("<", end1 + 1);
        int end2 = incompleteMadLib.indexOf(">", end1 + 1);
        String part2 = incompleteMadLib.substring(end1 + 1, start2);

        // find positions of second '<' and '>' and extract text between second and third placeholder
        int start3 = incompleteMadLib.indexOf("<", end2 + 1);
        int end3 = incompleteMadLib.indexOf(">", end2 + 1);
        String part3 = incompleteMadLib.substring(end2 + 1, start3);

        // extract remaining text after the last placeholder
        String part4 = incompleteMadLib.substring(end3 + 1);
        
        // combine text segments with user-provided inputs to create the completed story
        String finalMadLib = part1 + adjective + part2 + noun + part3 + noun2 + part4;
        System.out.println(finalMadLib);

        

        // Sentence 2
        String incompleteMadLib2 = "My teacher told us that <number> dogs can easily jump over a flying <noun> if they wear <plural noun>.";

        // taking user input for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();

        // taking user input for a noun
        System.out.print("Enter a noun: ");
        String noun3 = sc.nextLine();

        // taking user inut for a plural noun
        System.out.print("Enter a plural noun: ");
        String pluralNoun = sc.nextLine();

        // string slicing utilizing < and > signs, then using substring for concatenation
        int start5 = incompleteMadLib2.indexOf("<");
        int end5 = incompleteMadLib2.indexOf(">");
        String part5 = incompleteMadLib2.substring(0, start5);

        int start6 = incompleteMadLib2.indexOf("<", end5 + 1);
        int end6 = incompleteMadLib2.indexOf(">", end5 + 1);
        String part6 = incompleteMadLib2.substring(end5 + 1, start6);

        int start7 = incompleteMadLib2.indexOf("<", end6 + 1);
        int end7 = incompleteMadLib2.indexOf(">", end6 + 1);
        String part7 = incompleteMadLib2.substring(end6 + 1, start7);

        // combining the final end of the string
        String part8 = incompleteMadLib2.substring(end7 + 1);

        // concatenating all parts of the string together
        String finalMadLib2 = part5 + num + part6 + noun3 + part7 + pluralNoun + part8;
        // priniting final Mad Lib
        System.out.println(finalMadLib2);
        
        // close scanner
        sc.close();
    }
}
