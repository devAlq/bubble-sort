public class Main {

  public static void main(String[] args){

  int[] array = {
    4,3,78,2,0,2
  };
  print(array);
  bubbleSort(array);
  print(array);
	
  }

  public static int[] bubbleSort(int[] array){
    int n = array.length;
    for(int i = 0; i < n-1; i++){
      for(int j = 0; j < n-i-1; j++){
        if(array[j+1] < array[j]){
          int min = array[j];
          array[j] = array[j+1];
          array[j+1] = min;
        }
      }
    }return array;
  }
  public static void print(int[] array){
    for(int x = 0; x < array.length;x++ ){
      if (x ==array.length - 1){
        System.out.println(array[x]);
      }else{
      System.out.print(array[x]+",");
    }}
  }
}
