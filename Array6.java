import java.util.ArrayList;

public class Array6 {
  public static void alternativeNumbers(int[] arr){
    ArrayList<Integer> pos=new ArrayList<>();
    ArrayList<Integer> neg=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      if(arr[i]>=0){
        pos.add(arr[i]);
      }
      else{
        neg.add(arr[i]);
      }
    }
    if(pos.size()>neg.size()){
      for(int i=0;i<neg.size();i++){
        arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);
      }
      int index=2*neg.size();
      for(int i=neg.size();i<pos.size();i++){
        arr[index]=pos.get(i);
      }
    }
    else{
      for(int i=0;i<pos.size();i++){
        arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);
      }
      int index1=2*pos.size();
      for(int i=pos.size();i<neg.size();i++){
        arr[index1]=neg.get(i);
      }
    }
    
  }
  public static void main(String[] args) {
    int[] arr={1,2,-3,-1,-2,-3};
    alternativeNumbers(arr);
    for(int i:arr){
      System.out.print(i+" ");
    }
  }
}
