class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int mindiff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int abs=Math.abs(arr[i-1]-arr[i]);
            if(abs<mindiff){
                mindiff=abs;
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<n;i++){
           
            int abs1=Math.abs(arr[i-1]-arr[i]);
            if(abs1==mindiff){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
            
        }
        return ans;
        
    }
}