class Solution {
    public boolean isPalindrome(String s) {

        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");

        int n = str.length();
        int i=0;
        while(i<n){
            System.out.println("for i "+i);
            System.out.println(str.charAt(i));
            System.out.println(str.charAt(n-i-1));
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }

            i++;
        }
        

        return true;

    }
}
