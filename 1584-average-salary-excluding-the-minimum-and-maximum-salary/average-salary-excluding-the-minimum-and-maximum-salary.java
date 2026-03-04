class Solution {
    public double average(int[] salary) {
        int n = salary.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;

        for(int i = 0; i < n; i++){
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
            sum += salary[i];
        }

        sum = sum - max - min;

        return sum / (n - 2);
    }
}








// class Solution {
//     public double average(int[] salary) {
//         int n=salary.length;
//         Arrays.sort(salary);
//         double sum=0;
//         for(int i=1;i<n-1;i++){
//             sum+=salary[i];
//         }
//         double avg=sum/(n-2);
//         return avg;
//     }
// }