package tree;

public class PrintNodeAtDistanceK {


    /**
     * https://practice.geeksforgeeks.org/tracks/DSASP-Tree/?batchId=135
     * */
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);
        int k=2;

        printKthNode(root, 2);


    }

    public static void printKthNode(Node root, int k){
        if(root==null) return;
        if(k==0){
            System.out.println(root.data);
        }
        else {
            printKthNode(root.left,k-1);
            printKthNode(root.right,k-1);
        }

    }



}



//class Node {
//    int key;
//    Node left;
//    Node right;
//    Node(int key){
//        this.key = key;
//    }
//}
