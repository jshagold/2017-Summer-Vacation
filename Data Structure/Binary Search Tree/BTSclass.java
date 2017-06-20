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


}
