class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(s1.isEmpty()){
                s1.push(c);
            }else if((c==')')&&s1.peek()=='('){
                s1.pop();
            }else if((c=='}')&&s1.peek()=='{'){
                s1.pop();
            }else if((c==']')&&s1.peek()=='['){
                s1.pop();
            }else{
                s1.push(c);
            }
        }
        return s1.isEmpty(); 
    }
}