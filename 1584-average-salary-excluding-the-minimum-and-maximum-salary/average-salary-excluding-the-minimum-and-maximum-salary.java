class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        Arrays.sort(salary);
        double sum=0;
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
        }
        double avg=sum/(n-2);
        return avg;
    }
}