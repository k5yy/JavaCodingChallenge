package Week2.Day4;

public class AnimalLegCount {
    public static int totalLegs(int chickens, int cows, int pigs) {

        //chickens = 2 legs
        //cows = 4 legs
        //pigs = 4 legs

        int chickenLegs = 2 * chickens;
        int cowLegs = 4 * cows;
        int pigLegs = 4 * pigs;

        int totalLegs = chickenLegs + cowLegs + pigLegs;
        return totalLegs;
    }

    public static void main(String[] args) {
        //animals(2, 3, 5) ➞ 36 (output)
        int totalLegsCount = totalLegs(2,3,5);
        System.out.println("Total number of legs " + totalLegsCount);
    }
}
