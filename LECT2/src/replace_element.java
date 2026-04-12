
public class replace_element{
    static void replace(int[]arr,int i){
        if(i==arr.length) return;
        if(arr[i]==2) arr[i]=5;
        replace(arr,i+1);
    }
    public static void main(String[]args){
        int[]arr={1,2,2,3,2,4,2,2};
        int i=0;
       replace(arr,i);
       for(int j=0;j<arr.length;j++){
           System.out.print(arr[j] +" ");
       }

    }
}
