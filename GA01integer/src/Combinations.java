
public class Combinations {

	public static void correctSizeConverter(String[] memo, int n) {
        String[] temp = new String[memo.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memo[i];
        }

        for (int i = 0; i < temp.length; i++) {
            memo[i] = temp[i].substring(26 - n, 26 - 1);
        }
    }
    
    public String[] generateAllCombinations(int[][] parameters) {
        int totalCombinations = (int) Math.pow(2, parameters.length);
        String[] memo = new String[totalCombinations];
        for (int i = 0; i < totalCombinations; i++) {
            memo[i] = String.format("%26s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        correctSizeConverter(memo, parameters.length);
        return memo;
    }
	
}
