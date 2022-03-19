import java.util.LinkedList;
import java.util.Queue;

class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value) {
        this.value = value;
    }
}

//root, trunk, branch, leaf

public class BinaryTreeDemo {


    private static Tree formTree() {

        /*
                  1
                /   \
               2     3
              / \   / \
             4  5  6   7

        */

        Tree root = new Tree(1);
        Tree rootLeft = new Tree(2);
        Tree rootRight = new Tree(3);
        Tree rootLeftLeft = new Tree(4);
        Tree rootLeftRight = new Tree(5);
        Tree rootRightLeft = new Tree(6);
        Tree rootRightRight = new Tree(7);


        root.left = rootLeft;
        root.right = rootRight;

        rootLeft.left = rootLeftLeft;
        rootLeft.right = rootLeftRight;

        rootRight.left = rootRightLeft;
        rootRight.right = rootRightRight;

        return root;
    }

    /*
                  1
                /   \
               2     3
              / \   / \
             4  5  6   7

        */


    //breadth first search -> 1,2,3,4,5,6,7
    public static void breathFirstSearch(Tree t) {
        System.out.println("breadthFirstSearch");
        if(t == null)
            return;

        Queue<Tree> queue = new LinkedList<>();
        queue.add(t);

        while(!queue.isEmpty()) {
           Tree dequeuedElement = queue.poll();
            System.out.print(dequeuedElement.value + "-->");

           if(dequeuedElement.left != null) {
               queue.offer(dequeuedElement.left);
           }

            if(dequeuedElement.right != null) {
                queue.offer(dequeuedElement.right);
            }
        }
    }



    //depth first search
    // in order -> left, root, right => 4,2,5,1,6,3,7
    // pre order -> root, left, right => 1,2,4,5,3,6,7
    // post order -> left, right, root => 4,5,2,6,7,3,1

    public static void inOrder(Tree t) {
        if(t != null) {
            inOrder(t.left);
            System.out.print(t.value + ",");
            inOrder(t.right);
        }
    }

    public static void preOrder(Tree t) {
        if(t != null) {
            System.out.print(t.value + ",");
            preOrder(t.left);
            preOrder(t.right);
        }
    }

    public static void postOrder(Tree t) {
        if(t != null) {
            postOrder(t.left);
            postOrder(t.right);
            System.out.print(t.value + ",");
        }
    }


    public static void depthFirstSearch(Tree t) {
        System.out.println("depthFirstSearch");
        System.out.print("inOrder ===> ");
        inOrder(t);
        System.out.println();

        System.out.print("preOrder ===> ");
        preOrder(t);
        System.out.println();

        System.out.print("postOrder ===> ");
        postOrder(t);
        System.out.println();
    }

    public static void main(String[] args) {
        Tree root = formTree();
        depthFirstSearch(root);
        breathFirstSearch(root);
    }
}
