public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static void main(String[] args) {
        int index = binarySearch(list, 59);
        if (index >= 0) {
            System.out.printf("59 xuat hien tai %d", index);
        } else System.out.println("59 khong ton tai");
        System.out.println();
        
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */

    }

    public static int binarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length - 1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (list[mid] == key) {
                return mid;
            }
            if (list[mid] > key) {
                right = mid - 1;
            }
            if (list[mid] < key) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
