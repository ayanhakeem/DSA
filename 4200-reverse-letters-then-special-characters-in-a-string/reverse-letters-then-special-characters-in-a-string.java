class Solution {
    public void swap(char arr[],int a,int b){
        char t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public String reverseByType(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            if(!Character.isLowerCase(arr[l])){
                l++;
            }else if(!Character.isLowerCase(arr[r])){
                r--;
            }else{
                swap(arr,l,r);
                l++;
                r--;
            }
        }
        l=0;
        r=n-1;
        while(l<r){
            if(Character.isLetterOrDigit(arr[l])){
                l++;
            }else if(Character.isLetterOrDigit(arr[r])){
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