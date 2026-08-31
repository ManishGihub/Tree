import java.util.*;

public class SumOfLevel{

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

    public static void LOSum(Node root,int k){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int level = 1;
        int sum = 0;

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                if(k == level){ 
                    System.out.println("SUm of level "+k+" = "+sum);
                    return;
                }
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                    level++;
                    sum = 0;
                }
            }else{
                sum += currNode.data;
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT t = new BT();
        Node root = t.buildTree(nodes);

        LOSum(root,3);
    }
}
// SUm of level 1 = 1
// SUm of level 2 = 5
// SUm of level 3 = 15