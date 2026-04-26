package LabSheet06.Exercise1;

import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();

        //Create a tree of 10 nodes
        tree.insert(149, "Anusha");
        tree.insert(167, "Kosala");
        tree.insert(047, "Dinusha");
        tree.insert(066, "Mihiri");
        tree.insert(159, "Jayani");
        tree.insert(118, "Nimal");
        tree.insert(195, "Nishantha");
        tree.insert(034, "Avodya");
        tree.insert(105, "Bimali");
        tree.insert(133, "Sampath");

        //Display using all three traversals
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();

        //Allow user to search by employee number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee number to search: ");
        int searchEmp = scanner.nextInt();

        Node result = tree.findRecursive(searchEmp);
        if (result != null) {
            System.out.println("Employee found:");
            result.displayNode();
        } else {
            System.out.println("Employee number " + searchEmp + " not found in the tree.");
        }

        //Delete all nodes
        tree.deleteAll();

        //Display the tree after deletion
        System.out.println("LabSheet06.Exercise1.Tree after deleting all nodes:");
        if (tree.isEmpty()) {
            System.out.println("LabSheet06.Exercise1.Tree is empty.");
        } else {
            tree.inOrder();
        }

        scanner.close();
    }
}