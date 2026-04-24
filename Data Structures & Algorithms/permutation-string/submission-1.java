
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        int m = s1.length(), n = s2.length();
        if (m > n) return false;

        // sort s1
        char[] a = s1.toCharArray();
        Arrays.sort(a);
        String sortedS1 = new String(a);

        // slide over s2 windows of length m
        for (int i = 0; i <= n - m; i++) {
            // take substring of length m
            String temp = s2.substring(i, i + m);

            // sort temp
            char[] b = temp.toCharArray();
            Arrays.sort(b);
            String sortedTemp = new String(b);

            // compare
            if (sortedTemp.equals(sortedS1)) {
                return true;
            }
        }
        return false;
    }
}
