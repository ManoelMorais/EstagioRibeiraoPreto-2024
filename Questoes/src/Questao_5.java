import java.util.Scanner;

public class Questao_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma string: ");
    String text = sc.nextLine();

    int textLength = text.length();
    StringBuilder invertedText = new StringBuilder(textLength);

    for (int i = textLength - 1; i >= 0; i--) {
      invertedText.append(text.charAt(i));
    }

    System.out.println("String original: " + text);
    System.out.println("String invertida: " + invertedText);

    sc.close();
  }
}
