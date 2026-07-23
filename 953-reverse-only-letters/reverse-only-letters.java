class Solution {
    private void swap(char arr[],int i,int j){
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            if(!Character.isLetter(arr[l])){
                l++;
            }else if(!Character.isLetter(arr[r])){
                r--;
            }else{
                swap(arr,l,r);
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}