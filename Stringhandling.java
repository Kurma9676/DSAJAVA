/*In java,String is an object that represents a sequence of charecters.Strings are the instances
 * of the class java.lang.String..Strings are immutable,meaning we  cannot modify the strings once it
 * is created.once we perform any operation on the string, a new string is created.
 * it is used for the manipulation of text such as storing, comparing, and manipulating strings.
 * The String class provides various methods for string manipulation, such as concatenation, substring,
 * character extraction, and searching.
 * real time applications of strings include user input handling, text processing,
 * data validation, and formatting output.
 * The String class is widely used in Java programming for tasks such as file handling, database operations,
 */
class Stinghandling {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int l= str.length();
        System.out.println("Original: " + str);
        System.out.println("length: " + l);
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        String r=str.replace('l', 'x');
        System.out.println("Replace 'l' with 'x': " + r);
        String m=str.trim();
        System.out.println("Trimmed: " + m);
        String[] words = str.split(", ");
        for (String word : words) {
            System.out.println("Split word: " + word);
        }
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println(sb);
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("Reversed: " + sb);
        sb.reverse();
        sb.replace(7,12,"Kurma");
        System.out.println("After replace: " + sb);
        System.out.println("Final String: " + sb.substring(7, 12));

    }}
