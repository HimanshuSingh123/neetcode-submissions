class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanedString = new StringBuilder();
        for(Character c : s.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                continue;
            }
            cleanedString.append(Character.toLowerCase(c));
        }
        String stringCS = cleanedString.toString();
        int p1 = 0;
        int p2 = stringCS.toCharArray().length-1;

        while(p1 < p2){
            if(stringCS.charAt(p1) == stringCS.charAt(p2)){
                p1 += 1;
                p2 -= 1;
            } else {
                return false;
            }
        }

        return true;

    }
}
