package LabSheet06.Exercise1;

public class Node {
    public int empNumber;
    public String empName;
    public Node leftChild;
    public Node rightChild;

    public Node(int empNumber, String empName) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void displayNode() {
        System.out.println("Employee Number: " + empNumber + ", Name: " + empName);
    }
}