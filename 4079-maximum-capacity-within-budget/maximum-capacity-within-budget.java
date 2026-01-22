class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n=costs.length;
        int machines[][]=new int[n][2];
        for(int i=0;i<n;i++){
            machines[i][0]=costs[i];
            machines[i][1]=capacity[i];
        }

        Arrays.sort(machines,Comparator.comparingInt(a->a[0]));

        int ans=0;
        
        //one machine
        for(int i=0;i<n;i++){
            if(machines[i][0]<budget){
                ans=Math.max(ans,machines[i][1]);
            }
        }

        int prefix[]=new int[n];
        prefix[0]=machines[0][1];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],machines[i][1]);
        }

        //two machines
        for(int r=1;r<n;r++){//we fix  2nd machines at idx then find in left by applying bs to select 1st machin which will fit our budget
            int remaining=budget-machines[r][0];//remaining cost 
            if(remaining<=0) continue;//alredy full

            int l=0,h=r-1,idx=-1;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(machines[mid][0]<remaining){
                    idx=mid;
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }

            if(idx!=-1){
                ans=Math.max(ans,prefix[idx]+machines[r][1]);//why prfix[idx] means we take max capacity upto r idx
            }

        }
        
        return ans;

        
    }
}