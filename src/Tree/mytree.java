package Tree;

public class mytree {
    public node retanable(int data)
        {
            node newnode=new node();
            newnode.data=data;
            return newnode;
        }
public void reader1(node root)
{
    if(root==null)
    {
        return;
    }
    else
    {
        System.out.println(root.data);
        reader1(root.left);
        reader1(root.right);

    }
}
    public void reader2(node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            reader2(root.left);
            System.out.println(root.data);
            reader2(root.right);

        }
    }
    public void reader3(node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            reader3(root.left);
            reader3(root.right);
            System.out.println(root.data);


        }
    }

}
