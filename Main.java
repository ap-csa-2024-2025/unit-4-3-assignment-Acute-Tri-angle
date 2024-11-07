import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // write solutions to problems here
    //p1
    for (int i = 1; i <= 25; i += 2){
      System.out.print(i + "\n");
    }

    //p2
    for (int i = 17; i <= 73; i++){
      if (i % 10 == 7){
        System.out.println("");
      }
      System.out.print(i + " ");
    }
    
    //p3
    System.out.println("");
    System.out.println("enter an integer between 0 and 50:");
    int x = sc.nextInt();
    if (x > 0 && x <= 50){
      for (int i = x; i <= 50; i++){
        if (i % 5 == (x % 5)){
          System.out.println("");
        }
        System.out.print(i + " ");
      }
    }
    else{
      System.out.println("error");
    }

    //p4
    System.out.println("");
    System.out.println("enter a postive integer:");
    x = sc.nextInt();
    if (x > 0){
      for (int i = x; i >= 0; i--){
        if (i % 3 == 0){
          System.out.print(i + " ");
        }
      }
    }
    else{
      System.out.println("error");
    }
    sc.close();
  }
}
