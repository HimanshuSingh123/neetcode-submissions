class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String str : strs){
            encoded.append(str.length()).append('#').append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int divider = 0;
        int i = 0;

        while(i < str.length()){
            divider = i;

            while(str.charAt(divider) != '#'){
                divider++;
            }

            int length = Integer.parseInt(str.substring(i, divider));

            int start = divider + 1;
            int end = start + length;

            result.add(str.substring(start,end));

            i = end;
        }
        return result;
    }
}
