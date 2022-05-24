package Dio.Gof;

import Dio.Gof.Facade.Facade;
import Dio.Gof.Singleton.SingletonEager;
import Dio.Gof.Singleton.SingletonLazyHolder;
import Dio.Gof.Singleton.singletonLazy;
import Dio.Gof.Strategy.Comportamento;
import Dio.Gof.Strategy.ComportamentoAgressivo;
import Dio.Gof.Strategy.ComportamentoDefensivo;
import Dio.Gof.Strategy.ComportamentoNormal;
import Dio.Gof.Strategy.Robo;

public class teste {
	


	public static void main(String[] args) {
		
	
		
		singletonLazy lazy = singletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = singletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}