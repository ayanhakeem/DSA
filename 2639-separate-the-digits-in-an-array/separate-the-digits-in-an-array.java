// class Solution {
//     public int[] separateDigits(int[] nums) {
//        int l=nums.length;
//        List<Integer>ans=new ArrayList<>();
//        for(int i=0;i<l;i++){
//         int n=nums[i];
//         String s=Integer.toString(n);
//         for(int j=0;j<s.length();j++){
//             int x=s.charAt(j)-'0';
//             ans.add(x);
//         }
//        }
//        int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
//        return arr;
       

//     }
// }


class Solution {
    public int[] separateDigits(int[] nums) {
        int l=nums.length;
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<l;i++){
            List<Integer> temp = new ArrayList<>();
            int n=nums[i];
            while(n>0){
                int lastdigit=n%10;
                temp.add(lastdigit);
                n=n/10;
            }
            Collections.reverse(temp);
            ans.addAll(temp);
        }
        int arr[]=new int[ans.size()];
        int k=0;
        for(int i:ans){
            arr[k++]=i;
        }
        return arr;

    }
}

//tc=o(n*l)+o(nlogn)+o(n)
//sc=o(n)


