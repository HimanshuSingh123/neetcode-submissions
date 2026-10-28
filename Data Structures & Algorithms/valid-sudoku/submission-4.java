class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length; row++){
            HashSet<Character> seen = new HashSet<>();
            for(int col = 0; col < board.length; col++){
                Character letter = board[row][col];
                if(letter == '.'){
                    continue;
                }
                if(seen.contains(letter)){
                    return false;
                }
                seen.add(letter);
            }
        }
        for(int col = 0; col < board.length; col++){
            HashSet<Character> seen = new HashSet<>();
            for(int row = 0; row < board.length; row++){
                Character letter = board[row][col];
                if(letter == '.'){
                    continue;
                }
                if(seen.contains(letter)){
                    return false;
                }
                seen.add(letter);
            }
        }
        for(int rowWindow = 0; rowWindow < 9; rowWindow += 3){
            for(int colWindow = 0; colWindow < 9; colWindow += 3){
                HashSet<Character> seen = new HashSet<>();
                for(int row = rowWindow; row < rowWindow + 3; row++){
                    for(int col = colWindow; col < colWindow + 3; col++){
                        Character letter = board[row][col];
                        if(letter == '.'){
                            continue;
                        }
                        if(seen.contains(letter)){
                            return false;
                        }
                        seen.add(letter);
                    }
                }
            }
        }
        return true;
    }
}
