class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length; row++){
            HashSet<Character> seen = new HashSet<>();
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(seen.contains(board[row][col])){
                    return false;
                }
              seen.add(board[row][col]);  
            }
        }
        for(int col = 0; col < board.length; col++){
            HashSet<Character> seen = new HashSet<>();
            for(int row = 0; row < board[col].length; row++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(seen.contains(board[row][col])){
                    return false;
                }
              seen.add(board[row][col]);  
            }
        }

        for(int startRow = 0; startRow < 9; startRow+=3){
            for(int startCol = 0; startCol < 9; startCol+=3){

                HashSet<Character> set = new HashSet<>();

                for(int row = startRow; row < startRow + 3; row++){
                    for(int col = startCol; col < startCol + 3; col++){
                        if(board[row][col] == '.'){
                            continue;
                        }
                        if(set.contains(board[row][col])){
                            return false;
                        }
                        set.add(board[row][col]);
                    }
                }
            }
        }


        return true;
    }
}
