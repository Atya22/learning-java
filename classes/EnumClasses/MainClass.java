package EnumClasses;

public class MainClass {
    public static void main(String[] args) {
//        EnumClasses.Days day = EnumClasses.Days.SUNDAY;
//
//        switch (day) {
//            case MONDAY:
//                System.out.println("Monday");
//                break;
//            case TUESDAY:
//                System.out.println("Tuesday");
//                break;
//            case WEDNESDAY:
//                System.out.println("Wednesday");
//                break;
//            case THURSDAY:
//                System.out.println("Thursday");
//                break;
//            case FRIDAY:
//                System.out.println("Friday");
//                break;
//            case SATURDAY:
//                System.out.println("Saturday");
//                break;
//            case SUNDAY:
//                System.out.println("Sunday");
//                break;
//        }


//        for (Lights light : Lights.values()){
//            System.out.println(light + " " + light.getAction());
//            }

        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getFormatInfo());
        }
    }
}
