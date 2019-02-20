public class Concat {
    public static String s1="String1";
    public static String s2="String2";
    public static String s3="String3";

    public static String concat()
    {
        return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        System.out.println("The concatenated strings are: ");
        System.out.println(concat());
    }


}
