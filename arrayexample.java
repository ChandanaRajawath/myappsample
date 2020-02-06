public class arrayexample {
    public static void main(String[] args) {
        //declare array
        int i;
        int a[];
        int[] b;
        //allocation of memory
        a=new int[5];
        //initialize
        a[0]=10;
        a[1]=20;
        a[2]=50;
        a[3]=40;
        a[4]=80;
        for(i=0;i<a.length;i++)
        System.out.println("value of a["+i+"]:"+a[i]);
        //combining declare and memoryallocation
        int c[]=new int[5];
        //declare+memory+initial
        int d[]=new int[]{1,2,3,4,5};
        for(i=0;i<d.length;i++)
            System.out.println("value of d["+i+"]:"+d[i]);


    }
}
