// Write a program to Check whether the given character is vowel or consonant and return a suitable message.

public class Program7 {
public static void main(String[] args) {
    char ch = 'a';

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        System.out.println(ch + " is a Vowel");
    } else {
        System.out.println(ch + " is a Consonant");
    }
}   
}
    