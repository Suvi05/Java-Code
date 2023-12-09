package Lectures.Interview;

public class Reverse {
    public static void main(String[] args) {
        String org = "Hello";
        String rev = reverseString(org);
    }

    public static String reverseString(String org) {
        if (org.length() == 1) {
            return org;
        } else {
            return reverseString(org.substring(1) + org.charAt(0));
        }
    }
}
