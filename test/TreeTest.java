import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

  @Test
  public void exampleTreeOne() {
    Tree t1 = ExampleTrees.buildExampleTreeOne();
    assertEquals("(4(2)(5))", t1.toString());
  }

  @Test
  public void exampleTreeTwo() {
    Tree t2 = ExampleTrees.buildExampleTreeTwo();
    assertEquals("(4(5)(2))", t2.toString());
  }

  @Test
  public void exampleTreeThree() {
    Tree t3 = ExampleTrees.buildExampleTreeThree();
    assertEquals("(200(50(20)())(400(300)(800)))", t3.toString());
  }

  @Test
  public void exampleTreeFour() {
    Tree t4 = ExampleTrees.buildExampleTreeFour();
    assertEquals("(99(101(102(103(104(105(106)())())())())())())", t4.toString());
  }

  @Test
  public void exampleTreeFive() {
    Tree t5 = ExampleTrees.buildExampleTreeFive();
    assertEquals(
        "(0(-1(-10(-1000(-1024)(-128(-256(-512)())()))())())(1()(1024(1000)(5000(2000)(9999)))))",
        t5.toString());
  }

  @Test
  public void addOne() {
    Tree t5 = ExampleTrees.buildExampleTreeFive();
    t5.addOne();
    assertEquals(
        "(1(0(-9(-999(-1023)(-127(-255(-511)())()))())())(2()(1025(1001)(5001(2001)(10000)))))",
        t5.toString());
    t5.addOne();
    t5.addOne();
    assertEquals(
        "(3(2(-7(-997(-1021)(-125(-253(-509)())()))())())(4()(1027(1003)(5003(2003)(10002)))))",
        t5.toString());
  }

  @Test
  public void mirrorTree1() {
    Tree t1 = ExampleTrees.buildExampleTreeOne();
    t1.mirror();
    assertEquals("(4(5)(2))", t1.toString());
    t1.mirror();
    assertEquals("(4(2)(5))", t1.toString());
  }

  @Test
  public void mirrorTree2() {
    Tree t2 = ExampleTrees.buildExampleTreeTwo();
    t2.mirror();
    assertEquals("(4(2)(5))", t2.toString());
    t2.mirror();
    assertEquals("(4(5)(2))", t2.toString());
  }

  @Test
  public void mirrorTree3() {
    Tree t3 = ExampleTrees.buildExampleTreeThree();
    t3.mirror();
    assertEquals("(200(400(800)(300))(50()(20)))", t3.toString());
    t3.mirror();
    assertEquals("(200(50(20)())(400(300)(800)))", t3.toString());
  }

  @Test
  public void mirrorTree4() {
    Tree t4 = ExampleTrees.buildExampleTreeFour();
    t4.mirror();
    assertEquals("(99()(101()(102()(103()(104()(105()(106)))))))", t4.toString());
    t4.mirror();
    assertEquals("(99(101(102(103(104(105(106)())())())())())())", t4.toString());
  }

  @Test
  public void mirrorTree5() {
    Tree t5 = ExampleTrees.buildExampleTreeFive();
    t5.mirror();
    assertEquals(
        "(0(1(1024(5000(9999)(2000))(1000))())(-1()(-10()(-1000(-128()(-256()(-512)))(-1024)))))",
        t5.toString());
    t5.mirror();
    assertEquals(
        "(0(-1(-10(-1000(-1024)(-128(-256(-512)())()))())())(1()(1024(1000)(5000(2000)(9999)))))",
        t5.toString());
  }

  @Test
  public void find() {
    Tree t5 = ExampleTrees.buildExampleTreeFive();
    t5.mirror(); // make it non-bst

    assertFalse(t5.find(93));
    assertTrue(t5.find(2000));
    assertTrue(t5.find(-512));
    assertTrue(t5.find(1024));
    assertTrue(t5.find(0));
  }

  @Test
  public void isBSTTree1() {
    assertTrue(ExampleTrees.buildExampleTreeOne().isBST());
  }

  @Test
  public void isBSTTree1Mirror() {
    Tree t = ExampleTrees.buildExampleTreeOne();
    t.mirror();
    assertFalse(t.isBST());
  }

  @Test
  public void isBSTTree2() {
    assertFalse(ExampleTrees.buildExampleTreeTwo().isBST());
  }

  @Test
  public void isBSTTree2Mirror() {
    Tree t = ExampleTrees.buildExampleTreeTwo();
    t.mirror();
    assertTrue(t.isBST());
  }

  @Test
  public void isBSTTree3() {
    assertTrue(ExampleTrees.buildExampleTreeThree().isBST());
  }

  @Test
  public void isBSTTree3Mirror() {
    Tree t = ExampleTrees.buildExampleTreeThree();
    t.mirror();
    assertFalse(t.isBST());
  }

  @Test
  public void isBSTTree4() {
    assertFalse(ExampleTrees.buildExampleTreeFour().isBST());
  }

  @Test
  public void isBSTTree4Mirror() {
    Tree t = ExampleTrees.buildExampleTreeFour();
    t.mirror();
    assertTrue(t.isBST());
  }

  @Test
  public void isBSTTree5() {
    assertTrue(ExampleTrees.buildExampleTreeFive().isBST());
  }

  @Test
  public void isBSTTree5Mirror() {
    Tree t = ExampleTrees.buildExampleTreeFive();
    t.mirror();
    assertFalse(t.isBST());
  }

  @Test
  public void isMirrorBSTTree1() {
    assertFalse(ExampleTrees.buildExampleTreeOne().isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree1Mirror() {
    Tree t = ExampleTrees.buildExampleTreeOne();
    t.mirror();
    assertTrue(t.isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree2() {
    assertTrue(ExampleTrees.buildExampleTreeTwo().isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree2Mirror() {
    Tree t = ExampleTrees.buildExampleTreeTwo();
    t.mirror();
    assertFalse(t.isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree3() {
    assertFalse(ExampleTrees.buildExampleTreeThree().isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree3Mirror() {
    Tree t = ExampleTrees.buildExampleTreeThree();
    t.mirror();
    assertTrue(t.isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree4() {
    assertTrue(ExampleTrees.buildExampleTreeFour().isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree4Mirror() {
    Tree t = ExampleTrees.buildExampleTreeFour();
    t.mirror();
    assertFalse(t.isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree5() {
    assertFalse(ExampleTrees.buildExampleTreeFive().isMirrorBST());
  }

  @Test
  public void isMirrorBSTTree5Mirror() {
    Tree t = ExampleTrees.buildExampleTreeFive();
    t.mirror();
    assertTrue(t.isMirrorBST());
  }

  @Test
  public void binarySearch() {
    Tree t5 = ExampleTrees.buildExampleTreeFive();
    assertFalse(t5.binarySearch(93));
    assertTrue(t5.binarySearch(2000));
    assertTrue(t5.binarySearch(-512));
    assertTrue(t5.binarySearch(1024));
    assertTrue(t5.binarySearch(0));
  }

  @Test
  public void binarySearchNoBST() {
    Tree t5 = ExampleTrees.buildExampleTreeFive();
    t5.mirror();
    assertFalse(t5.binarySearch(93));
    assertFalse(t5.binarySearch(2000));
    assertFalse(t5.binarySearch(-512));
    assertFalse(t5.binarySearch(1024));
    assertTrue(t5.binarySearch(0));
  }

  @Test
  public void cloneTree() {
    Tree[] trees = {
      ExampleTrees.buildExampleTreeOne(),
      ExampleTrees.buildExampleTreeTwo(),
      ExampleTrees.buildExampleTreeThree(),
      ExampleTrees.buildExampleTreeFour(),
      ExampleTrees.buildExampleTreeFive()
    };

    for (Tree t : trees) {
      Tree ct = t.clone();

      assertEquals(t.toString(), ct.toString());
      ct.addOne();
      assertNotEquals(t.toString(), ct.toString());
    }
  }

  @Test
  public void displayTree1() {
    Tree t = ExampleTrees.buildExampleTreeOne();
    assertEquals(
        "digraph G {\n"
            + "4 -> 2 [label=l];\n"
            + "2 -> \"L2\" [label=l]; \"L2\" [shape=point];\n"
            + "2 -> \"R2\" [label=r]; \"R2\" [shape=point];\n"
            + "4 -> 5 [label=r];\n"
            + "5 -> \"L5\" [label=l]; \"L5\" [shape=point];\n"
            + "5 -> \"R5\" [label=r]; \"R5\" [shape=point];\n"
            + "}",
        t.display());
  }

  @Test
  public void displayTree2() {
    Tree t = ExampleTrees.buildExampleTreeTwo();
    assertEquals(
        "digraph G {\n"
            + "4 -> 5 [label=l];\n"
            + "5 -> \"L5\" [label=l]; \"L5\" [shape=point];\n"
            + "5 -> \"R5\" [label=r]; \"R5\" [shape=point];\n"
            + "4 -> 2 [label=r];\n"
            + "2 -> \"L2\" [label=l]; \"L2\" [shape=point];\n"
            + "2 -> \"R2\" [label=r]; \"R2\" [shape=point];\n"
            + "}",
        t.display());
  }

  @Test
  public void displayTree3() {
    Tree t = ExampleTrees.buildExampleTreeThree();
    assertEquals(
        "digraph G {\n"
            + "200 -> 50 [label=l];\n"
            + "50 -> 20 [label=l];\n"
            + "20 -> \"L20\" [label=l]; \"L20\" [shape=point];\n"
            + "20 -> \"R20\" [label=r]; \"R20\" [shape=point];\n"
            + "50 -> \"R50\" [label=r]; \"R50\" [shape=point];\n"
            + "200 -> 400 [label=r];\n"
            + "400 -> 300 [label=l];\n"
            + "300 -> \"L300\" [label=l]; \"L300\" [shape=point];\n"
            + "300 -> \"R300\" [label=r]; \"R300\" [shape=point];\n"
            + "400 -> 800 [label=r];\n"
            + "800 -> \"L800\" [label=l]; \"L800\" [shape=point];\n"
            + "800 -> \"R800\" [label=r]; \"R800\" [shape=point];\n"
            + "}",
        t.display());
  }

  @Test
  public void displayTree4() {
    Tree t = ExampleTrees.buildExampleTreeFour();
    assertEquals(
        "digraph G {\n"
            + "99 -> 101 [label=l];\n"
            + "101 -> 102 [label=l];\n"
            + "102 -> 103 [label=l];\n"
            + "103 -> 104 [label=l];\n"
            + "104 -> 105 [label=l];\n"
            + "105 -> 106 [label=l];\n"
            + "106 -> \"L106\" [label=l]; \"L106\" [shape=point];\n"
            + "106 -> \"R106\" [label=r]; \"R106\" [shape=point];\n"
            + "105 -> \"R105\" [label=r]; \"R105\" [shape=point];\n"
            + "104 -> \"R104\" [label=r]; \"R104\" [shape=point];\n"
            + "103 -> \"R103\" [label=r]; \"R103\" [shape=point];\n"
            + "102 -> \"R102\" [label=r]; \"R102\" [shape=point];\n"
            + "101 -> \"R101\" [label=r]; \"R101\" [shape=point];\n"
            + "99 -> \"R99\" [label=r]; \"R99\" [shape=point];\n"
            + "}",
        t.display());
  }

  @Test
  public void displayTree5() {
    Tree t = ExampleTrees.buildExampleTreeFive();
    assertEquals(
        "digraph G {\n"
            + "0 -> -1 [label=l];\n"
            + "-1 -> -10 [label=l];\n"
            + "-10 -> -1000 [label=l];\n"
            + "-1000 -> -1024 [label=l];\n"
            + "-1024 -> \"L-1024\" [label=l]; \"L-1024\" [shape=point];\n"
            + "-1024 -> \"R-1024\" [label=r]; \"R-1024\" [shape=point];\n"
            + "-1000 -> -128 [label=r];\n"
            + "-128 -> -256 [label=l];\n"
            + "-256 -> -512 [label=l];\n"
            + "-512 -> \"L-512\" [label=l]; \"L-512\" [shape=point];\n"
            + "-512 -> \"R-512\" [label=r]; \"R-512\" [shape=point];\n"
            + "-256 -> \"R-256\" [label=r]; \"R-256\" [shape=point];\n"
            + "-128 -> \"R-128\" [label=r]; \"R-128\" [shape=point];\n"
            + "-10 -> \"R-10\" [label=r]; \"R-10\" [shape=point];\n"
            + "-1 -> \"R-1\" [label=r]; \"R-1\" [shape=point];\n"
            + "0 -> 1 [label=r];\n"
            + "1 -> \"L1\" [label=l]; \"L1\" [shape=point];\n"
            + "1 -> 1024 [label=r];\n"
            + "1024 -> 1000 [label=l];\n"
            + "1000 -> \"L1000\" [label=l]; \"L1000\" [shape=point];\n"
            + "1000 -> \"R1000\" [label=r]; \"R1000\" [shape=point];\n"
            + "1024 -> 5000 [label=r];\n"
            + "5000 -> 2000 [label=l];\n"
            + "2000 -> \"L2000\" [label=l]; \"L2000\" [shape=point];\n"
            + "2000 -> \"R2000\" [label=r]; \"R2000\" [shape=point];\n"
            + "5000 -> 9999 [label=r];\n"
            + "9999 -> \"L9999\" [label=l]; \"L9999\" [shape=point];\n"
            + "9999 -> \"R9999\" [label=r]; \"R9999\" [shape=point];\n"
            + "}",
        t.display());
  }

  @Test
  public void insert() {
    Tree t = ExampleTrees.buildExampleTreeThree();

    assertTrue(t.insert(60));
    assertTrue(t.insert(199));
    assertTrue(t.insert(19));
    assertTrue(t.insert(850));
    assertTrue(t.insert(401));
    assertTrue(t.insert(299));
    assertTrue(t.insert(301));
    assertFalse(t.insert(301));
    assertFalse(t.insert(200));

    assertEquals("(200(50(20(19)())(60()(199)))(400(300(299)(301))(800(401)(850))))", t.toString());
  }

  @Test
  public void deleteRoot() {
    Tree t = new Tree(1928);
    assertFalse(t.delete(1928));
    assertEquals("(1928)", t.toString());
  }

  @Test
  public void deleteOnlyLeft() {
    Tree t = ExampleTrees.buildExampleTreeThree();
    assertTrue(t.delete(50));
    assertEquals("(200(20)(400(300)(800)))", t.toString());
  }

  @Test
  public void deleteRootOnlyLeft() {
    Tree t = new Tree(1, new Tree(2), null);
    assertTrue(t.delete(1));
    assertEquals("(2)", t.toString());
  }

  @Test
  public void deleteOnlyRight() {
    Tree t = ExampleTrees.buildExampleTreeFive();
    assertTrue(t.delete(1));
    assertEquals(
        "(0(-1(-10(-1000(-1024)(-128(-256(-512)())()))())())(1024(1000)(5000(2000)(9999))))",
        t.toString());
  }

  @Test
  public void deleteRootOnlyRight() {
    Tree t = new Tree(1, null, new Tree(2));
    assertTrue(t.delete(1));
    assertEquals("(2)", t.toString());
  }

  @Test
  public void deleteSequence() {
    // IMPORTANT: Note that the resulting trees after deleting *depend on your implementation*.
    // Therefore, you might not pass these tests: design your own tests to make sure your
    // algorithm follows your desired behaviour and covers all possible cases

    Tree t = ExampleTrees.buildExampleTreeThree();

    assertFalse(t.delete(500));
    assertEquals("(200(50(20)())(400(300)(800)))", t.toString());

    assertTrue(t.delete(200));
    assertEquals("(50(20)(400(300)(800)))", t.toString());
    //assertEquals("(300(50(20)())(400()(800)))", t.toString());

    assertTrue(t.delete(400));
    assertEquals("(50(20)(300()(800)))", t.toString());
    //assertEquals("(300(50(20)())(800))", t.toString());

    assertTrue(t.delete(50));
    assertEquals("(20()(300()(800)))", t.toString());
    //assertEquals("(300(20)(800))", t.toString());

    assertTrue(t.delete(300));
    assertEquals("(20()(800))", t.toString());
    //assertEquals("(800(20)())", t.toString());

    assertTrue(t.delete(800));
    assertEquals("(20)", t.toString());
  }
}
