import java.util.Scanner;

public class SpoonerismGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SpoonerismGenerator generator = new SpoonerismGenerator();
        int choice;

        do {
            generator.run();
            System.out.println("\nWant to try again? (1)Yes (2)No");
            choice = scan.nextInt();
            scan.nextLine();
        } while (choice == 1);
    }

    public void run() {
        String firstWord = getWord("Word 1: ");
        String secondWord = getWord("Word 2: ");
        
        int firstVowelIndex1 = vowelIndex(firstWord);
        int firstVowelIndex2 = vowelIndex(secondWord);

        if (firstVowelIndex1 == -1 || firstVowelIndex2 == -1) {
            System.out.println("\n" + firstWord + " and " + secondWord + " are not good words to spoonerize.");
            return;
        }

        String spoonerizedWord1 = secondWord.substring(0, firstVowelIndex2) + firstWord.substring(firstVowelIndex1);
        String spoonerizedWord2 = firstWord.substring(0, firstVowelIndex1) + secondWord.substring(firstVowelIndex2);

        System.out.println("\n" + firstWord + " and " + secondWord + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
    }

    private String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

    private int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (isVowel(currentChar)) {
                if (i == 0) {
                    return -1;
                }
                return i;
            }
        }
        return -1;
    }

    private boolean isVowel(char character) {
        return "aeiou".indexOf(Character.toLowerCase(character)) != -1;
    }
}
