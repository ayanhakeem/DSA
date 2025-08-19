import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int longest=1;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int s : set){
            if(!set.contains(s-1)){
                int ct=1;
                int x=s;
                while(set.contains(x+1)){
                    x+=1;
                    ct+=1;
                }
                longest=Math.max(longest,ct);
            }
        }
        return longest;

        
    }
}

//tc=o(3n)
//sc=o(n)