import java.util.*;
public class FourSum{
  public static List<List<Integer>> bruteForce(int[] a,int t){
    int n=a.length;
    HashSet<List<Integer>> hs=new HashSet<>();
    for(int i=0;i<n-3;i++){
      for(int j=i+1;j<n-2;j++){
        for(int k=j+1;k<n-1;k++){
          for(int l=k+1;l<n;l++){
            if(a[i]+a[j]+a[k]+a[l]==t){
              List<Integer> ls=Arrays.asList(a[i],a[j],a[k],a[l]);
              Collections.sort(ls);
              hs.add(ls);
            }
          }
        }
      }
    }
    return new ArrayList<>(hs);
  }
  public static List<List<Integer>> betterWay(int[] a,int target){
    HashSet<List<Integer>> hs=new HashSet<>();
    int n=a.length;
    for(int i=0;i<n-2;i++){
      for(int j=i+1;j<n-1;j++){
        HashSet<Integer> set=new HashSet<>();
        for(int k=j+1;k<n;k++){
          int quad=target-(a[i]+a[j]+a[k]);
          if(set.contains(quad)){
            List<Integer> ls=Arrays.asList(a[i],a[j],a[k],quad);
            Collections.sort(ls);
            hs.add(ls);
          }
          else{
            set.add(a[k]);
          }
        }
      }
    }
    return new ArrayList<>(hs);
  }
  public static List<List<Integer>> optimalSolution(int[] a,int target){
    HashSet<List<Integer>> hs=new HashSet<>();
    Arrays.sort(a);
    for(int i=0;i<a.length-3;i++){
      if(i>0 && a[i]==a[i-1]){
        continue;
      }
      for(int j=i+1;j<a.length-2;j++){
       if(j!=i+1 && a[j]==a[j-1]){
         continue;
       }
       int k=j+1;
       int l=a.length-1;
       while(k<l){
         int sum=a[i]+a[j]+a[k]+a[l];
         if(sum==target){
           List<Integer> ls=Arrays.asList(a[i],a[j],a[k],a[l]);
           hs.add(ls);
           while(k<l && a[k]==a[k+1]){
             k++;
           }
           while(k<l && a[l]==a[l-1]){
             l--;
           }
           k++;
           l--;
          }
          else if(sum<target){
           k++;
          }
          else{
           l--;
          }
        }
      }
    }
    return new ArrayList<>(hs);
  }
  public static void main(String[] args){
    int[] nums={1,0,-1,0,-2,2};
    int target=0;
    System.out.println(bruteForce(nums,target));
    System.out.println(betterWay(nums,target));
    System.out.println(optimalSolution(nums,target));
  }
}