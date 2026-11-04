class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();

        for(String s : strs){
            string.append(s.length()).append('#').append(s);
        }
        System.out.println(string.toString());
        return string.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int divider = 0;
        int i = 0;
        while(i < str.length()){
            divider = i;
            while(str.charAt(divider) != '#'){
                System.out.println(str.charAt(divider));
                divider++;
            }
            System.out.println(str.substring(i, divider));

            int length = Integer.parseInt(str.substring(i, divider));

            int start = divider + 1;
            int end = start + length;

            String word = str.substring(start,end);

            i = end;

            result.add(word);
        }

        return result;
    }
}
