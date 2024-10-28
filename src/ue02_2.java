import libraries.Out;
import libraries.In;

public class ue02_2 {
    public static void main(String[] args) {
        int year;
        int month;
        int days = 0;

        Out.print("Jahreszahl: ");
        year = In.readInt();
        Out.print("Monat (1-12): ");
        month = In.readInt();

            switch(month){
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;
                break;
                case 4, 6, 9, 11:
                    days = 30;
                break;
                case 2:
                    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                        days = 29;
                    }else{
                        days = 28;
                    }
                break;
                default: Out.println("Monat muss zwischen 1-12 sein.");
            }
        Out.println("Tage: " + days);
    }
}
