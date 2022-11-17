package ru.itis.lab10;
public class Node{
    int a;
    Node left;
    Node right;

    Node(int a){
        this.a = a;
    }
    public Node addNode(Node current, int a){
        if (current == null){
            return new Node(a);
        }
        if (a < current.a){
            current.left = addNode(current.left,a);
        }else if (a > current.a){
            current.right = addNode(current.right,a);
        }else{
            return current;
        }
        return current;
    }
    public Node root;
}
