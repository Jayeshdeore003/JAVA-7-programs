class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring (0-5): " + str.substring(0, 5));
    }
}