import java.util.*;
public class bfs1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Graph g = new Graph(1001);
		int n = a.nextInt();
		
		for (int i =0;i<n;i++){
			g.addEdge(a.nextInt(), a.nextInt());
		}
		int q1 ,q2;
		while (true){
			q1 = a.nextInt();
			q2 = a.nextInt();
			
			if (q1 == 0 && q2 == 0) break;
			
			BreadthFirstPaths bfs = new BreadthFirstPaths (g,q1);
			
			int count = 0;
			
			for (int i =0;i<1001;i++){
				if (bfs.distTo(i)>q2){
					count++;
				}
			}
			System.out.println(count);
			
		}

	}

}
