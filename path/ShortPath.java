import java.util.*;
public class ShortPath {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int m = a.nextInt();
		
		EdgeWeightedDigraph g = new EdgeWeightedDigraph(n+1);
		
		for (int i=0;i<m;i++){
			g.addEdge(new DirectedEdge(a.nextInt(), a.nextInt(), a.nextInt()));
		}
		int s = a.nextInt();
		
		DijkstraSP dij = new DijkstraSP(g, s);
		
		for (int i=0;i<=n;i++){
			if (!Double.isInfinite(dij.distTo(i))){
				System.out.print(s+" to "+i);
				System.out.printf(" ( %.2f): ",dij.distTo(i));
				Stack<DirectedEdge> st = dij.pathTo(i);
				System.out.print(s);
				while(!st.isEmpty()) {
					DirectedEdge e = st.pop();
					System.out.print(" -> " + e.to());
				}
				System.out.println();
			}
		}

	}

}
