import java.util.*;
public class ThreeSum {
  public static List<List<Integer>> bruteForce(int[] a){
    HashSet<List<Integer>> hs=new HashSet<>();
    for(int i=0;i<a.length-2;i++){
      for(int j=i+1;j<a.length-1;j++){
        for(int k=j+1;k<a.length;k++){
          if(a[i]+a[j]+a[k]==0){
            List<Integer> ls=Arrays.asList(a[i],a[j],a[k]);
            Collections.sort(ls);
            hs.add(ls);
          }
        }
      }
    }
    return new ArrayList<>(hs);
  }
  public static List<List<Integer>> betterWay(int[] a){
    HashSet<List<Integer>> set=new HashSet<>();
    for(int i=0;i<a.length-1;i++){
      HashSet<Integer> hs=new HashSet<>();
      for(int j=i+1;j<a.length;j++){
        int third=-(a[i]+a[j]);
        if(hs.contains(third)){
          List<Integer> temp =Arrays.asList(a[i],a[j],third);
          Collections.sort(temp);
          set.add(temp);
        }
        else{
          hs.add(a[j]);
        }
      }
    }
    return new ArrayList<>(set);
  }
 public static List<List<Integer>> optimalSolution(int[] a){
   List<List<Integer>> ls=new ArrayList<>();
   Arrays.sort(a);
   for(int i=0;i<a.length-2;i++){
    if(i>0 && a[i]==a[i-1]){
      continue;
    }
   int j=i+1;
   int k=a.length-1;
   while(j<k){
   int sum=a[i]+a[j]+a[k];
   if(sum==0){
    List<Integer> triplets=Arrays.asList(a[i],a[j],a[k]);
    ls.add(triplets);
    while(j<k && a[j]==a[j+1]){
     j++;
    }
    while(j<k && a[k]==a[k-1]){
      k--;
    }
    j++;
    k--;
   }
   else if(sum<0){
    j++;
   }
   else{
    k--;
   }
  }
}
   return ls;
 }
  public static void main(String[] args){
    int[] nums={-1,0,1,2,-1,-4};
    System.out.println(bruteForce(nums));
    System.out.println(betterWay(nums));
    System.out.println(optimalSolution(nums));
  }
}
