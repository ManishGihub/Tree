import java.util.*;

//Time Complexity O(n^2)

public class DiameterOfTreeOn2{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;

        return myHeight;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int dim1 = diameter(root.left); 
        int dim2 = diameter(root.right); 
        int dim3 = height(root.left) + height(root.right) + 1;

        return Math.max(dim3, Math.max(dim1, dim2));
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT t = new BT();
        Node root = t.buildTree(nodes);

        System.out.println(diameter(root));
    }
}

// 5
