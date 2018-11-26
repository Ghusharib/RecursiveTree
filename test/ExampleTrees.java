public class ExampleTrees {

  public static Tree buildExampleTreeOne() {
    return new Tree(4, new Tree (2), new Tree (5));
  }

  public static Tree buildExampleTreeTwo() {
    return new Tree(4, new Tree (5), new Tree (2));
  }

  public static Tree buildExampleTreeThree() {
    return new Tree(200,
                new Tree (50, new Tree (20), null),
                new Tree (400, new Tree (300), new Tree (800)));
    //return new Tree();
  }

  public static Tree buildExampleTreeFour() {
    return new Tree (99, new Tree(101, new Tree(102, new Tree(103, new Tree(104, new Tree(105, new Tree(106), null), null), null), null), null), null);
  }

  public static Tree buildExampleTreeFive() {
    return new Tree (0, new Tree (-1, new Tree(-10, new Tree(-1000, new Tree(-1024), new Tree(-128, new Tree(-256, new Tree(-512), null), null)), null), null),
            new Tree(1, null, new Tree(1024, new Tree(1000), new Tree(5000, new Tree(2000), new Tree(9999)))));
  }
}
