package Strings;

public class Compression {

    // returns compressed version of the string
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // count the number of repeats
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));      // add the character
            if (count > 1) {
                sb.append(count);          // add the count if > 1
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbbcccd";
        System.out.println("Original: " + s);
        System.out.println("Compressed: " + compress(s));
    }
}
