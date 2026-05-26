class Solution {
    public int passwordStrength(String password) {
        int n=password.length();
        Set<Character>set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            set.add(password.charAt(i));
        }
        int sum=0;
        for(int i:set){
            if(Character.isLowerCase(i)){
                sum+=1;
            }else if(Character.isUpperCase(i)){
                sum+=2;
            }else if(Character.isDigit(i)){
                sum+=3;
            }else{
                sum+=5;
            }
        }
        return sum;
    }
}