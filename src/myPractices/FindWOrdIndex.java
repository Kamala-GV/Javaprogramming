package myPractices;

public class FindWOrdIndex {
    public static void main(String[] args) {
        String sentence = "Java is my job  because I am SDET";
        String word = "SDET";

        int position = findIndexOfGivenWord(sentence, word);
        System.out.println(position);

    }

    private static int findIndexOfGivenWord(String sentence, String word) {

        String[] words = sentence.split(" ");
        int counter = 0;

        for (String each : words) {
            counter++;
            if (each.equals(words)) {
                break;
            }
        }
        return counter;
    }
}


