import java.util.Scanner;

//@author Laldhan
//lexicographically means alphabetically
public class IntroToStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        //.length() will give you the length of a string
        System.out.println(A.length() + B.length());
        /*.compareTo will give a value 0, positive or negative
        if the value is 0, both strings are lexicographically equal
        if the value is positive, the first string is greater than the second
        if the value is negative, the second string is greater than the first
        */
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
       /* substring() returns a new string that is a substring of given string
        Two ways it can be used
        1. String substring(int beginIndex)
        2. String substring(int beginIndex, int endIndex)
        In the code below I have accessed the first element of the String and converted to UpperCase
        and added the rest of the string beginning at index 1
        */
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

    }

}
