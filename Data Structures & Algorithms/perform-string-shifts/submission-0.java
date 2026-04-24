class Solution {
    public String stringShift(String s, int[][] shift) {
        int n = s.length();
        if(n==0) return "";

        int net =0;

        for(int[] arr:shift){
            int dir = arr[0];
            int amt = arr[1]%n;
            net += (dir==1)?amt:-amt;
        }

            net = ((net%n) + n)%n;
            
            if(net==0) return s;
            
            StringBuilder str = new StringBuilder(n);

            str.append(s,n-net,n);
            str.append(s,0,n-net);

        return str.toString();
    }
}
