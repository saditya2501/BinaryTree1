package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        node root;
        node root2;
        Scanner ch=new Scanner(System.in);
        mytree sc=new mytree();
        root=sc.retanable(1);
        root2=root;
        root.left=sc.retanable(4);
        root.right=sc.retanable(9);
        root.left.left=sc.retanable(16);

        System.out.println("enter choise");
        System.out.println("1 for pre : 2 for in : 3 for post ");
        int choise=ch.nextInt();
        if(choise==1)
        {
        sc.reader1(root2);
        }
        else if (choise==2)
        {
        sc.reader2(root2);
        }
        else
        {
            sc.reader3(root2);
        }



    }

}
