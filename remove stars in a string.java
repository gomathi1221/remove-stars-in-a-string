class Solution {
    public String removeStars(String s) {
      Stack<Character> st=new Stack<>();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='*'){
            st.push(s.charAt(i));
        }
        else{
            st.pop();
        }
      } 
      String p="";
      while(!st.isEmpty()){
       p=p+st.pop();
      } 
     int l=0;
     int ri=p.length()-1;
     char[] r=p.toCharArray();
     while(l<=ri){
        char t=r[l];
        r[l]=r[ri];
        r[ri]=t;
        l++;
        ri--;
     }
     return new String(r);
    }
}