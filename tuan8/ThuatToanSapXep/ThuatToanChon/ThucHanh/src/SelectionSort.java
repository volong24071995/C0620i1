public class SelectionSort {
    public static void main(String[] args) {
        int [] arr=new int[5];
        for (int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*9+1);
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            int min=arr[i];
            int indexMin=i;
            for (int j=i+1;j< arr.length;j++){
                if (min>arr[j]){
                    min=arr[j];
                    indexMin=j;
                }
            }
            if (indexMin!=i){
                arr[indexMin]=arr[i];
                arr[i]=min;
            }
        }
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}
