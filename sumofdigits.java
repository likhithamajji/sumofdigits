class sumofdigits{
    public static void main(String[] args){
        int n=54;
        sumofdigits(n);
    }
    public static void sumofdigits(int n){
        int sum=0;
        while(n!=0){
int k=n%10;
sum+=k;
n=n/10;
        }
        System.out.println(sum);
    }
}