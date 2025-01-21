import java.util.ArrayList;

public class StringRecursion {
    public static void main(String[] args) {
        System.out.println(skip("saihlsaapplehillihaappleas"));
    }

    static void skip(String process, String unprocess) {
        if (unprocess.isEmpty()) {
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        if (ch == 'a') {
            skip(process, unprocess.substring(1));
        } else {
            skip(process + ch, unprocess.substring(1));
        }
    }

    static String skip(String unprocess) {
        if (unprocess.isEmpty()) {
            return "";
        }
        char ch = unprocess.charAt(0);
        if (ch == 'a') {
            return skip(unprocess.substring(1));
        }
        return ch + skip(unprocess.substring(1));
    }

    static String skipApple(String unprocess) {
        if (unprocess.isEmpty()) {
            return "";
        }
        if (unprocess.startsWith("apple")) {
            return skipApple(unprocess.substring(5));
        }
        return unprocess.charAt(0) + skipApple(unprocess.substring(1));
    }

    static String skipAppNotApple(String unprocess) {
        if (unprocess.isEmpty()) {
            return "";
        }
        if (unprocess.startsWith("app") && !unprocess.startsWith("apple")) {
            return skipAppNotApple(unprocess.substring(3));
        }
        return unprocess.charAt(0) + skipAppNotApple(unprocess.substring(1));
    }
}
