class TimeMap {
    private Map<String,TreeMap<Integer,String>>map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new TreeMap<>());
        }
        map.get(key).put(timestamp,value);//insertion o(logn)
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        TreeMap<Integer,String>timestamps=map.get(key);
        Map.Entry<Integer,String>entry=timestamps.floorEntry(timestamp);//floor entry means largest value<=required timestamp find it
        return entry==null?"":entry.getValue();
    }
}


// public class TimeMap {
//     private Map<String, Map<Integer, List<String>>> keyStore;

//     public TimeMap() {
//         keyStore = new HashMap<>();
//     }

//     public void set(String key, String value, int timestamp) {
//         if (!keyStore.containsKey(key)) {
//             keyStore.put(key, new HashMap<>());
//         }
//         if (!keyStore.get(key).containsKey(timestamp)) {
//             keyStore.get(key).put(timestamp, new ArrayList<>());
//         }
//         keyStore.get(key).get(timestamp).add(value);
//     }

//     public String get(String key, int timestamp) {
//         if (!keyStore.containsKey(key)) {
//             return "";
//         }
//         int seen = 0;

//         for (int time : keyStore.get(key).keySet()) {
//             if (time <= timestamp) {
//                 seen = Math.max(seen, time);
//             }
//         }
//         if (seen == 0) return "";
//         int back = keyStore.get(key).get(seen).size() - 1;
//         return keyStore.get(key).get(seen).get(back);
//     }
// }
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */