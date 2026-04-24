class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n= board.length;
        //check for row
        for(int i=0; i<n; i++){
           HashSet<Character> rowSet = new HashSet<>();
           for(int j=0; j<n; j++){
              char c = board[i][j];
              if(c=='.') continue;
              if(rowSet.contains(c)){
                 return false;
              }

              rowSet.add(c);
           }
        }

        //check for column
        for(int j=0; j<n; j++){
           HashSet<Character> colSet = new HashSet<>();
           for(int i=0; i<n; i++){
              char c = board[i][j];
              if(c=='.') continue;
              if(colSet.contains(c)){
                 return false;
                }
              colSet.add(c);
           }
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
        for (int boxCol = 0; boxCol < 3; boxCol++) {
        HashSet<Character> boxSet = new HashSet<>();
        for (int i = boxRow * 3; i < boxRow * 3 + 3; i++) {
            for (int j = boxCol * 3; j < boxCol * 3 + 3; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (boxSet.contains(c)) return false;
                boxSet.add(c);
            }
        }
    }
}



        return true;
    }
}
