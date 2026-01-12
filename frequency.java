
public class frequency {

  public static void main(String[] args) {

    int a[] = { 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 80, 90 };

    int frequency[] = new int[a.length];
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      int first = a[i];
      count = 1;

    //   if (frequency[i] == -1) {
    //     continue;
    // }
      for (int j = i + 1; j < a.length; j++) {
        if (first == a[j]) {
          count++;
          frequency[j] = -1;
        }
      }
      // System.out.println("frequency is"+ frequency[i]);
      // if (count > 0)
        System.out.println("before frequency is " +a[i] + " "+ frequency[i]);
      if (frequency[i] != -1)
      frequency[i]=count;
      
    }
   // System.out.println(" after frequency is" + frequency[i]);
    for(int i =0; i<frequency.length ; i++)
    {
      if(frequency[i] != -1)
     System.out.println("a of count is ,frequency count is " +a[i] + " "+ frequency[i]);
    }

  }

}
