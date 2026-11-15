public static void main(String[] args){
int ans = factorial(4);
System.out.println(ans);
}
static int factorial(int n){
    int fact = 1;
    for(int i=1; i<=n; i++){
        fact = fact*i;
    }
    return fact;
}