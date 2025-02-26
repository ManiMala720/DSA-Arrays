import java.util.ArrayList;
import java.util.List;
public class Pascal{
  public static void findElementPosition(int n,int r){
    n-=1;
    r-=1;
    if(r>n || r<0 || n<0){
      System.out.println("Invalid row and column");
    }
    long res=1;
    for(int i=0;i<r;i++){
      res=res*(n-i)/(i+1);
    }
    System.out.println("Element "+res+" found at "+n+"th row and "+r+"th column");
  }
  public static void printNthRow(int n){//1-based indexing for row
    if(n<=0){
      System.out.println("Illegal row");
    }
    ArrayList<Long> ls=new ArrayList<>();
    long res=1;
    ls.add(res);
    for(int i=1;i<n;i++){ //0-based indexing for column
      res=res*(n-i)/i;
      ls.add(res);
    }
    System.out.println("Elements of "+n+" th row are "+ls);
  }
  public static void printEntireTriangle(int n){
    System.out.println("Pascal triangle having "+n+" rows");
    List<List<Long>> ls=new ArrayList<>();
    for(int i=1;i<=n;i++){
      List<Long> temp=generateSingleRow(i);
      ls.add(temp);
    }
    System.out.println(ls);
  }
  public static List<Long> generateSingleRow(int n){
    List<Long> ls1=new ArrayList<>();
    long res=1;
    ls1.add(res);
    for(int i=1;i<n;i++){
      res=res*(n-i)/i;
      ls1.add(res);
    }
    return ls1;
  }
  public static void main(String[] args){
    System.out.println("Finding an element at given row and column:");
    findElementPosition(5,3);//row,column
    System.out.println("Print the nth row:");
    printNthRow(5);
    printEntireTriangle(5);
  }
}