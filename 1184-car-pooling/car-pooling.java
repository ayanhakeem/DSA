class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int m[]=new int[1001];
        for(int a[]:trips){
            m[a[1]]+=a[0];//passengers added
            m[a[2]]-=a[0];//pass exit
        }

        for(int i=0;capacity>=0 && i<1001;i++){
            capacity-=m[i];
        }
        return capacity>=0;//return true if capacity >=0 else false; pass cant be i negative
        
    }
}
//tc=o(n)+o(1001)
//sc=0(1001)