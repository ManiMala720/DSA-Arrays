public class Array1{
  //Finding Largest No
  public static void largestNo(int[] a){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println("The Largest No is:"+max);
  }
  //Finding Second Largest No
  public static void secondLargestNo(int[] a){
    if(a.length<2){
      System.out.println("Array should have 2 distinct elements");
      return;
    }
    int firstLargest=a[0];
    int secondLargest=Integer.MIN_VALUE;
    for(int i=1;i<a.length;i++){
      if(a[i]>firstLargest){
        secondLargest=firstLargest;
        firstLargest=a[i];
      }
      else if(a[i]<firstLargest && a[i]>secondLargest){
        secondLargest=a[i];
      }
    }
    System.out.println("Second Largest Number is:"+secondLargest);
  }
  //Finding Second Smallest No
  public static void secondSmallestNo(int[] a){
    if(a.length<2){
      System.out.println("Array should have 2 distinct elements");
      return;
    }
    int firstSmallest=a[0];
    int secondSmallest=Integer.MAX_VALUE;
    for(int i=1;i<a.length;i++){
      if(a[i]<firstSmallest){
        secondSmallest=firstSmallest;
        firstSmallest=a[i];
      }
      else if(a[i]>firstSmallest && a[i]<secondSmallest){
        secondSmallest=a[i];
      }
    }
    if(secondSmallest==Integer.MAX_VALUE){
      System.out.println("No second smallest element found");
    }
    System.out.println("Second Smallest No is:"+secondSmallest);
  }
  //Linear Search
  public static void linearSearch(int[] a,int search){ 
   boolean found=false;
    for(int i=0;i<a.length;i++){
      if(a[i]==search){
        System.out.println("Search element "+search+" found at index "+i);
        found=true;
        break;
      }
    }
    if(!found){
      System.out.println("Element "+search+" not found");
    }
  }
  //Binary Search
  public static int binarySearch(int[] a,int search){
    int lt=0;
    int rt=a.length-1;
    while(lt<=rt){
      int mid=(lt+rt)/2;
      if(search>a[mid]){
        lt=mid+1;
      }
      else if(search<a[mid]){
        rt=mid-1;
      }
      else{
        return mid;
      }
    }
   return -1;
  }
  public static void main(String[] args){
    int[] a={34,89,10,7,7,89,12};
    int[] b={12,34,45,67,90};//Sorted Array for binary search
    largestNo(a);
    secondLargestNo(a);
    secondSmallestNo(a);
    linearSearch(a,12);
    int index=binarySearch(b,90);
    if(index!=-1){
      System.out.println("Element found at index:"+index);
    }
    else{
      System.out.println("Element not found");
    }
  }
}
