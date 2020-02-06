public class fibnocii {
    public static void main(String[] args){
        int n1=0,n2=1,n3,i,n=10;

            for(i=1;i<n;i++) {
                if(n1<10) {
                    System.out.println(+ n1);
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                }
                else {
                    continue;
                }
        }


    }

}
