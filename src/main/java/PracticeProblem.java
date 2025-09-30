public class PracticeProblem {

	//Question 1
    public static int sum2D(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        return sum;
    }

	//Question 2 
	public static int sumRow(int[][] numbers, int row) {
    int sum = 0;
        for (int j = 0; j < numbers[row].length; j++) {
            sum += numbers[row][j];
        }
        return sum;
    }

	//Question 3
 public static int sumColumn(int[][] numbers, int col) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (col < numbers[i].length) {
                sum += numbers[i][col];
            }
        }
        return sum;
    }

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
