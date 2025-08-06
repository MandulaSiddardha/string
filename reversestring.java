class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";
        for (int i=0;i<original.length();i++) {
            reversed =original.charAt(i)+reversed;
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
