public class Sorting1 {
  public static void bubbleSort(int[] a,int n){
      boolean isSorted=false;
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
          if(a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            isSorted=true;
          }
        }
        if(!isSorted){
          break;
        }
      }
      displayArray(a);
  }
  public static void selectionSort(int[] a,int n){
      for(int i=0;i<a.length;i++){
        int min=i;
        for(int j=i+1;j<a.length;j++){
          if(a[j]<a[min]){
            min=j;
          }
        }
        if(min!=i){
          int temp=a[min];
          a[min]=a[i];
          a[i]=temp;
        }
      }
      displayArray(a);
  }
  public static void insertionSort(int[] a,int n){
      for(int i=1;i<n;i++){
        int temp=a[i];
        int j=i-1;
        while(j>=0 && a[j]>temp){
          a[j+1]=a[j];
          j--;
        }
        a[j+1]=temp;
      }
      displayArray(a);
  }
  public static void displayArray(int[] a){
    for(int k:a){
      System.out.print(k+" ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int[] array={45,89,12,90,7,32};
    int[] array1={98,23,1,78,54};
    int[] array2={13,56,9,77,21};
    bubbleSort(array,array.length);
    selectionSort(array1,array1.length);
    insertionSort(array2,array2.length);
  }
}
