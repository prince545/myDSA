package Strings;

public class Uppercase {

    // method to capitalize the title as per rules
    public static String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] words = title.split(" ");

        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase();  // convert whole word to lowercase first

            if (w.length() >= 3) {
                // capitalize first letter, rest lowercase
                char first = Character.toUpperCase(w.charAt(0));
                sb.append(first).append(w.substring(1));
            } else {
                // if length 1 or 2 → all lowercase
                sb.append(w);
            }

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // main method to test functionality
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe IS aWesoMe";
        System.out.println("Original   : " + title);
        System.out.println("Capitalized: " + capitalizeTitle(title));
    }
}
