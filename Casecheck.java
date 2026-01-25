import java.util.Scanner;

public class Casecheck {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
//    String word = "bhumi";
//    System.out.println(word.charAt(0));
    char ch = in.next().trim().charAt(0);

    if(ch >= 'a' && ch <= 'z'){
      System.out.println("lowercase");
    }else{
      System.out.println("uppercasae");
    }
//    System.out.println(ch);
  }
}
