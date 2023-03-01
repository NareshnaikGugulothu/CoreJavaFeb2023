package firstclass;

public class numberatevenposition {
    public static void main(String[] args){
        int[] input = {34, 67, 81, 97, 45, 54, 90, 83};

        for(int i = 1; i < input.length; i+=2) {
            System.out.println(input[i]+ "");
        }
    }
}
