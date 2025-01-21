
public class reverseString {
    public static void main(String[] args) {
        String str = "india is my country";
        System.out.println(rS(str));
    }
    static String rS(String str){
        StringBuilder reversedSentence = new StringBuilder();

        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder(str.substring(start, i));
                word.reverse();
                reversedSentence.append(word).append(" ");
                start = i + 1;
            }
        }
        StringBuilder lastWord = new StringBuilder(str.substring(start));
        lastWord.reverse();
        reversedSentence.append(lastWord);
        return reversedSentence.toString();
    }
}