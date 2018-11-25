public class Tree {

  private Tree left;
  private Tree right;
  private int value;

  public Tree() {
    value = 0;
  }

  public Tree(int value) {
    this.value = value;
  }

  public Tree(int value, Tree left, Tree right) {
    this.left = left;
    this.right = right;
    this.value = value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public String toString() {
    // TODO: implement
    return "";
  }

  public void addOne() {
    // TODO: implement
  }

  public void mirror() {
    // TODO: implement
  }

  public boolean find(int n) {
    // TODO: implement
    return false;
  }

  public boolean isBST() {
    // TODO: implement
    return false;
  }

  public boolean isMirrorBST() {
    // TODO: implement
    return false;
  }

  public boolean binarySearch(int n) {
    // TODO: implement
    return false;
  }

  public Tree clone() {
    // TODO: implement
    return null;
  }

  public String display() {
    // TODO: implement
    return "";
  }

  public boolean insert(int n) {
    // TODO: implement
    return false;
  }

  public boolean delete(int n) {
    // TODO: implement
    return false;
  }

  private boolean isLeaf() {
    // TODO: implement
    return false;
  }

  private boolean hasOnlyLeft() {
    // TODO: implement
    return false;
  }

  private boolean hasOnlyRight() {
    // TODO: implement
    return false;
  }

  private boolean hasLeftRight() {
    // TODO: implement
    return false;
  }

  private int getMax() {
    // TODO: implement
    return -1;
  }

  private int getMin() {
    // TODO: implement
    return -1;
  }
}
