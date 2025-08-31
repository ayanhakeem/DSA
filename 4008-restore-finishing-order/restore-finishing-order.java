class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=order.length;
        ArrayList<Integer>ans=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int i:friends){
            set.add(i);
        }
        for(int i=0;i<n;i++){
            if(set.contains(order[i])){
                ans.add(order[i]);
            }
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
        
    }
}