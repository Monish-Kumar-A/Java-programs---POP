public class stringfunctions {
        public static void main(String[] args) {
            // String Creation
            String s = " Hello Java! ";
            System.out.println("Original String: " + s);
    
            // 1. Length of the string
            System.out.println("Length: " + s.length());
    
            // 2. Case Conversion
            System.out.println("Lowercase: " + s.toLowerCase());
            System.out.println("Uppercase: " + s.toUpperCase());
    
            // 3. Trim & Strip (Java 11+)
            System.out.println("Trimmed: '" + s.trim() + "'");
    
            // 4. Character Access
            System.out.println("Character at index 6: " + s.charAt(6));
    
            // 5. String Comparison
            System.out.println("Equals 'hello java!': " + s.trim().equals("hello java!"));
    
            // 6. Checking Start and End
            System.out.println("Starts with ' Hello': " + s.startsWith(" Hello"));
            System.out.println("Ends with 'Java! ': " + s.endsWith("Java! "));
    
            // 7. Searching in a String
            System.out.println("Index of 'Java': " + s.indexOf("Java"));
            System.out.println("Last index of 'l': " + s.lastIndexOf('l'));
            System.out.println("Contains 'Java': " + s.contains("Java"));
    
            // 8. Substring Extraction
            System.out.println("Substring from index 7: " + s.substring(7));
            System.out.println("Substring (7, 11): " + s.substring(7, 11));
    
            // 9. Replace Characters and Strings
            System.out.println("Replace 'Java' with 'World': " + s.replace("Java", "World"));
            System.out.println("Replace 'l' with '*': " + s.replace('l', '*'));
    
            // 10. Splitting a String
            String[] words = s.trim().split(" ");
            System.out.println("Words after split:");
            for (String word : words) {
                System.out.println(word);
            }
    
            // 11. Joining Strings
            String joined = String.join("-", "Hello", "World", "Java");
            System.out.println("Joined String: " + joined);
    
            // 12. Converting Other Types to String
            int num = 100;
            System.out.println("String value of 100: " + String.valueOf(num));
    
            // 13. Convert String to Character Array
            char[] charArray = s.toCharArray();
            System.out.print("Character Array: ");
            for (char c : charArray) {
                System.out.print(c + " ");
            }
            System.out.println();
            
            // 14. Convert String to Integer
            String str = "123";
            int number = Integer.parseInt(str);
            System.out.println("Integer " + number);  // Output: 123
    
        }
    }
    
