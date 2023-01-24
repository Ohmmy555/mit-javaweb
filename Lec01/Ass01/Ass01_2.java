package Lec01.Ass01;

public class Ass01_2 {
    try (Scanner input = new Scanner(System.in)) {
        int number1 = 0;
        System.out.print("Enter number : ");
        number1 = input.nextInt();
        for(int i=1;i<13;i++) {
        System.out.println(number1+" x "+i+" = "+(number1*i));
        }
        }
}
