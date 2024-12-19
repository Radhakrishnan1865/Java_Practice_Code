package collection;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String s = "radhakrishnan automation engineer";

        // Remove spaces from the string to count only characters
       String processedString = s.replaceAll(" ", "");

        // Create a HashMap to store character occurrences
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        //char c='\0';
        for (char c : processedString.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum occurrence
        char maxChar = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Display the occurrences of each character
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Display the character with the maximum occurrence
        System.out.println("\nCharacter with the maximum occurrence:");
        System.out.println(maxChar + " (occurred " + maxCount + " times)");
    }
}