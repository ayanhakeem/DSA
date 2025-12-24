class Solution {
    public int maximumSum(int[] nums) {
        
        int max=0;
        
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        ArrayList<Integer>l3=new ArrayList<>();


        for(int n:nums){
            if(n%3==0) l1.add(n);
            else if(n%3==1) l2.add(n);
            else l3.add(n);
        }

        l1.sort(Collections.reverseOrder());
        l2.sort(Collections.reverseOrder());
        l3.sort(Collections.reverseOrder());

        if(l1.size()>=3){//for case 0+0+0
            max=Math.max(max,l1.get(0)+l1.get(1)+l1.get(2));
        }
        if(l2.size()>=3){//1+1+1 means remider when we do n%3
            max=Math.max(max,l2.get(0)+l2.get(1)+l2.get(2));
        }
        if(l3.size()>=3){//2+2+2
            max=Math.max(max,l3.get(0)+l3.get(1)+l3.get(2));
        }
        if(!l1.isEmpty() && !l2.isEmpty() && !l3.isEmpty()){
            max=Math.max(max,l1.get(0)+l2.get(0)+l3.get(0));
        }
        
        return max;

        
    }
}

//tc=o(n)+o(n log n)
//sc=o(n3)