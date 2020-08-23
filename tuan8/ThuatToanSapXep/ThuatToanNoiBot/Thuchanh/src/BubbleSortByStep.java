public class BubbleSortByStep {
    public static void main(String[] args) {
        int [] arr=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=(int)(Math.random()*9+1);
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        bubbleSortByStep(arr);
    }
    
    public static void bubbleSortByStep(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }

}
