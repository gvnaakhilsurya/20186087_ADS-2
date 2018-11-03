class PageRank {
	Digraph d;
	double[] pageRank;
	PageRank(Digraph d) {
		this.d = d;
		pageRank = new double[d.V()];
		for (int i = 0; i < pageRank.length; i++) {
			pageRank[i] = 1.0 / d.V();
		}
	}
	double getPR(int v) {
		double p = pageRank[v];
		//double finalpageRank=0;
		for(int j = 0; j <= 1000; j++) {
				for (int i: d.adj(v)) {
					if(d.outdegree(i)==0) {
						return 0;
					}
					p = pageRank[i]/d.outdegree(i);
					//finalpageRank+=p;
				}
			}
		return p;
	}
	public String toString() {
		String str = "";
		str += d + "\n";
		for (int i = 0; i < d.V(); i++) {
			str += i + " - " + getPR(i) + "\n";
		}
		return str;
	}
}
