public class Greatest {
    public static void main(String[] args) {
        Integer a=15,b=25,c=45;
        if(a>b){
            if(a>c){
                System.out.println("The greatest number is"+a);
            }
        }
        if(b>c){
            if(b>a){
                System.out.println("The greatest number is"+b);
            }
        }
        else{
            System.out.println("The greatest number is"+c);
        }
    }
}