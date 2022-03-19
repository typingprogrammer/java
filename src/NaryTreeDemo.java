import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class NaryTree {
    int value;
    List<NaryTree> children;

    public NaryTree(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}

public class NaryTreeDemo {

    public static NaryTree formTree() {

        /*
                     1
                   / | \
                  2  3  4
                / | \
               5  6  7

         */

        NaryTree root = new NaryTree(1);
        NaryTree rootChild1 = new NaryTree(2);
        NaryTree rootChild2 = new NaryTree(3);
        NaryTree rootChild3 = new NaryTree(4);
        NaryTree rootChild1Child1 = new NaryTree(5);
        NaryTree rootChild1Child2 = new NaryTree(6);
        NaryTree rootChild1Child3 = new NaryTree(7);

        rootChild1.children.add(rootChild1Child1);
        rootChild1.children.add(rootChild1Child2);
        rootChild1.children.add(rootChild1Child3);

        root.children.add(rootChild1);
        root.children.add(rootChild2);
        root.children.add(rootChild3);

        return root;

    }

    public static void depthFirstSearch(NaryTree tree) {
        if(tree != null) {
            if(!tree.children.isEmpty()) {
                for(NaryTree child: tree.children) {
                    depthFirstSearch(child);
                }
            }
            System.out.print(tree.value + ",");
        }


    }

    public static void breadthFirstSearch(NaryTree tree) {
        System.out.println("breadthFirstSearch");

        if(tree == null)
            return;

        Queue<NaryTree>  queue = new LinkedList<>();
        queue.add(tree);

        while(!queue.isEmpty()) {
            NaryTree dequeuedNode = queue.poll();
            System.out.print(dequeuedNode.value + ",");
            if(!dequeuedNode.children.isEmpty()) {
                for(NaryTree child: dequeuedNode.children) {
                    queue.offer(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        NaryTree root = formTree();
        System.out.println("depthFirstSearch");
        depthFirstSearch(root);
        System.out.println();
        breadthFirstSearch(root);

    }
}
