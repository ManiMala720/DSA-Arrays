public class binarySearch{
  public static void firstAndLastOccurance(int[] a,int s){
    int lt=0;
    int rt=a.length-1;
    int first=-1;
    int last=-1;
    while(lt<=rt){
      int mid=(lt+rt)/2;
      if(s<a[mid]){
        rt=mid-1;
      }
      else if(s>a[mid]){
        lt=mid+1;
      }
      else{
       if(first==-1) first=mid;
       if(last==-1) last=mid;
       int left=mid-1;
       int right=mid-1;
       while(lt<=left && a[left]==s){
         first=left;
         left--;
       }
       while(right<=rt && a[right]==s){
        last=right;
        right++;
       }
       break;
      }
    }
    System.out.println(first+" "+last);
  }
  public static void main(String[] args) {
    int[] a={1,1,1,1,1,2};
    int s=1;
    firstAndLastOccurance(a, s);
    
  }
}