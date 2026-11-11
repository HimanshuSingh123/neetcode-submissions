class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int col = 0; col < board.length; col++){
            ArrayList<Character> tracker = new ArrayList<>();
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

        for(int row = 0; row < board.length; row++){
            ArrayList<Character> tracker = new ArrayList<>();
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
        for(int rowMax = 0; rowMax < board.length; rowMax += 3){
            for(int colMax = 0; colMax < board.length; colMax +=3){
                ArrayList<Character> tracker = new ArrayList<>();
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
