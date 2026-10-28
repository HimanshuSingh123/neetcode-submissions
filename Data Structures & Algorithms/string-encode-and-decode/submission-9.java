class Solution {

    public String encode(List<String> strs) {
        StringBuilder b = new StringBuilder();

        for(String str : strs){
            b.append(str.length()).append('#').append(str);
        }

        return b.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int divider = 0;
        int index = 0;

        while(index < str.length()){
            divider = index;
            while(str.charAt(divider) != '#'){
                divider++;
            }

            int length = Integer.parseInt(str.substring(index, divider));

            int start = divider + 1;
            int end = start + length;
            
            String word = str.substring(start,end);
            result.add(word);
            index = end;
        }
        return result;
    }
}
