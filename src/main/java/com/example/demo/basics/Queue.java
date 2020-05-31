package com.example.demo.basics;

public interface Queue<E> {
     int getSize();
     boolean isEmpty();
     void enqueue();
     E dequeue();
     E getFront();
}
