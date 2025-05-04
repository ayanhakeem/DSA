class Solution {
    public int maxProduct(int n) {
        String num=String.valueOf(n);
        int arr[]=new int[num.length()];
        int max=0;
        for(int i=0;i<num.length();i++){
            arr[i]=num.charAt(i)-'0';;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int mul=arr[i]*arr[j];
                max=Math.max(max,mul);
                
            }
        }
        return max;
    }
}