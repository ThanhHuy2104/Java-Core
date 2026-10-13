 public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.isEmpty());
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('C'));
        System.out.println(s.contains("Core"));
        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(5));
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
