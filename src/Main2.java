interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n){
        int total=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                total+=i;
            }
            
        }
        return total;
    }
}
class Main2{
    public static void main(String yup[]){
        int n=6;
        MyCalculator m=new MyCalculator();
        System.out.println(m.divisor_sum(n));
    }
}