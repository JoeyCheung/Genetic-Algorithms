
public class Constraints {

	private int totalVariables;

    public Constraints(int variables) {
        this.totalVariables = variables;
    }

   public int[][] generateConstraintFunctions() {
       int[][] functionsList = new int[totalVariables][totalVariables];

       for (int i = 0; i < totalVariables; i++) {
           for (int j = 0; j < totalVariables; j++) {
               if (j == totalVariables - 1) {
                   int result = (int) (Math.random() * ((20 - 10) + 1)) + 10; 
                   functionsList[i][j] = result;
               } else {
                   int coefficient = (int) (Math.random() * ((10 + 10) + 1)) - 10; 
                   functionsList[i][j] = coefficient;
               }
           }
       }

       return functionsList;
   }
	
}
