package projetoJava;

import projetoJava.facade.Facade;
import projetoJava.singleton.SingletonEager;
import projetoJava.singleton.SingletonLazy;
import projetoJava.singleton.SingletonLazyHolder;
import projetoJava.strategy.ComportamentoAgressivo;
import projetoJava.strategy.ComportamentoDefensivo;
import projetoJava.strategy.ComportamentoNormal;
import projetoJava.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        eager = SingletonEager.getInstacia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Strategy
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Ana", "19450-120");

    }
}
