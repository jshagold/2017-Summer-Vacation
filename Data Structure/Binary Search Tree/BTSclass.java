/**
 * Created by Hak on 2017-06-20.
 */

public class BTSclass
{
    private Node root;

    public class Node
    {
        int element;
        Node right;
        Node left;
        Node parent;

        Node(int input)
        {
            this.element = input;
        }
    }

    // insert method
    public void insert(int input)
    {
        Node node = new Node(input);

        if(root == null)
        {
            root = node;
        }
        else
        {
            insert(input, root);
        }
    }

    // Use recursive call to insert method
    public void insert(int input, Node ParentNode)
    {
        Node node = new Node(input);
            if(input < ParentNode.element && ParentNode.left == null)
            {
                ParentNode.left = node;
                node.parent = ParentNode;
            }
            else if(input < ParentNode.element && ParentNode.left != null)
            {
                insert(input, ParentNode.left);
            }
            else if(input > ParentNode.element && ParentNode.right == null)
            {
                ParentNode.right = node;
                node.parent = ParentNode;
            }
            else if(input > ParentNode.element && ParentNode.right != null)
            {
                insert(input, ParentNode.right);
            }
    }

    public void delete()
    {

    }

    // Print inorder traversal
    public void PrintInorder(Node node)
    {
        if(node == null)
        {
            return ;
        }
        PrintInorder(node.left);
        System.out.print(node.element + " ");
        PrintInorder(node.right);
    }

    // Print preorder traversal
    public void PrintPreorder(Node node)
    {
        if(node == null)
        {
            return ;
        }
        System.out.print(node.element + " ");
        PrintPreorder(node.left);
        PrintPreorder(node.right);
    }

    // Print postorder traversal
    public void PrintPostorder(Node node)
    {
        if(node == null)
        {
            return ;
        }
        PrintPostorder(node.left);
        PrintPostorder(node.right);
        System.out.print(node.element + " ");
    }

    // return root node
    public Node root()
    {
        return root;
    }

}
