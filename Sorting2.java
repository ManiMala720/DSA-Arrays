import java.util.ArrayList;
public class Sorting2 {
  public static void mergeSort(int[] a,int lt,int rt){
    if(lt>=rt){
      return;
    }
    int mid=(lt+rt)/2;
    mergeSort(a, lt, mid);
    mergeSort(a, mid+1, rt);
    merge(a,lt,rt,mid);
  }
  public static void merge(int[] a,int lt,int rt,int mid){
    ArrayList<Integer> ls=new ArrayList<>();
    int high=mid+1;
    int low=lt;
    while(low<=mid && high<=rt){
      if(a[low]<a[high]){
        ls.add(a[low]);
        low++;
      }
      else{
        ls.add(a[high]);
        high++;
      }
    }
    while(low<=mid){
      ls.add(a[low]);
      low++;
    }
    while(high<=rt){
      ls.add(a[high]);
      high++;
    }
    for(int i=0;i<ls.size();i++){
      a[lt+i]=ls.get(i);
    }
  }
  public static void quickSort(int[] a,int lt,int rt){
    if(lt>=rt){
      return;
    }
    int partition=findPivot(a,lt,rt);
    quickSort(a, lt, partition-1);
    quickSort(a, partition+1,rt);
  }
  public static int findPivot(int[] a,int lt,int rt){
    int pivot=a[lt];
    int i=lt+1;
    int j=rt;
    while(i<=j){
    while(i<=rt && a[i]<=pivot){
      i++;
    }
    while(j>lt && a[j]>pivot){
      j--;
    }
    if(i<j){
      swap(a,i,j);
    }
  }
    swap(a,j,lt);
    return j;
  }
  public static void swap(int[] a,int i,int j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
  public static void main(String[] args){
    int[] array={34,12,89,7,66};
    int[] array1={87,3,54,90,21};
    mergeSort(array,0,array.length-1);
    System.out.println("Using Merge Sort");
    for(int i:array){
      System.out.print(i+" ");
    }
    quickSort(array1,0,array1.length-1);
    System.out.println("Using Quick Sort");
    for(int i:array1){
      System.out.print(i+" ");
    }
  }
}
