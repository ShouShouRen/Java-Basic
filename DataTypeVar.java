public class DataTypeVar{
  public static void main(String[] args){
    // 在終端機印出各種資料型態的資料
    int x;
    x = 2;
    // 整數 預設是int型態
    System.out.println(x);
    x = 120;
    System.out.println(x);
    // 長整數 數字後面特別加上 L
    long y = 20000000000000000L;
    System.out.println(y);
    // 浮點數 預設為double 型態
    double m = 3.141592653589793;
    System.out.println(m);
    // 單精度浮點數 數字後面加上 F
    float n = 3.141592653589793F;
    System.out.println(n);
    // 布林值
    System.out.println(false);
    // 字元 只能一個字元
    char c = 'a';
    System.out.println(c);
    // 字串 可以包涵 0 到多個字元
    String s = "abcdefghijklmnopqrst";
    System.out.println(s);

  }
}