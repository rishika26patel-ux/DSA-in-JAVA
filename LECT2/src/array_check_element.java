public class array_check_element {
    static boolean search(int[]arr,int key,int i){
        if(i==arr.length) return false;
        if(arr[i]==key) return true;
        return search(arr,key,i+1);

    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int key=2;
        int i=0;
        System.out.println(search(arr,key ,i));
    }
}
