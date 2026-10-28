class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length; row++){
            HashSet<Character> tracker = new HashSet<>();
            for(int col = 0; col < board.length; col++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(tracker.contains(board[row][col])){
                    return false;
                }
                tracker.add(board[row][col]);
            }
        }
        for(int col = 0; col < board.length; col++){
            HashSet<Character> tracker = new HashSet<>();
            for(int row = 0; row < board.length; row++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(tracker.contains(board[row][col])){
                    return false;
                }
                tracker.add(board[row][col]);
            }
        }
        for(int rowMax = 0; rowMax < 9; rowMax += 3){
            for(int colMax = 0; colMax < 9; colMax += 3){
                HashSet<Character> tracker = new HashSet<>();
                    for(int row = rowMax; row < rowMax + 3; row++){
                        for(int col = colMax; col < colMax + 3; col++){
                            if(board[row][col] == '.'){
                                continue;
                            }
                            if(tracker.contains(board[row][col])){
                                return false;
                            }
                            tracker.add(board[row][col]);
                        }
                    }
                }
        }
        return true;
    }
}

