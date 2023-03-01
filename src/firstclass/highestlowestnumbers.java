package firstclass;
public class highestlowestnumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 15, -1, 23, 45, 70, 99, -13, -5};

        int highestNumber = numbers[0];
        int lowestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
            if (numbers[i] < lowestNumber) {
                lowestNumber = numbers[i];
            }
        }
            System.out.println("HIGHESTNUMBER: "+highestNumber);
            System.out.println("LOWESTNUMBERS: "+lowestNumber);
    }
}
