import java.util.Arrays;
public class Array3{
  //Count Occurances Of An Element
  public static void countOccurance(int[] a,int element){
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]==element){
        count++;
      }
    }
    System.out.println("Element "+element+" appears "+count+" times");
  }
  //Move Zeros To End
  public static void moveZeros(int[] a){
    int i=0;
    while(i<a.length){
      if(a[i]==0){
        break;
      }
      i++;
    }
    for(int j=i+1;j<a.length;j++){
      if(a[j]!=0){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
      }
    }
    for(int k:a){
      System.out.print(k+" ");
    }
    System.out.println();
  }
  //Maximum Consecutive Ones
  public static void maxConsecutiveOnes(int[] a){
    int max=0;
    int cnt=0;
    for(int i=0;i<a.length;i++){
      if(a[i]==1){
        cnt++;
        max=Math.max(max,cnt);
      }
      else{
        cnt=0;
      }
    }
    System.out.println("Maximum Consecutive Ones in the array:"+max);
  }
  //Find the numbers that appears once,others are twice
  public static void singleAppearance(int[] a){
    for(int i=0;i<a.length;i++){
      int cnt=0;
      for(int j=0;j<a.length;j++){
        if(a[i]==a[j]){
          cnt++;
        }
      }
      if(cnt==1){
        System.out.println(a[i]+" appears only once");
      }
    }
    //Find the numbers that appears once,others are twice using XOR
    int xor1=0;
    for(int i=0;i<a.length;i++){
      xor1=xor1^a[i];
    }
    System.out.println(xor1+ " appears only once");
  }
  //Frequency Of Elements
  public static void frequencyOfElements(int[] a){
    Arrays.sort(a);
    int cnt=1;
    System.out.println("Frequency of elements");
    for(int i=0;i<a.length-1;i++){
      if(a[i]==a[i+1]){
        cnt++;
      }
      else{
        System.out.println(a[i]+" appears "+cnt+" times");
        cnt=1;
      }
    }
    System.out.println(a[a.length-1]+" appears "+cnt+" times");
  }
  public static void main(String[] args) {
    int[] array1={12,23,34,12,67,12};
    int[] array2={1,0,23,0,45,0,9,0,10};
    int[] array3={1,0,1,1,0,0,1,1,1,0};
    int[] array4={1,6,7,0,1,0,5,5,6};
    countOccurance(array1,12);
    moveZeros(array2);
    maxConsecutiveOnes(array3);
    singleAppearance(array4);
    frequencyOfElements(array4);
  }
}