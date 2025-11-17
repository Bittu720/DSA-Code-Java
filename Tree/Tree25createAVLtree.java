public class Tree25createAVLtree {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null)
            return 0;
        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static int getBalance(Node root) {
        if (root == null)
            return 0;
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node node, int key) {
        
        if (node == null)
            return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node; 

        node.height = 1 + max(height(node.left), height(node.right));

    
        int balance = getBalance(node);

        if (balance > 1 && key < node.left.data)
            return rightRotate(node);

        if (balance < -1 && key > node.right.data)
            return leftRotate(node);

        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; 
    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String args[]) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        System.out.println("Preorder traversal of constructed AVL tree:");
        preorder(root);
    }
}
