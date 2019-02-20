public class ReverseString {
    public static void main(String[] args) {
        StringBuffer input= new StringBuffer("To The New Noida");
        input=input.reverse();
        System.out.println("The reversed String is: "+input);
        input=input.replace(4,9, "");
        System.out.println(input);

    }

}
