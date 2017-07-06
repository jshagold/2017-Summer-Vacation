/**
 * Created by Hak on 2017-06-20.
 */

public class BTSclass
{
    private Node root;

    // The skeleton of the Node method
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

    // search method
    public void Search(int input)
    {
        Search(input, root);
    }

    // Search method using recursive call
    public void Search(int input, Node node)
    {
        if(node == null)
        {
            System.out.println("There is no node of the given input value");
            return ;
        }

        String parent = null, left = null, right = null;
        if(input == node.element)
        {
            if(node.parent != null)
            {
                parent = Integer.toString(node.parent.element);
            }
            if(node.left != null)
            {
                left = Integer.toString(node.left.element);
            }
            if(node.right != null)
            {
                right = Integer.toString(node.right.element);
            }
            System.out.println("element = " + node.element + "\nparent = " + parent + "\nleftchild = " + left + " rightchild = " + right);
        }
        else
        {
            if(input < node.element)
            {
                Search(input, node.left);
            }
            else if(input > node.element)
            {
                Search(input, node.right);
            }
        }
    }


    // insert method
    public void Insert(int input)
    {
        Node node = new Node(input);

        if(root == null)
        {
            root = node;
        }
        else
        {
            Insert(input, root);
        }
    }


    // Insert method using recursive call
    public void Insert(int input, Node ParentNode)
    {
        Node node = new Node(input);
            if(input < ParentNode.element && ParentNode.left == null)
            {
                ParentNode.left = node;
                node.parent = ParentNode;
            }
            else if(input < ParentNode.element && ParentNode.left != null)
            {
                Insert(input, ParentNode.left);
            }
            else if(input > ParentNode.element && ParentNode.right == null)
            {
                ParentNode.right = node;
                node.parent = ParentNode;
            }
            else if(input > ParentNode.element && ParentNode.right != null)
            {
                Insert(input, ParentNode.right);
            }
    }

    // delete method
    public void Delete(int input)
    {
        Delete(input, root);
    }
    // Delete method using recursive call
    public void Delete(int input, Node node)
    {
        if(node == null)
        {
            System.out.println("can't find node with element " + input);
            return ;
        }

        if(input != node.element)
        {
            if(input < node.element)
            {
                Delete(input, node.left);
            }
            else
            {
                Delete(input, node.right);
            }
        }
        else
        {
            Node temp = node.right;
            if(node == root)
            {
                while(temp.left != null)
                {
                    temp = temp.left;
                }
                temp.parent.left = null;
                temp.parent = null;

                temp.left = node.left;
                node.left.parent = temp;

                temp.right = node.right;
                node.right.parent = temp;

                root = temp;
            }
        }
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
