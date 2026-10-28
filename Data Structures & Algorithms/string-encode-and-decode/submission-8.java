class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoder = new StringBuilder();
        for(String str : strs){
            encoder.append(str.length()).append('#').append(str);
        }

        return encoder.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int divider = 0;
        int pointer = 0;
        while(pointer < str.length()){
            divider = pointer;
            while(str.charAt(divider) != '#'){
                divider++;
            }

            int length = Integer.parseInt(str.substring(pointer, divider));

            int start = divider + 1;
            int end = start + length;

            result.add(str.substring(start, end));

            pointer = end;
        }
        return result;
    }
}
