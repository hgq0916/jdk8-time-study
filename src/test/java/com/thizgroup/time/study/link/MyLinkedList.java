package com.thizgroup.time.study.link;

import java.util.Objects;

/**
 * @author gangquan.hu
 * @Package: com.thizgroup.time.study.link.MyLinkedList
 * @Description: TODO
 * @date 2020/7/2 9:49
 */
public class MyLinkedList {

  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    //添加元素
    myLinkedList.addData(3);
    myLinkedList.addData(1);
    myLinkedList.addData(4);
    myLinkedList.addData(6);
    myLinkedList.addData(2);
    myLinkedList.addData(8);
    myLinkedList.addData(17);
    myLinkedList.addData(34);
    //遍历
    myLinkedList.traverse();
    System.out.println("容量:"+myLinkedList.size());
    //插入
    myLinkedList.insertData(0,78);
    myLinkedList.insertData(8,28);
    myLinkedList.insertData(5,38);
    //遍历
    myLinkedList.traverse();
    //删除元素
    myLinkedList.delete(1);
    myLinkedList.delete(3);
    //遍历
    myLinkedList.traverse();
    //排序
    myLinkedList.sort();
    //遍历
    myLinkedList.traverse();
    //寻找倒数第k个元素
    System.out.println(myLinkedList.findKNode(3).data);
    //查找中间元素
    System.out.println(myLinkedList.findMNode().data);
    //倒序遍历链表
    myLinkedList.reversePrintNode();
    //反转链表
    myLinkedList.reverse();
    //遍历
    myLinkedList.traverse();
  }

  private Node head;

  /**
   * 添加元素
   */
  public void addData(int data){
    Node node = new Node(data);
    if(head == null){
      head = node;
    }else {
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = node;
    }
  }

  /**
   * 遍历
   */
  public void traverse(){
    Node node = head;
    while(node != null){
      System.out.print(Objects.toString(node.data)+"\t");
      node = node.next;
    }
    System.out.println();
  }

  /**
   * 插入数据
   */
  public void insertData(int index,int data){
    if(!(index>=0 && index < size()+1)){
      throw new ArrayIndexOutOfBoundsException("index:"+index);
    }
    Node newNode = new Node(data);

    if(index == 0){
      if(head == null){
        head = newNode;
      }else {
        newNode.next = head;
        head = newNode;
      }
    }else {
      Node temp = head;
      int pos = 0;
      while (temp != null){
        Node next = temp.next;
        pos++;
        if(pos == index){
          if(next == null){
            temp.next = newNode;
          }else {
            temp.next = newNode;
            newNode.next = next;
          }
          break;
        }
        temp = next;
      }
    }
  }

  /**
   * 求链表容量
   * @return
   */
  public int size() {
    if(head == null) return 0;
    Node node = head;
    int length = 0;
    while (node != null){
      length++;
      node = node.next;
    }
    return length;
  }

  /**
   * 删除元素
   */
  public void delete(int index){
    if(!(index>=0 && index<size())) throw new ArrayIndexOutOfBoundsException("index:"+index);

    if(index == 0){
      if(head != null){
        int data = head.data;
        head = head.next;
      }
    }else {
      int pos = 0;
      Node temp = head;
      while(temp != null){
        Node next = temp.next;
        pos++;
        if(pos == index){
          if(next != null){
            temp.next = next.next;
          }
        }
        temp = next;
      }
    }
  }

  public void sort(){

    if(head == null) return;
    for(Node current=head;current.next != null;current=current.next){
      for(Node node=head;node.next != null;node=node.next){
        if(node.data>node.next.data){
          int temp = node.data;
          node.data = node.next.data;
          node.next.data = temp;
        }
      }
    }
  }

  /**
   * 查找倒数第k个节点
   * @return
   */
  public Node findKNode(int k){
    if(!(k>=0 && k<size())) return null;
    Node p1 = head;
    Node p2 = head;
    for(int i=0;i<k-1;i++){
      p1 = p1.next;
    }
    while(p1.next != null){
      p1 = p1.next;
      p2 = p2.next;
    }
    return p2;
  }

  /**
   * 查找中间节点
   * @return
   */
  public Node findMNode(){
    if(head == null) return null;
    Node p1 = head;
    Node p2 = head;
    while(p1.next != null && p2.next !=null && p2.next.next != null){
      p1 = p1.next;
      p2 = p2.next.next;
    }
    return p1;
  }

  /**
   * 倒序输出链表
   */
  public void reversePrintNode(){
    printNode(head);
    System.out.println();
  }

  private void printNode(Node node) {
    if(node == null) return;
    printNode(node.next);
    System.out.print(node.data+"\t");
  }

  /**
   * 反转数组
   */
  public void reverse(){
    if(head == null) return;
    Node pre = null;
    Node node = head;
    while(node != null){
      Node next = node.next;
      node.next = pre;
      pre = node;
      node = next;
    }
    head = pre;
  }


  private class Node {

    private int data;

    private Node next;

    public Node(int data){
      this.data = data;
    }

    public Node(int data,Node next){
      this.data = data;
      this.next = next;
    }
  }

}
