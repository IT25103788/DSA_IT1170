package LabSheet06.Exercise1;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    //Iterative find
    public Node find(int emp) {
        Node current = root;
        while (current != null) {
            if (emp == current.empNumber) {
                return current;
            } else if (emp < current.empNumber) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return null;
    }

    //Recursive find-public wrapper
    public Node findRecursive(int emp) {
        return findRecursive(root, emp);
    }

    //Recursive find-private helper
    private Node findRecursive(Node current, int emp) {
        if (current == null) {
            return null;
        }
        if (emp == current.empNumber) {
            return current;
        } else if (emp < current.empNumber) {
            return findRecursive(current.leftChild, emp);
        } else {
            return findRecursive(current.rightChild, emp);
        }
    }

    //Insert a new node
    public void insert(int emp, String name) {
        Node newNode = new Node(emp, name);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent;
        while (true) {
            parent = current;
            if (emp < current.empNumber) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    //In-order traversal
    public void inOrder() {
        System.out.println("In-Order Traversal:");
        inOrderHelper(root);
        System.out.println();
    }

    private void inOrderHelper(Node localRoot) {
        if (localRoot != null) {
            inOrderHelper(localRoot.leftChild);
            localRoot.displayNode();
            inOrderHelper(localRoot.rightChild);
        }
    }

    //Pre-order traversal
    public void preOrder() {
        System.out.println("Pre-Order Traversal:");
        preOrderHelper(root);
        System.out.println();
    }

    private void preOrderHelper(Node localRoot) {
        if (localRoot != null) {
            localRoot.displayNode();
            preOrderHelper(localRoot.leftChild);
            preOrderHelper(localRoot.rightChild);
        }
    }

    //Post-order traversal
    public void postOrder() {
        System.out.println("Post-Order Traversal:");
        postOrderHelper(root);
        System.out.println();
    }

    private void postOrderHelper(Node localRoot) {
        if (localRoot != null) {
            postOrderHelper(localRoot.leftChild);
            postOrderHelper(localRoot.rightChild);
            localRoot.displayNode();
        }
    }

    //Delete all nodes by setting root to null
    public void deleteAll() {
        root = null;
        System.out.println("All nodes have been deleted.");
    }

    public boolean isEmpty() {
        return root == null;
    }
}
