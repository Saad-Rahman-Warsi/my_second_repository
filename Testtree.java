import java.io.*;
import java.util.*;

public class Testtree
{
   

    public static void insert(BTNode<Integer> e,int a)
    {
        if (e.value!=null&&e.value>a)
        {
            if (e.right_child==null)
            {
            	BTNode<Integer> n;
                n=new BTNode<Integer>();
                n.value=a;
                e.right_child=n;
            }
            else
            {
                 insert( e.right_child, a);
            }
        }
        else
        {
            if (e.left_child==null)
            {
            	BTNode<Integer> n;
                n=new BTNode<Integer>();
                n.value=a;
                e.left_child=n;
            }
            else
            {
                 insert( e.left_child, a);
            }
        }
    }
    public static void inorder (BTNode<Integer> e)
    {
        if (e!=null)
        {
        inorder(e.left_child);
        System.out.println(e.value);
        inorder(e.right_child);
        }
    }
    public static void preorder(BTNode<Integer> e)
    {
        if (e!=null)
        {
        System.out.println(e.value);
        preorder(e.left_child);
        preorder(e.right_child);
        }
    }
    public static void postorder(BTNode<Integer> e)
    {
        if (e!=null)
        {
        postorder(e.left_child);
        postorder(e.right_child);
        System.out.println(e.value);
        }
    }
	public static void main(String[] args)
	{
	     BTNode<Integer> root;
	    root=new BTNode<Integer>();
	    root.value=null;
	    root.left_child=null;
	    root.right_child=null;
	    System.out.println("press 1 to enter number");
        int choice;
        Scanner Sc = new Scanner(System.in);
        choice=Sc.nextInt();
        while (choice==1)
        {
        System.out.println("number");
        int n;
        n=Sc.nextInt();
        insert(root,n);
        System.out.println("press 1 to enter number");
        choice=Sc.nextInt();
        }
        System.out.println("preorder");
        preorder(root);
        System.out.println("inorder");
        inorder(root);
        System.out.println("postorder");
        postorder(root);
	}
}