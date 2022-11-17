package ru.itis.lab10;
public class Tree {
    public Node root;
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
    public void add(int a){
        root = addNode(root,a);
    }
    public Tree createTree(){
        Tree tree = new Tree();

        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(4);

        return tree;
    }
    public void printTree(){
        printNode(root);
    }
    public void printNode(Node node){
        if (node != null){
            System.out.print(node.a);
            printNode(node.left);
            printNode(node.right);
        }
    }
}
