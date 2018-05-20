package br.com.casadocodigo.service;

import br.com.casadocodigo.model.NF;

public class WSPrefeitura {

	public static void emit(NF nf) {
		try {
			String thread = Thread.currentThread().getName();
			System.out.println("Emitindo na thread "+thread+"...");
			Thread.sleep(5000);		
			System.out.println("...Emitido!");
		}catch(Exception e) {
			System.out.println("<<< Falha ao emitir NF >>>");
		}
	}
}
