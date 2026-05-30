class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double cars[][]=new double[n][2];//stores pos,time to reach target
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];
        }
        //10-1hr
        //8-1hr
        //0-12hr
        //5-7hr
        //3-3hr
        //sort based on position in desending order
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        //10,8,5,3,0
        int cnt=0;
        double prevtime=0;
        for(double car[]:cars){
            if(car[1]>prevtime){//it will come in same fleet
                cnt++;//fleet increase
                prevtime=car[1];//update prevtime
            }
        }
        return cnt;



    }
}

//