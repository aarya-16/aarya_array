import java.util.Scanner;

public class Main {
    public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    System.out.print ("Please enter the size of the array: ");
    int size = sc.nextInt ();
    Sort arr = new Sort (size);

    System.out.println ("Array has been created");

  outer:
    while (true)
      {
	int button;
	System.out.println ("MENU\n" +
			    "Types of Operation : \n" +
			    "1.Initialize all elements\n" +
			    "2.Display the array\n" +
			    "3.Find an element by value\n" +
			    "4.Get the value of an element by index\n" +
			    "5.Insert an element at the end\n" +
			    "6.Insert an element at a particular index\n"
			    + "7.Delete an element by value\n" +
			    "8.Delete duplicate elements of a certain value\n"
			    +
			    "9.Delete an element at a particular index\n"
			    + "10.Sort the elements using Bubble sort\n" +
			    "11.Sort the elements using Selection sort\n"
			    +
			    "12.Sort the elements using insertion sort\n"
			    + "13.Exit");

	System.out.print("Operation to be performed : ");
	button = sc.nextInt ();

	switch (button)
	  {
	  case 1:
	    // Initialize all elements
	    arr.initArray (sc);
	    arr.display ();
	    break;

	  case 2:
	    // Display the array
	    	    arr.displayOriginalArray ();	// Display the original array
    System.out.println ("Modified Array:");

	    arr.display ();
	    break;

	  case 3:
	    // Find an element by value
	    System.out.print
	      ("Please enter the value of the element to be found: ");
	    long value = sc.nextLong ();
	    int foundIndex = arr.find (value);
	    if (foundIndex != -1)
	      {
		System.out.println ("Element found at index: " + foundIndex);
	      }
	    else
	      {
		System.out.println ("Element not found.");
	      }
	    break;

	  case 4:
	    // Get the value of an element by index
	    System.out.print ("Please input the index: ");
	    int index = sc.nextInt ();
	    long element = arr.getElem (index);
	    if (element != -1)
	      {
		System.out.println ("Value of the element is: " + element);
	      }
	    break;

	  case 5:
	    // Insert one or more elements at the end
	    System.out.println ("How many elements do you want to insert? ");
	    int n = sc.nextInt ();
	    while (n-- > 0)
	      {
		System.out.print ("Please insert an element: ");
		value = sc.nextLong ();
		arr.insert (value);
	      }
	    System.out.println ("Elements inserted");
	    break;

	  case 6:
	    // Insert an element at a particular index
	    System.out.print
	      ("Please input the index and value of the element to be inserted: ");
	    index = sc.nextInt ();
	    value = sc.nextLong ();
	    arr.insert (index, value);
	    System.out.println ("Element inserted");
	    break;

	  case 7:
	    // Delete an element by value
	    System.out.print
	      ("Please input the value of the element to delete:");
	    value = sc.nextLong ();
	    if (arr.delete (value))
	      {
		System.out.println ("Element deleted");
	      }
	    else
	      {
		System.out.println ("Element not found.");
	      }
	    break;

	  case 8:
	    // Delete duplicate elements of a certain value
	    System.out.print
	      ("Please input the value of the element to delete duplicates of: ");
	    value = sc.nextLong ();
	    int deletedCount = arr.dupDelete (value);
	    System.out.println ("Duplicates deleted: " + deletedCount);
	    break;

	  case 9:
	    // Delete an element at a particular index
	    System.out.print
	      ("Please input the index of the element to be deleted: ");
	    index = sc.nextInt ();
	    long deletedElement = arr.deleteAt (index);
	    if (deletedElement != -1)
	      {
		System.out.println ("Element deleted: " + deletedElement);
	      }
	    break;

	  case 10:
	    // Sort the elements using Bubble sort
	    arr.bubbleSort ();
	    arr.displayOriginalArray ();	

	    arr.display ();
	    break;

	  case 11:
	    // Sort the elements using Selection sort
	    arr.selectionSort ();
	    arr.displayOriginalArray ();	

	    arr.display ();
	    break;

	  case 12:
	    // Sort the elements using Insertion Sort
	    arr.insertionSort ();
	    arr.displayOriginalArray ();	
	    arr.display ();
	    break;

	  case 13:
	    System.out.println ("Quitting the program...");
	    break outer;

	  default:
	    System.out.println ("Invalid Input");
	    break;

	  }
      }

  }
}

