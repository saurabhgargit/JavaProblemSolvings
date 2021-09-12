package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.right=new Node(70);
        root.right.right.right=new Node(80);

      //  printLevelOrderTraverSal(root);
        printLevelUsingQueue(root);

    }

    private static void printLevelOrderTraverSal(Node root) {
        int height = maxDepth(root);
        for(int i=1; i<=height;i++) {
            printCurrentLevel(root,i);
        }

    }


    public static int maxDepth(Node root) {
        if(root==null) {
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    /* Print nodes at the current level */
    static void printCurrentLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }

    public static void printLevelUsingQueue(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }


}
