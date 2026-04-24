class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int n = word.length();
        int m = abbr.length();
        int i=0;
        int j=0;

        while(i<n && j<m){
           char ch = abbr.charAt(j);

           if(Character.isLetter(ch)){
             if(word.charAt(i)!=ch) return false;
             i++;
             j++;
           }else if(Character.isDigit(ch)){
             if(ch=='0') return false;
                 int num = 0;
                while(j<m && Character.isDigit(abbr.charAt(j))){
                    num = num*10 + abbr.charAt(j)-'0';
                    j++;
                }

                i=i+num;
                if(i>n) return false;
            }else{
                return false;
            }
        } 
       
       return j==m && i==n;
    }
}