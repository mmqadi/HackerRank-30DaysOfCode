import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23 {
	
	public static Nodee insert(Nodee root,int data){
        if(root==null){
            return new Nodee(data);
        }
        else{
            Nodee cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Nodee root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            }
	static void levelOrder(Nodee root){
	      Queue<Nodee> queue = new LinkedList<Nodee>();
	      
	      queue.offer(root);
	      
	      while(!queue.isEmpty()) {
	    	  Nodee n = queue.poll();
	    	  if(n.left != null)
	    		  queue.offer(n.left);
	    	  if(n.right != null)
	    		  queue.offer(n.right);
	    	  
	    	  System.out.print(n.data + " ");
	      }
	      
	    }
}

class Nodee{
    Nodee left,right;
    int data;
    Nodee(int data){
        this.data=data;
        left=right=null;
    }
}
