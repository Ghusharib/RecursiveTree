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
    String answer;
    answer = "(" + Integer.toString(getValue());
    if(left != null || right != null){
      if(left == null){
        answer += "()";
      } else {
        answer += left.toString();
      }
      if(right == null){
        answer += "()";
      } else {
        answer += right.toString();
      }
    }
    answer += ")";
    return answer;
  }

  public void addOne() {
    value++;
    if (left != null){
      left.addOne();
    }
    if(right != null){
      right.addOne();
    }
  }

  public void mirror() {
    Tree temp;
    temp = right;
    right = left;
    left = temp;
    if (right != null)
      right.mirror();
    if (left != null)
      left.mirror();
  }

  public boolean find(int n) {
    boolean state = false;
    if (value == n)
      return true;
    if (left != null && state != true)
      state = left.find(n);
    if (right != null && state != true)
      state = right.find(n);

    return state;
  }

  public boolean isBST() {
    if(left != null){
      if(left.getValue() > value){
        return false;
      } else {
        left.isBST();
      }
    }
    if(right != null){
      if(right.getValue() < value){
        return false;
      } else {
        right.isBST();
      }
    }
    return true;
  }

  public boolean isMirrorBST() {
    mirror();
    return isBST();
  }

  public boolean binarySearch(int n) {
    if (value == n)
      return true;
    else if(left != null && n < value)
      return left.binarySearch(n);
    else if(right != null && n > value)
      return right.binarySearch(n);
    return false;
  }

  public Tree clone() {
    Tree clone = new Tree(value, left, right);
    return clone;
  }

  public String display() {
    String answer = "digraph G {\n";
    answer += representation();
    answer += "}";
    return answer;
  }

  private String representation(){
    String answer = "";
    if (left == null)
    {
      answer += (value + " -> \"L" + value + "\" [label=l]; \"L" + value + "\" [shape=point];\n");
    } else {
      answer += (value + " -> " + left.getValue() + " [label=l];\n");
      answer += left.representation();
    }
    if (right == null)
    {
      answer += (value + " -> \"R" + value + "\" [label=r]; \"R" + value + "\" [shape=point];\n");
    } else {
      answer += (value + " -> " + right.getValue() + " [label=r];\n");
      answer += right.representation();
    }

    return answer;
  }

  public boolean insert(int n) {
    if (value == n){
      return false;
    } else {
      if(n < value){
        if (left == null){
          left = new Tree (n, null, null);
        } else {
          return left.insert(n);
        }
      }
      if(n > value){
        if (right == null){
          right = new Tree(n, null, null);
        } else {
          return right.insert(n);
        }
      }
    }
    return true;
  }

  public boolean delete(int n) {
    if (n == value && (hasLeftRight() || hasOnlyLeft())) {
      value = left.getValue();
      right = left.right;
      left = left.left;
      return true;
    } else if (n == value && hasOnlyRight()) {
      value = right.getValue();
      left = right.left;
      right = right.right;
      return true;
    }
    if (n < value){
      if (left != null){
        return left.delete(n);
      } else {
        return false;
      }
    }
    if (n > value){
      if (right != null){
        return right.delete(n);
      } else {
        return false;
      }
    }
    return false;
  }

  private boolean isLeaf() {
    if (left == null && right == null)
      return true;
    else
      return false;
  }

  private boolean hasOnlyLeft() {
    if (left != null && right == null)
      return true;
    else
      return false;
  }

  private boolean hasOnlyRight() {
    if (left == null && right != null)
      return true;
    else
      return false;
  }

  private boolean hasLeftRight() {
    if (left != null && right != null)
      return true;
    else
      return false;
  }

  private int getMax() {
    if(hasLeftRight()){
      return right.getMax();
    }
    return value;
  }

  private int getMin() {
    if(hasLeftRight()){
      return left.getMax();
    }
    return value;
  }
}
