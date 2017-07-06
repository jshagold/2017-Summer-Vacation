/**
 * Created by Hak on 2017-06-20.
 */

public class Main
{
    public static void main(String[] args)
    {
        BTSclass node = new BTSclass();

        node.insert(6);
        node.insert(3);
        node.insert(10);
        node.insert(5);
        node.insert( 16);
        node.insert(1);
        node.insert(4);
        node.insert(2);
        node.insert(7);

        System.out.println("inorder traversal");
        node.PrintInorder(node.root());

        System.out.println("\n\npreorder traversal");
        node.PrintPreorder(node.root());

        System.out.println("\n\npostorder traversal");
        node.PrintPostorder(node.root());
    }
}
