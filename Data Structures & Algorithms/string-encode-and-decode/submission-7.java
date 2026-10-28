class Solution {

    public String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();

        for(String str : strs){
            enc.append(str.length()).append('#').append(str);
        }

        return enc.toString();
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

            result.add(str.substring(start,end));

            index = end;
        }

        return result;

    }
}
