class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();//first we have to create adj list for graph bcoz topo works on only on dag if cycle exist means we cant finish the tasks 
        //for finish tasks it should be in liniar order so..

        //we solve by using topo sort means khan's algo (bfs)
        int V=numCourses;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int n=prerequisites.length;
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer>topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo.add(node);

            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }

        }

        if(topo.size()==V) return true;
        return false;



    }
}