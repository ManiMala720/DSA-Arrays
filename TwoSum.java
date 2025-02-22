import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
  //1)Brute Force Approach
  public static void usingBrute(int[] a,int target){
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]+a[j]==target){
          System.out.println("The indices of two sum is:"+i+","+j);
          return;
        }
      }
    }
    System.out.println("No pairs found");
  }
  //2)Using HashMap
  public static void usingHashMap(int[] a,int target){
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<a.length;i++){
      int otherNum=target-a[i];
      if(hm.containsKey(otherNum)){
        System.out.println("The indices are:"+hm.get(otherNum)+","+i);
        return;
      }
      hm.put(a[i],i); //array as key,index as value
    }
    System.out.println("No pairs found");
  }
  //3)Using Two Pointer
  public static void usingTwoPointer(int[] a,int target){
    Arrays.sort(a);
    int lt=0;
    int rt=a.length-1;
    while(lt<rt){
     int sum=a[lt]+a[rt];
     if(sum==target){
      System.out.println("The indices are:"+lt+","+rt);
      return;
     }
     else if(sum>target){
      rt--;
     }
     else{
      lt++;
     }
    }
    System.out.println("No pairs found");
  }
  public static void main(String[] args){
    int target=14;
    int[] a={2,5,8,6,11};
    usingBrute(a,target);
    usingHashMap(a,target);
    usingTwoPointer(a,target);
  }
}
