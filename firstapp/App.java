public class App {
  public static void main(String[] args){
    System.out.println("What hath God wrought?");
    int x = 0;
    while (x < 10){
      x++;
      System.out.println(x);
    }
    for (int i = 0; i < 10; i++){
      System.out.println(Math.round(Math.random() * 10));
    }
    // comment
    /* 
      comment 
    */
  }
}