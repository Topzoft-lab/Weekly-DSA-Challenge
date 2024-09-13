package main

import 'fmt'


type DynamicArray struct {
  data []int
  size int
  capacity int
}

func NewDynamicArray(initialCapacity int) *DynamicArray{

  return &DynamicArray{
    data: make([]int, initialCapacity),
    size: 0,
    capacity: initialCapacity,  
  }
}

