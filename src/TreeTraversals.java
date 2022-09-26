
class Node{
  int data;
  Node left , right;
  Node(int data){
    this.data = data;
    left = right = null;
  }
}

class TreeTraversals{
  static Node  root;
  public static void preOrder(Node rootNode){
    if(rootNode != null){
      System.out.print(rootNode.data+" ");
      preOrder(rootNode.left);
      preOrder(rootNode.right);
    }
  }


    
  public static void inOrder(Node rootNode){
    if(rootNode != null){
      preOrder(rootNode.left);
      System.out.print(rootNode.data+" ");
      preOrder(rootNode.right);
    }
  }
  
  public static void postOrder(Node rootNode){
    if(rootNode != null){
      preOrder(rootNode.left);
      preOrder(rootNode.right);
      System.out.print(rootNode.data+" ");
    }
  }

  public static void main(String[] args) {
   
    TreeTraversals tree = new TreeTraversals();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    tree.preOrder(root);
    System.out.println("preorder");
    tree.inOrder(root);
    System.out.println("inOrder");
    tree.postOrder(root);
    System.out.println("postOrder");
  }
}