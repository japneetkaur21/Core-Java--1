public class CountWords {
    public static void main(String[] args) {

        String input = "This is is a string string one string";
        String words[] = input.split(" ");
        System.out.println("The duplicate words are: ");

        for (int i = 0; i < words.length; i++) {
            int wrc=1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wrc = wrc + 1;
                    words[j] = "";

                }

            }
            if (words[i] != "" && wrc>1) {
                System.out.println(words[i] + "-" + wrc);
            }
        }
    }
}
