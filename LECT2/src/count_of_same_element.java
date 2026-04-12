////public class count_of_same_element{
////    static boolean search(int[]arr,int key,int i){
////        if(i==arr.length) return
////        if(arr[]==key)
////        return search(arr,key,i+1);
////
////    }
////    public static void main(String[]args){
////        int arr[]={1,2,2,4,5};
////        int key=2;
////        int i=0;
////        System.out.println(search(arr,key ,i));
////    }
////}
//
//
//public class count_of_same_element{
//
//    public static int count(int[] arr, int index, int target) {
//        // Base case: end of array
//        if (index == arr.length) {
//            return 0;
//        }
//
//        // Check current element
//        if (arr[index] == target) {
//            return 1 + count(arr, index + 1, target);
//        } else {
//            return count(arr, index + 1, target);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 2, 8, 2, 3};
//        int target = 2;
//
//        int result = count(arr, 0, target);
//        System.out.println("Count = " + result);
//    }
//}


public class count_of_same_element{
    static int findoccure(int[]arr,int key,int i){
        if(i==arr.length) return 0;
        int count=(arr[i]==key)? 1:0;
        return count + findoccure(arr,key,i+1);
    }
    public static void main(String[]args){
        int[]arr={1,2,2,3,2,4,2,2};
        int key=2;
        int i=0;
        System.out.println(findoccure(arr,key,i+1));
    }
}