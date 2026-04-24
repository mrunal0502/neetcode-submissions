class Solution {
    public int findLonelyPixel(char[][] picture) {
        int n = picture.length;
        int m = picture[0].length;

        int rows[] = new int[n];
        int cols[] = new int[m];

        for(int i=0;i<n;i++){
           for(int j=0; j<m; j++){
               if(picture[i][j]=='B'){
                  rows[i]++;
                  cols[j]++;
               }
           }
        }

        int answer=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(picture[i][j]=='B' && rows[i]==1 && cols[j]==1){
                    answer++;
                }
            }
        }


        return answer;
    }
}
