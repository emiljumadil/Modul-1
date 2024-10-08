//package Day11;
//
//public class BinarySearchTree {
//    public static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        private Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    private Node root;
//
//    private BinarySearchTree() {
//        root = null;
//    }
//
//    private void insert(int data) {
//        Node newNode = new Node(data);
//        if (root == null) {
//            root = newNode;
//            return;
//        } else {
//            Node current = root, parent = null;
//
//            while (true) {
//                parent = current;
//
//                if (data < current.data) {
//                    current = current.left;
//                    if (current == null) {
//                        parent.left = newNode;
//                        return;
//                    }
//                } else {
//                    current = current.right;
//                    if (current == null) {
//                        parent.right = newNode;
//                        return;
//                    }
//                }
//            }
//        }
//    }
//
//    public Node minNode(Node root) {
//        if (root.left != null)
//            return minNode(root.left);
//        else
//            return root;
//    }
//
//    public Node deleteNode(Node node, int value) {
//        if (node == null) {
//            return null;
//        } else {
//            if (value < node.data) {
//                node.left = deleteNode(node.left, value);
//                if(value > node.data) node.right = deleteNode(node.right, value);
//
//                else {
//                    if (node.left == null && node.right == null) node = null;
//                    else if (node.left == null) {
//                        node = node.right;
//                    }
//                    else if (node.right == null) {
//                        node = node.left;
//
//                } else {
//                        Node temp = minNode(node.right);
//                        node.data = temp.data;
//                        node.right = deleteNode(node.right, temp.data);
//                    }
//                return node;
//        }
//    }
//
//        private void inorderTraversal(Node node) {
//            if (root == null) {
//                System.out.println("The tree is empty");
//                return;
//
//            } else {
//                if(node.left!= null) inorderTraversal(node.left);
//                System.out.print(node.data + " ");
//                if(node.right!= null)
//                    inorderTraversal(node.right);
//            }
//        }
//
//        public static void main(String[] args) {
//
//            BinarySearchTree bt = new BinarySearchTree();
//
//            bt.insert(40);
//            bt.insert(60);
//            bt.insert(30);
//            bt.insert(50);
//            bt.insert(20);
//            bt.insert(80);
//
//            System.out.println("Binary search tree after insertion:");
//            bt.inorderTraversal(bt.root);
//            Node deletedNode = null;
//            deletedNode = bt.minNode(bt.root, 30);
//            System.out.println("Binary search tree after deleting node 30:");
//            bt.inorderTraversal(bt.root);
//
//            deletedNode = bt.deleteNode(bt.root, 20);
//            System.out.println("Binary search tree after deleting node 20:");
//            bt.inorderTraversal(bt.root);
//
//            deletedNode = bt.deleteNode(bt.root, 80);
//            System.out.println("Binary search tree after deleting node 80:");
//            bt.inorderTraversal(bt.root);
//        }
//    }
//}
//
//    private void inorderTraversal(Node left) {
//        if (left != null) {
//            inorderTraversal(left.left);
//            System.out.print(left.data + " ");
//            inorderTraversal(left.right);
//        }
//    }
//    }
