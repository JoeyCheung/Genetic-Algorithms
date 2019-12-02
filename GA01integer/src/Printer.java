
public class Printer {

	public void print(int[][] array) {
    	int number = 0;
        String names = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Parameters are: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
            	if (j == array.length - 2) {
                    System.out.print(array[i][j]);
                    System.out.print(names.charAt(number));
                    number++;
                } else if (j == array.length - 1) {
                    System.out.println(" <= " + array[i][j]);
                    number = 0;
                } else {
                    System.out.print(array[i][j]);
                    System.out.print(names.charAt(number) + " + ");
                    number++;
                }
            }
        }
    }
    
    public void print(int[] data) {
    	int number = 0;
        String names = "abcdefghijklmnopqrstuvwxyz";

        System.out.print("Maximize function: ");

        for (int i = 0; i < data.length; i++) {
        	if (i == data.length - 2) {
                System.out.print(data[i]);
                System.out.print(names.charAt(number));
            } else if (i == data.length - 1) {
                System.out.println(" <= " + data[i]);
            } else {
                System.out.print(data[i]);
                System.out.print(names.charAt(number) + " + ");
                number++;
            }
        }
    }
	
}
