
// Create a Go function that inserts an element into a slice (Go's dynamic array equivalent).
// Print all elements of the slice.
func insertAndTraverse(arr []int, pos int, value int) {
    // Insert and Traverse logic 
  // Extend the slice by one element
  arr = append(arr, 0)
  // Shift elements to the right to make space for the new element
  for i := len(arr) - 1; i > pos; i-- {
    arr[i] = arr[i-1]
  }
  // Insert the new element
  arr[pos] = value
  // Print the elements of the slice
  for _, v := range arr {
    fmt.Printf("%d ", v)
  }
  fmt.Println()
}


// Write a function to remove an element from a slice in Go.
// Handle cases where the slice is empty or index is out of bounds.

func deleteElement(arr []int, index int) []int {
    // Deletion logic
  // Check if the slice is empty 
  if len(arr) == 0 {
    return arr
  }
  
  // Check if the index is out of bounds
  if index < 0 || index >= len(arr) {
    return arr
  }
  // Create a new slice without the element at the given index
  return append(arr[:index], arr[index+1:]...)
}
}
