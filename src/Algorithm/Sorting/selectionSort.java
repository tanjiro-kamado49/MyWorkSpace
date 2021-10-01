package Algorithm.Sorting;
public class selectionSort{
    public static void main(String[]args){
        int []arr={7,4,10,8,3,1};
        System.out.println("Elements in array before sorting: ");
        for(int x:arr)
            System.out.print(x+" ");
        System.out.println("\n ");
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for( int j=i+1;j<arr.length;j++){
                if(arr[min]> arr[j]){

                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("Elements in array after sorting: ");
        for(int x:arr)
                System.out.print(x+" ");
    }
}