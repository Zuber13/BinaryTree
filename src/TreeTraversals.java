import java.util.*;

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

  public static void printTree(){
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      Node temp = queue.poll();
      System.out.print(temp.data+" ");
      if(temp.left != null) queue.add(temp.left);
      if(temp.right != null) queue.add(temp.right);
    }
  }


   // inserting node in the tree
  public static void insertNode(int data){
     Node newNode = new Node(data);
     if(root == null){
        root = newNode;
        return;
     }

     Queue<Node> queue = new LinkedList<>();
     queue.add(root);

     Node temp;

     while(!queue.isEmpty()){
        temp = queue.poll();
        if(temp.left == null){
          temp.left = newNode;
          break;
        }else{
          queue.add(temp.left);
        }

        if(temp.right == null){
          temp.right = newNode;
          break;
        }else{
          queue.add(temp.right);
        }
     }

    //  return root;
  }

  public static void main(String[] args) {
   
    TreeTraversals tree = new TreeTraversals();
    for(int  i =0; i<10; i++){
      int random = (int)(Math.random() * 100) + 1;
      System.out.println("Inserting " + random + " in the tree");
      tree.insertNode(random);

    }

    System.out.println();
    // tree.printTree();
    // tree.inOrder(root);
    // System.out.println("inOrder");
    tree.postOrder(root);
    // System.out.println("postOrder");
  }
}