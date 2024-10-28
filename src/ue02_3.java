import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {
        int r = 4;
        double x;
        double y;
        double hypotenuseInput;

        Out.print("X-Koordinate: ");
        x = In.readDouble();
        Out.print("Y-Koordinate: ");
        y = In.readDouble();
        hypotenuseInput = Math.sqrt(x*x + y*y);

        if(x > 0 && y > 0 && x <= r && y <= r && hypotenuseInput >= r){
            Out.println("Punkt liegt innerhalb der grünen Fläche.");
        }else{
            Out.println("Punkt liegt außerhalb.");
        }
    }
}
