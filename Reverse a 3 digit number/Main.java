import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int first_digit,second_digit,third_digit,n,result;
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    first_digit=n/100;
    second_digit=((n/10)%10);
    third_digit=n%10;
    result=(third_digit*100)+(second_digit*10)+first_digit;
    System.out.println(result);
  }
}