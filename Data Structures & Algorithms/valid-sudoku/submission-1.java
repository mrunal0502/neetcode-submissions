class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n= board.length;
        HashSet<Character> [] rows = new HashSet[9];
        HashSet<Character> [] cols = new HashSet[9];
        HashSet<Character> [] boxes = new HashSet[9];

        for(int i=0; i<n; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                char c = board[i][j];
                if(c=='.') continue;
                int boxIndex = (i/3)*3 + (j/3);
                if(rows[i].contains(c)|| cols[j].contains(c)|| boxes[boxIndex].contains(c)){
                    return false;
                }

                rows[i].add(c);
                cols[j].add(c);
                boxes[boxIndex].add(c);
            }
        }
       
        return true;
    }
}
