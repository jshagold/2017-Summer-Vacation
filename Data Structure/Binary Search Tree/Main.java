import java.util.SortedMap;

/**
 * Created by Hak on 2017-06-20.
 */

public class Main
{
    public static void main(String[] args)
    {
        BTSclass node = new BTSclass();

        node.Insert(6);
        node.Insert(3);
        node.Insert(10);
        node.Insert(5);
        node.Insert( 16);
        node.Insert(1);
        node.Insert(4);
        node.Insert(2);
        node.Insert(7);

        System.out.println("Search 6");
        node.Search(6);

        System.out.println("\nSearch 20");
        node.Search(20);


        System.out.println("\n\ninorder traversal");
        System.out.print("root = " + node.root().element + "  ");
        node.PrintInorder(node.root());

        System.out.println("\n\npreorder traversal");
        System.out.print("root = " + node.root().element + "  ");
        node.PrintPreorder(node.root());

        System.out.println("\n\npostorder traversal");
        System.out.print("root = " + node.root().element + "  ");
        node.PrintPostorder(node.root());

        System.out.println("\n\ndelete root");
        node.Delete(6);

        System.out.println("\n\ninorder traversal");
        System.out.print("root = " + node.root().element + "  ");
        node.PrintInorder(node.root());

        System.out.println("\n\npreorder traversal");
        System.out.print("root = " + node.root().element + "  ");
        node.PrintPreorder(node.root());

        System.out.println("\n\npostorder traversal");
        System.out.print("root = " + node.root().element + "  ");
        node.PrintPostorder(node.root());
    }
}
