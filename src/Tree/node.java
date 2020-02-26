package Tree;

public class node {
    int data;
    node left;
    node right;
//final

    public int getData() {
        return data;
    }

    public node getLeft() {
        return left;
    }

    public node getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(node left) {
        this.left = left;
    }

    public void setRight(node right) {
        this.right = right;
    }
}
