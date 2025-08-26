class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();//sorted str,arraylist
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char temp[]=strs[i].toCharArray();//convert to char array
            Arrays.sort(temp);//sort temp arr
            String s=String.valueOf(temp);//again convert to string
            if(map.get(s)!=null){//alredy in map
                List<String>a=map.get(s);//get arraylsit
                a.add(strs[i]);//add in arraylist
                map.put(s,a);//update map
            }else{
                List<String>a=new ArrayList<>();
                a.add(strs[i]);
                map.put(s,a);
            }
        }
        for(Map.Entry<String,List<String>>x:map.entrySet()){//iterate on map entry set means <key,value> pairs get value of x
            ans.add(x.getValue());
        }
        return ans;
    }
}
//tc=o(nlogn)+o(n)
//sc=o(n)