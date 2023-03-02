public class cdCheckTwostringareEqualornot {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        // Check if str1 is equal to str2
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }

        // Check if str1 is equal to str3
        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal.");
        } else {
            System.out.println("str1 and str3 are not equal.");
        }
    }
}
