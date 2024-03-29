package tree;

public class SizeOfBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);

        System.out.println(printSizeOfBT(root));

    }

    static int printSizeOfBT(Node root){
        if(root == null) return 0;
        return 1+printSizeOfBT(root.left) + printSizeOfBT(root.right);
    }
}
