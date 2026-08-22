public class CountNodes{
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
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        int ndoes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT t = new BT();
        Node root = t.buildTree(ndoes);
        System.out.println(countNodes(root));
    }
}
// 6