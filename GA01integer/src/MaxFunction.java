
public class MaxFunction {

	private int variable;

    public MaxFunction(int totalVariables) {
        this.variable = totalVariables;
    }

    public int[] generate() {
        int[] maximize = new int[variable];
        for (int x = 0; x < variable; x++) {
            if (x == variable - 1) {
                maximize[x] = (int) (Math.random() * ((20 - 10) + 1)) + 10;
            } else {
                maximize[x] = (int) (Math.random() * ((10 + 10) + 1)) - 10; 
            }
        }
        return maximize;
    }
	
}
