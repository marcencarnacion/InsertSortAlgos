class Main 
{
  public static void main(String[] args) 
  {
    int[] arrInt = {3,5,2,1};
    //sorted 1,2,3,5
    //sort(arrInt);
    sortRecursive(arrInt, arrInt.length-1);
    for(int e : arrInt)
    {
      System.out.println(e);
    }
  }//end main method

  public static void sort (int arr[])//pass by reference
  {
    for (int i = 1; i < arr.length; i++)
    {
      int key = arr[i];
      int j = i-1;  //this is why i starts at 1
      //now compare with all previous elements until it finds one less than key
      while (j >= 0 && arr[j] > key)
      {
        arr[j+1] = arr[j];
        j = j-1;
      }
      arr[j+1] = key;
    }
  }//end sorting method

  public static void sortRecursive(int arr[], int n)
  {
    //base case = easiest sort 
    if (n <= 1)
    {
      return;
    }
    sortRecursive(arr, n-1);
    int key = arr[n-1];
    int j = n-2;
    while(j >= 0 && arr[j] > key)
    {
      arr[j+1] = arr[j];
      j = j-1;
    }
    arr[j+1] = key;

  }//end method sortRecursive
}//end class Main