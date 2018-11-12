import java.util.*;
public class bfs2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int m = a.nextInt();
		int q = a.nextInt();
		
		Graph g = new Graph(1001);
		
		for (int i =0;i<m;i++){
			g.addEdge(a.nextInt(), a.nextInt());
		}
		
		int q1 ,q2;
		
		for (int i =0;i<q;i++){
			q1 = a.nextInt();
			q2 = a.nextInt();
			BreadthFirstPaths bfs = new BreadthFirstPaths (g,q1);

			if (bfs.hasPathTo(q2)){
				System.out.println("Yes");	
			}else{
				System.out.println("No");	
			}
			
			
		}
	}

}
