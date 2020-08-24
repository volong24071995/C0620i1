public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public static void main(String[] args) {
        int index=binarySearch(list,59,0, list.length-1);
        System.out.println(index);
    }
    public static int binarySearch(int[] list, int key,int left,int right){
        int mid=left+(right-left)/2;
        if (right>=left){
            if (list[mid]==key){
                return mid;
            }
            if (list[mid]>key){
                right=mid-1;
                return binarySearch(list,key,left,right);
            }
            if (list[mid]<key){
                left=mid+1;
                return binarySearch(list,key,left,right);
            }
        }
        return -1;
    }
}
