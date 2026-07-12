class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int temp[]=arr.clone();//copy the arr into temp

        Arrays.sort(temp);
        Map<Integer,Integer>map=new HashMap<>();
        int cnt=1;
        for(int i:temp){
            if(!map.containsKey(i)){
                map.put(i,cnt++);
            }
        }

        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;


        
    }
}

// temp=10,20,30,40

// map-10,1
// 20,2
// 30,2
// 49=0,4


