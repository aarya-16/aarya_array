import java.util.*;
import java.util.Random;

class Sort extends MyLongArray
{
  private long[] originalArray;	// Add a new array to store the original elements

  public Sort (int size)
  {
    a = new long[size];
      originalArray = new long[size];	// Initialize the originalArray
    MyLongArray arr = new MyLongArray ();
      arr.arrayyyy (size);
  }

  public void initArray (Scanner scanner)
  {
    System.out.println ("Enter the elements of the array:");
    for (int i = currentIndex; i < a.length; i++)
      {
	System.out.print ("Enter element at index " + i + ": ");
	a[i] = scanner.nextLong ();
	originalArray[i] = a[i];	// Copy the elements to the originalArray
	currentIndex++;
      }
  }
  public void displayOriginalArray ()
  {
    System.out.println ("Original Array:");
    for (int i = 0; i < originalArray.length; i++)
      {
	System.out.print (originalArray[i] + " ");
      }
    System.out.println ();
    System.out.println ("Modified Array:");
    
  }
  public void bubbleSort ()
  {
    int out, in;
    for (out = 0; out < a.length - 1; out++)
      {
	for (in = 0; in < a.length - out - 1; in++)
	  {
	    if (a[in] > a[in + 1])
	      {
		long temp = a[in];
		a[in] = a[in + 1];
		a[in + 1] = temp;
	      }
	  }
      }
  }

  // Sorting of array using selection sort algorithm  
  public void selectionSort ()
  {
    int out, min, in;
    for (out = 0; out < a.length - 1; out++)
      {
	min = out;
	for (in = out + 1; in < a.length; in++)
	  {
	    if (a[in] < a[min])
	      {
		min = in;
	      }
	  }
	long temp = a[out];
	a[out] = a[min];
	a[min] = temp;
      }
  }

  public void insertionSort ()
  {
    int in, out;
    for (out = 1; out < a.length; out++)
      {
	long temp = a[out];
	in = out;
	while (in > 0 && a[in - 1] >= temp)
	  {
	    a[in] = a[in - 1];
	    --in;
	  }
	a[in] = temp;
      }
  }
}


 