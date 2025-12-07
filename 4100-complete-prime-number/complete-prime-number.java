class Solution {
    public boolean primenum(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;

        }
        return true;
    }
    public boolean completePrime(int num) {
        
        String s=String.valueOf(num);
        int n=s.length();
        //check for prefix one by one
        for(int i=1;i<=n;i++){
            int prefix=Integer.parseInt(s.substring(0,i));
            if(!primenum(prefix)) return false;
        }
        //check for suffix 
        for(int i=0;i<n;i++){
            int suffix=Integer.parseInt(s.substring(i));
            if(!primenum(suffix)) return false;
        }

        

        return true;
    }
}

//tc=