public class InsertionSort {
    public static void main(String[] args) {
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*9+1);
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        insertionSort(arr);
    }

    public static void insertionSort(int []arr){
        int j;
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            for (j=i-1;j>=0&& arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        for (int k : arr) {
            System.out.print(k + ", ");
        }
    }
}
