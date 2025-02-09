public class Array2 {

  //Check if an array is sorted or not
  public static boolean isSorted(int[] a){
    if(a.length==1){
      return true;
    }
    for(int i=0;i<a.length-1;i++){
      if(a[i]>a[i+1]){
        return false;
      }
    }
    return true;
  }
  //Remove duplicates from sorted array
  public static void removeDuplicates(int[] a){
    int i=0;
    for(int j=1;j<a.length;j++){
      if(a[i]!=a[j]){
        a[i+1]=a[j];
        i++;
      }
    }
    System.out.println("Length of an array having unique elements:"+(i+1));
    System.out.println("After removing duplicate elements");
    for(int k=0;k<i+1;k++){
      System.out.print(a[k]+" ");
    }
    System.out.println();
  }
  //Reversing an array
  public static void reverseArray(int[] a){
    int lt=0;
    int rt=a.length-1;
    while(lt<=rt){
      int temp=a[lt];
      a[lt]=a[rt];
      a[rt]=temp;
      lt++;
      rt--;
    }
    System.out.println("Reversed Array");
    for(int i:a){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  //Find a single missing no
  public static void findMissingNo(int[] a){
    int n=a.length+1;
    int result=n*(n+1)/2;
    int sum=0;
    for(int i=0;i<a.length;i++){
      sum+=a[i];
    }
    System.out.println("Missing Number is:"+(result-sum));
  }
  //Left rotate an array by k places
  public static void leftRotate(int[] a,int k){
    int n=a.length;
    k=k%n;
    reverse(a,0,k-1);
    reverse(a,k,n-1);
    reverse(a,0,n-1);
    System.out.println("Left rotate an array by k places");
    for(int i:a){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public static void reverse(int[] a,int lt,int rt){
    while(lt<=rt){
      int temp=a[lt];
      a[lt]=a[rt];
      a[rt]=temp;
      lt++;
      rt--;
    }
  }
  public static void main(String[] args){
    int[] array={34,45,45,56,67,67};
    int[] array1={1,2,3,4,6};
    boolean result=isSorted(array);
    if(!result){
     System.out.println("Array is not sorted");
    }
    else{
      System.out.println("Array is sorted");
    }
    removeDuplicates(array);
    reverseArray(array);
    findMissingNo(array1);
    leftRotate(array1,7);
  }
}
