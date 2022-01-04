public class StudyFee {
    public static void main(String[] args) {
        double Current_Amount = 10000;
        for(int years = 1; years <= 10; years ++){
            Current_Amount = Current_Amount * 1.05;
        }
        System.out.println((int)Current_Amount);
        double firstyears = Current_Amount;
        int sum = (int)firstyears;
        for(int i = 1; i < 4; i ++){
            firstyears = firstyears * 1.05;
            sum += (int)firstyears;
        }
        System.out.println(sum);
    }
}
