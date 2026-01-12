

public class SecondMaxElement {
  public static void main (String[] args){
    int arr[] = {10,200,300,30000,40,50,500};
    
    int max =0;
    int secondMax =0;

    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        secondMax =max;
        //System.out.println("SecondMAx "+ secondMax);
        max = arr[i];
       // System.out.println("maximum element "+ max);
      }
      else if(arr[i]>secondMax){
        secondMax = arr[i];
        //System.out.println("SecondMAx "+ secondMax);
      }
    }
    System.out.println("maximum element "+ max);
    System.out.println("Second Maximum element " + secondMax);
    


  }
  
}
