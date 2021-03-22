package application;

public class Program2 {

	public static void main(String[] args) {
		int processos[] = { 1, 2, 3, 4, 5 };
		int aux = processos.length;
		int tempo_servico[] = { 4, 5, 6, 3, 1 };
		int quantum = 2;
		eTempoMedio(processos, aux, tempo_servico, quantum);
	}

	public static void main(int processos[], int aux, int ts[], int te[], int quantum) { // Sobrecarga
		int ts_r[] = new int[aux];
		for (int i = 0; i < aux; i++)
			ts_r[i] = ts[i];
		int t = 0;
		while (true) {
			boolean p = true;
			for (int i = 0; i < aux; i++) {
				if (ts_r[i] > 0) {
					p = false;

					if (ts_r[i] > quantum) {
						t += quantum;
						ts_r[i] -= quantum;
					} else {
						t = t + ts_r[i];
						te[i] = t - ts[i];
						ts_r[i] = 0;
					}
				}
			}

			if (p == true)
				break;
		}
	}

	public static void eTempoDeResposta(int processes[], int aux, int ts[], int te[], int tr[]) {
		for (int i = 0; i < aux; i++)
			tr[i] = ts[i] + te[i];
	}

	// Metodo para calcular o tempo medio
	public static void eTempoMedio(int processos[], int aux, int ts[], int quantum) {
		int te[] = new int[aux], tr[] = new int[aux];
		int t_te = 0, t_tr = 0;

		// Função para encontrar o tempo de espera de todos os processos --> chama a main parametrizado.
		main(processos, aux, ts, te, quantum);

		// Função para encontrar o tempo de resposta de todos os processos
		eTempoDeResposta(processos, aux, ts, te, tr);

		System.out.println("Processos " + "Tempo de Serviço " + " Tempo de Espera " + " Tempo de Resposta");

		// Calcula o total do tempo de espera e o tempo de resposta
		for (int i = 0; i < aux; i++) {
			t_te = t_te + te[i];
			t_tr = t_tr + tr[i];
			System.out.println(" " + (i + 1) + "\t\t" + ts[i] + "\t\t " + te[i] + "\t\t " + tr[i]);
		}

		System.out.println("Tempo de espera medio = " + (float) t_te / (float) aux);
		System.out.println("Tempo de resposta medio = " + (float) t_tr / (float) aux);
	}
}