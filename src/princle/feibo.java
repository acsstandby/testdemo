package princle;

public class feibo {
    public static void main(String[] args) {
//        int a=1;
//        int b=1;
//        int c=0;
//        for(int i=1;i<10;i++){
//            c=a+b;
//            a=b;
//            b=c;
//            System.out.println(a);
//        }
        System.out.println(digui(3));
    }
    public static int digui(int n){
        if(n==1||n==0){
            return n;
        }
        return digui(n-1)+digui(n-2);

    }
}
