import java.util.*;
import java.util.Random;

class MyLongArray 
{

  // Private member variables to store the long array and current index.
  public long[] a;
  public int currentIndex;

  // Constructor  
  public void arrayyyy(int size) 
  {
    a = new long[size];
    currentIndex = 0;
  }
  
  // Initializing elements in the arra
  
  // Display the elements of the array
  public void display() 
  {
    for (int i = 0; i < currentIndex; i++)
    {
      System.out.print(a[i] + " ");
    }
    System.out.println("\n");
  }

  // Find the index of a given value in the array.
  public int find(long searchKey) 
  {
    for (int i = 0; i < currentIndex; i++) 
    {
      if (a[i] == searchKey) 
      {
        return i;
      }
    }
    return -1;
  }
  
  // Get the element at a specific index in the array.
  public long getElem(int index) 
  {
    if (index >= 0 && index < currentIndex) 
    {
      return a[index];
    } 
    else 
    {
      return -1; 
    }
  }

  // Insert a new value into the array.
  public void insert(long value) 
  {
    if (currentIndex < a.length) 
    {
      a[currentIndex] = value;
      currentIndex++;
    } 
    else 
    {
      System.out.println("Array is full, cannot insert."); 
    }
  }
  
   // Insert a value at a specific index in the Array
  public void insert(int index, long value) 
  {
    if (currentIndex < a.length && index >= 0 && index <= currentIndex) 
    {
      for (int i = currentIndex; i > index; i--) 
      {
        a[i] = a[i - 1];
      }
      a[index] = value;
      currentIndex++;
    } 
    else 
    {
      System.out.println("Invalid index or array is full, cannot insert.");
    }
  }

  // Delete a value from the array.
  public boolean delete(long value) 
  {
    int index = find(value);
    if (index != -1) 
    {
      for (int i = index; i < currentIndex - 1; i++)
      {
        a[i] = a[i + 1];
      }
      currentIndex--;
      return true; // Value deleted successfully.
    }
    return false; // Value not found, cannot delete.
  }
  
  // Deleting all duplicate values   
  public int dupDelete(long value) 
  {
    int count = 0;
    for (int i = 0; i < currentIndex; i++) 
    {
        if (a[i] == value) 
        {
            count++;
            if (count > 1) 
            {
                deleteAt(i);
                i--;
            }
        }
    }
    return count - 1;
  }
  
  // Delete an element at a specific index in the array.
  public long deleteAt(int index) 
  {
    if (index >= 0 && index < currentIndex) 
    {
      long temp = a[index];
      for (int i = index; i < currentIndex - 1; i++) 
      {
        a[i] = a[i + 1];
      }
      currentIndex--;
      return temp;
    } 
    else 
    {
      System.out.println("Invalid index.");// Invalid index.
      return -1;
    }
    
 }
  
 
  
}
