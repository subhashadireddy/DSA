public class secretcode_decrementcharbyk {
    public static void main(String[] args){
        String str = "hello";
        int k=4; // or use sc.nextInt()%26
        String res = new String();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch-k < 97)
            {
                res= res+(char)((ch-k)+26);
            }
            else
            {
                res = res+(char)(ch-k);
            }
        }
        System.out.println("The Encoded Str is:"+res);
        }
}
