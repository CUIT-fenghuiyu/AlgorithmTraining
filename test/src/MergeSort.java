public class MergeSort {
    public static int sum=0;

    public static void main(String[] args) {
        int[] arr = {1,23,4,7,2,8,9,3};
        mergeSort(arr,0,arr.length-1);
        for(int item : arr){
            System.out.println(item);
        }
        System.out.println(sum);
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(arr==null || arr.length<2){
            return;
        }
        process(arr,left,right);
    }

    public static void process(int[] arr, int left, int right){
        if(left==right){
            return;
        }
        int mid = left+(right-left)/2;
        process(arr,left,mid);
        process(arr,mid+1,right);
        mergeSum(arr,left,mid,right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] newArr= new int[right-left+1];
        int i=0;
        int p1=left;
        int p2=mid+1;
        while (p1<=mid && p2<=right){
            newArr[i++]=arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }

        while (p1<=mid){
            newArr[i++]=arr[p1++];
        }

        while (p2<=right){
            newArr[i++]=arr[p2++];
        }

        for(i=0; i< newArr.length; i++){
            arr[left+i] = newArr[i];
        }
    }

    public static void mergeSum(int[] arr, int left, int mid, int right){
        int[] newArr= new int[right-left+1];
        int i=0;
        int p1=left;
        int p2=mid+1;
        while (p1<=mid && p2<=right){
            if(arr[p1]<arr[p2]){
                sum+=(right-p2+1)*arr[p1];
                newArr[i++]=arr[p1++];
            }else {
                newArr[i++]=arr[p2++];
            }
        }

        while (p1<=mid){
            newArr[i++]=arr[p1++];
        }

        while (p2<=right){
            newArr[i++]=arr[p2++];
        }

        for(i=0; i< newArr.length; i++){
            arr[left+i] = newArr[i];
        }
    }
}
