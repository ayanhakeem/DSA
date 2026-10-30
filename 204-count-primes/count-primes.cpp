class Solution {
public:
    int countPrimes(int n) {
        if(n<=1) return 0;
        vector<bool>isprime(n,true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i<n;i++){//assume from 2 all are prime
            isprime[i]=true;
        }

        for(int i=2;i*i<n;i++){
            if(isprime[i]){
                for(int j=i*i;j<n;j+=i){
                    isprime[j]=false;///make all multiplies false
                }
            }
        }

        int cnt=0;
        for(int i=2;i<n;i++){
            if(isprime[i]){
                cnt++;
            }
        }

        return cnt;



    }
};