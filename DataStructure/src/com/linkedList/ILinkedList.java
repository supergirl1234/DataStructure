package com.linkedList;


/*模拟LinkedList的一系列操作 LinkedList内部是用链表实现的*/
/*头插
 * 尾插
 * 头删
 * 尾删*/
public interface ILinkedList {

    void PutFront(int item);
    void PutTail(int item);
    void DeleteFront();
    void DeleteTail();
}
