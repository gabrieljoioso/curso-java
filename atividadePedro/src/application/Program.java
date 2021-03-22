package application;

public class Program {

	public static void main(String[] args) {

		int t = 0;
		int quantum = 2;
		int[] ts = { 4, 5, 6, 3, 1 };
		int[] ts_r = { 4, 5, 6, 3, 1 };
		double[] te = { };
		double[] tr = { }; 

		for (int i = 0; i < 5; i++)
			if (ts_r[i] > quantum) {
				t += quantum;
				ts_r[i] -= quantum;
			} else { // Último ciclo para este processo
				t += ts_r[i];
				te[i] = t - ts[i];
				ts_r[i] = 0; // Este processo finalizou
			}
	}
}
