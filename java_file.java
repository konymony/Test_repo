public class java_file{
  public static void main(String[] args){
    System.out.println("hope this works");
    System.out.println(add1(2));
    String b = "abc";
    System.out.print(b);
    int[] m = {2, 3, 4, 5, 6};
    printarray(iseven(m));
  }


  public static int add1(int a){
    return a+1;
  }
  public static boolean[] iseven(int[] x){
    boolean[] boos = new boolean[x.length];
    int[] rand = {2, 3, 4, 7};
    for(int i=0; i<x.length; i++){
      if(x[i]%2==0){
        boos[i] = true;
      } else {
        boos[i] = false;
      }
    }
    return boos;
  }
  public static void printarray(boolean[] a){
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
  public static void printarray2(int[] a){
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
}
