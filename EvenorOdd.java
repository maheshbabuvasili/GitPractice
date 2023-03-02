public class EvenorOdd
{
public static void main(String[] args){
Test.checkEvenorOdd(12);
}
}
class Test
{
public static void checkEvenorOdd(int a){
if(a%2==0)
System.out.println(a+ " is a Even number);
else
System.out.println(a+ " is a Odd number);
}
}