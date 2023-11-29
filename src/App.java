public class App {
    public static void main(String[] args) throws Exception {
        //From the word "Hello World!" We have 11 characters
        
        //HELLO WORLD!
        //01234567891011

        // The count should START WITH ZERO
        String str = "Hello World!";
        System.out.println(str); // Hello World!

        // E.g We want to show the "e" in "Hello World"
        // We used the index 1 to show the letter e
        char let = str.charAt(1);
        System.out.println(let); // e

        // length(): Returns the length of the string.
        int length = str.length();
        System.out.println(length); // Output: 11

        // indexOf(substring, start): Returns the index of the first occurrence of the substring within the string, starting from the specified index.
        int index = str.indexOf("World", 6);
        System.out.println(index); // Output: 6

        // lastIndexOf(substring, start): Returns the index of the last occurrence of the substring within the string, starting from the specified index.
        int lastIndex = str.lastIndexOf("llo", 5);
        System.out.println(lastIndex); // Output: 3

        // substring(start, end): Extracts a substring from the string.
        String substring = str.substring(6, 11);
        System.out.println(substring); // Output: World

        //toUpperCase(): Converts the string to uppercase.
        String uppercase = str.toUpperCase();
        System.out.println(uppercase); // Output: HELLO WORLD

        // toLowerCase(): Converts the string to lowercase.
        String lowercase = str.toLowerCase();
        System.out.println(lowercase); // Output: hello world

        //trim(): Removes leading and trailing whitespaces from the string.
        String word = "  Hello World  ";
        String trimmed = word.trim();
        System.out.println(trimmed); // Output: Hello World

        //replace(oldChar, newChar): Replaces all occurrences of the specified character with another character.
        String replaced = str.replace('l', 'p');
        System.out.println(replaced); // Output: Heppo World

        //equals(str): Compares the current string to the specified string and returns true if they are equal, and false otherwise.
        String str1 = "Hello World";
        String str2 = "Hello World";
        boolean equal = str1.equals(str2);
        System.out.println(equal); // Output: true

    }
}
