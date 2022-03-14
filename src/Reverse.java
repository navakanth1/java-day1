public class Reverse {
    public static void main(String[] args) {
        Integer a=1996,r=0;
        while(a!=0){
            Integer b=a%10;
            r=r*10+b;
            a/=10;
        }
        System.out.println("the reversed number is"+r);
    }
}