package com.arrayList;


/*模拟ArrayList的一系列操作,ArrayList内部是用数组实现的*/
/*头插
* 尾插
* 头删
* 尾删
* 在指定位置添加数据
* 在指定位置删除数据*/
public interface IArrayList {

    void PutFront(int item);
    void PutTail(int item);
    void DeleteFront();
    void DeleteTail();

    void DeleteItem(int index);
    void PutItem(int index,int item);
}
