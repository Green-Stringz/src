public class LeapYear {
    public static void main(String[] args) {
        int count = 0;
        for(int years = 101; years <= 2100; years ++) {
            if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(years);
                } else
                    System.out.print(years + "\t");
            }
        }
    }
}
