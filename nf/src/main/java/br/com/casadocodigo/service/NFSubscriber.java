package br.com.casadocodigo.service;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import br.com.casadocodigo.model.NF;

public class NFSubscriber implements Subscriber<NF>{

	private Subscription subscription;

	@Override
	public void onComplete() {
		System.out.println("<<< Todas as notas já foram emitidas >>>");
		
	}

	@Override
	public void onError(Throwable t) {
		t.printStackTrace();
		
	}

	@Override
	public void onNext(NF nf) {
		WSPrefeitura.emit(nf);
		subscription.request(1);
		
	}

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
		
	}

		
}
