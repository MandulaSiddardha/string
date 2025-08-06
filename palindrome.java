class palindrome{
  public static void main(String[] args){
    String name = "Madam";
    
    String lowerName = name.toLowerCase();
    
    boolean isPalindrome=true;
    int left = 0;
    int right = lowerName.length()-1;
    while(left<right){
        if(lowerName.charAt(left) != lowerName.charAt(right)){
            isPalindrome=false;
            break;
        }
        left++;
        right--;
    }
    if(isPalindrome){
        System.out.println(name +" is a Palindrome");
    }else{
        System.out.println(name+" is not a palindrome");
    }
}
