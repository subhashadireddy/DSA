public class max_subarraysum_ofsizek {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8};
        int k=3;
        int l=0;
        int r=0;
        int sum=0,max=0;
        while(r<a.length)
        {
            sum=sum+a[r];
            if(r-l == k-1)
            {
                if(max<sum)
                {
                    max = sum ;
                }
                sum=sum-a[l];
                l++;
            }
            r++;

        }
        System.out.println("Max sum is :"+max);

    }
}
