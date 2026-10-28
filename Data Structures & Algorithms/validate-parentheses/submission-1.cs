public class Solution {
    public bool IsValid(string s) {
        Stack<char> theStack = new Stack<char>();
        Dictionary<char, char> theDict = new Dictionary<char, char>{
            {')', '('},
            {']', '['},
            {'}', '{'}
        };
        foreach(char c in s){
            if(c.Equals('(') || c.Equals('{') || c.Equals('[')){
                theStack.Push(c);
            }
            else{
                if(theStack.Count == 0){
                    return false;
                }
                if(theStack.Pop() != theDict[c]){
                    return false;
                }
            }
        }
        return theStack.Count == 0;
    }
}
