import java.util.Scanner;
public class madLibs {
    public static void main (String[]args){

        // store incomplete Mad Lib in a variable
        String incompleteMadLib = "I went to the animal <noun>; the <plural noun> and the <number> beasts were there.";
        
        // initiate scanner to take user input
        Scanner sc = new Scanner (System.in);

        // prompt user to enter the first blank of the mad lib
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        // prompt user to enter the second blank of the mad lib
        System.out.print("Enter a plural noun: ");
        String pluralNoun = sc.nextLine();

        // prompt user to enter the third blank of the mad lib
        System.out.print("Enter a number: ");
        int nums = sc.nextInt();

        int start1 = incompleteMadLib.indexOf("<");
        int end1 = incompleteMadLib.indexOf(">");
        String part1 = incompleteMadLib.substring(0, start1);

        int start2 = incompleteMadLib.indexOf("<", end1 + 1);
        int end2 = incompleteMadLib.indexOf(">", end1 + 1);
        String part2 = incompleteMadLib.substring(end1 + 1, start2);

        int start3 = incompleteMadLib.indexOf("<", end2 + 1);
        int end3 = incompleteMadLib.indexOf(">", end2 + 1);
        String part3 = incompleteMadLib.substring(end2 + 1, start3);

        String part4 = incompleteMadLib.substring(end3 + 1);

        String finalMadLib = part1 + noun + part2 + pluralNoun + part3 + nums + part4;
        System.out.println(finalMadLib);

        // close scanner
        sc.close();
    }
}