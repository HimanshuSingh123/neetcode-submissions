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
        for(int rowWindow = 0; rowWindow < 9; rowWindow += 3){
            for(int colWindow = 0; colWindow < 9; colWindow += 3){
                HashSet<Character> seen = new HashSet<>();
                for(int row = rowWindow; row < rowWindow+3; row++){
                    for(int col = colWindow; col < colWindow+3; col++){
                        if(board[row][col] == '.'){
                            continue;
                        }
                        if(seen.contains(board[row][col])){
                            return false;
                        }
                        seen.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }
}
