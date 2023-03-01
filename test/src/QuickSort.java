public class QuickSort {
    public static void main(String[] args) {

    }

    public static void quick1(int[] arr){
        if (arr==null || arr.length<=2){
            return;
        }

        partation(arr,0,arr.length-1);
    }

    public static int[] partation(int[] arr, int left, int right){
        int[] partaion=new int[2];

        int tag=arr[right];
        int p1=-1; //小于num区域
        int p2=0; //指针遍历
        while (p2<=right-1){
            if(arr[p2]<=tag){
                arr[p1++]=arr[p2++];
            }else {
                p2++;
            }
        }
    }
}
