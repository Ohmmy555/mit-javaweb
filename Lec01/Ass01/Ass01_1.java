package Lec01.Ass01;
import java.util.*;
public class Ass01_1 {
    Scanner inputdata = new Scanner(System.in);
float number1 = 0;
float number2 = 0;
String operator = "";
System.out.print("Enter number 1 : ");
number1 = inputdata.nextFloat();
System.out.print("operator + - * / : ");
operator = inputdata.next();
if(operator.equals("+")) {
System.out.print("Enter number 2 : ");
number2 = inputdata.nextFloat();
System.out.print(number1 + " + " + number2 + " = " + (number1+number2));
}else if(operator.equals("-")) {
System.out.print("Enter number 2 : ");
number2 = inputdata.nextFloat();
System.out.print(number1 + " - " + number2 + " = " + (number1-number2));
}else if(operator.equals("*")) {
System.out.print("Enter number 2 : ");
number2 = inputdata.nextFloat();
System.out.print(number1 + " x " + number2 + " = " + (number1*number2));
}else if(operator.equals("/")) {
System.out.print("Enter number 2 : ");
number2 = inputdata.nextFloat();
if(number2 == 0) {
System.out.println("จำนวนหารไม่ถูกต้อง!!!");
}else {
System.out.print(number1 + " / " + number2 + " = " + (number1/number2));
}
}else {
System.out.println("กรุณาเลือก Operator: +,-,*,/ เท่านั้น");
}
}
