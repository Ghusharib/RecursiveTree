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
    // TODO: implement
    return new Tree();
  }

  public static Tree buildExampleTreeFive() {
    // TODO: implement
    return new Tree();
  }
}
