
public class TwodimensionArray {

  public static void main(String[] args) {

    int arr[][] = new int[4][3];
    int row = 0;
    int value = 5;
    while (row < 4) {
      int col = 0;

      while (col < 3) {
        arr[row][col] = value;
        value++;
        col++;
      }
      row++;
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}
