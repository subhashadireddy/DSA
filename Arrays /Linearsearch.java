
public class linearsearch {
    public static int Linearsearch(int num[] , int key){
        for(int i=0;i<num.length;i++)
        {
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num[] = {2,3,4,5,6,7};
        int key = 2;
        int index = Linearsearch(num,key);
        if(index == -1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key Found at:"+ index);
        }
    }
}
