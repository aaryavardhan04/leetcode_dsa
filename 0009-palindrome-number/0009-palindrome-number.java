class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int temp=0;
        int copy=x;
        while(copy !=0 && copy>0){
            temp= copy%10;
            copy /= 10;
            num = num*10 + temp;
            System.out.println(num);
        }
        if(x==num){
            return true;
        }
        return false;
    }
}