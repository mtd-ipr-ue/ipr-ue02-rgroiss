import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {
        
        int max = 0;
        int number1;
        int number2;
        int number3;

        Out.print("Erste Zahl: ");
        number1 = In.readInt();
        Out.print("Zweite Zahl: ");
        number2 = In.readInt();
        Out.print("Dritte Zahl: ");
        number3 = In.readInt();

        if(number1 > number2){max = number1;}
        else{max = number2;}
        if(number3 > max){max = number3;}

        Out.print("Größte Zahl: " + max);
    }
}
