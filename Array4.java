import java.util.ArrayList;
public class Array4 {
  public static void unionOfSortedArrays(int[] a,int[] b){
    ArrayList<Integer> ls=new ArrayList<>();
    int i=0;
    int j=0;
    int m=a.length;
    int n=b.length;
    while(i<m && j<n){
      if(a[i]<=b[j]){
        if(ls.isEmpty() || ls.get(ls.size()-1)!=a[i]){
          ls.add(a[i]);
        }
          i++;
        }
        else{
          if(ls.isEmpty() || ls.get(ls.size()-1)!=b[j]){
          ls.add(b[j]);
          }
          j++;
        }
    }
    while(i<m){
      if(ls.isEmpty() || ls.get(ls.size()-1)!=a[i]){
        ls.add(a[i]);
      }
        i++;
    }
    while(j<n){
      if(ls.isEmpty() || ls.get(ls.size()-1)!=b[j]){
        ls.add(b[j]);
      }
        j++;
    }
    for(int k:ls){
      System.out.print(k+" ");
    }
  }
  public static void intersectionOfSortedArrays(int[] a,int[] b){
    int i=0;
    int j=0;
    int m=a.length;
    int n=b.length;
    ArrayList<Integer> ls1=new ArrayList<>();
    while(i<m && j<n){
      if(a[i]<b[j]){
        i++;
      }
      else if(b[j]<a[i])
      {
        j++;
      }
      else{
        ls1.add(a[i]);
        i++;
        j++;
      }
    }
    for(int k:ls1){
      System.out.print(k+" ");
    }
  }
  public static void main(String[] args) {
    int[] a={1,1,2,3,4,5};
    int[] b={2,3,4,5};
    System.out.println("Union of two sorted arrays:");
    unionOfSortedArrays(a,b);
    System.out.println("Intersection of two sorted arrays:");
    intersectionOfSortedArrays(a,b);
  }
}
