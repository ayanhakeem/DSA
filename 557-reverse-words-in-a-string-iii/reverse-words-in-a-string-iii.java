class Solution {
    private String reverse(String s){
        char a[]=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r){
           char t=a[l];
           a[l]=a[r];
           a[r]=t;
           l++;
           r--; 
        }
        return new String(a);
    }
    public String reverseWords(String s) {
       String arr[]=s.split(" ");
       StringBuilder sb=new StringBuilder();
       int n=arr.length;
       for(int i=0;i<n;i++){
         sb.append(reverse(arr[i]));
         if(i!=n-1){
            sb.append(" ");
        }
       }
       return sb.toString();
    }
}