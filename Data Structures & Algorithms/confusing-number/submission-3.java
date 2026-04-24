class Solution {
    public boolean confusingNumber(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);
        int original = n;
        int reversed = 0;
        int num =0;

        while(n>0){

            int rem = n%10;

            if(!map.containsKey(rem)) return false;

            reversed= reversed * 10 + map.get(rem);

            n=n/10;
        }


        // while(reversed>0){
        //     num = num*10 + reversed%10;
        //     reversed = reversed/10;
        // }

        return reversed!=original;
    }
}
