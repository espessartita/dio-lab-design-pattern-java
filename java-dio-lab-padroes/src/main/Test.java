package main;
import main.singleton.SingletonLazy;
import main.singleton.SingletonEager;
import main.singleton.SingletonLazyHolder;
import main.strategy.Comportamento;
import main.strategy.ComportamentoAgressivo;
import main.strategy.ComportamentoDefensivo;
import main.strategy.ComportamentoNormal;
import main.strategy.Robo;
import main.facade.Facade;

public class Test {
    public static void main (String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setStrategy(normal);

        robo.mover();
        robo.mover();
        robo.setStrategy(agressivo);

        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);

        robo.mover();
        robo.mover();


        Facade facade = new Facade();
        facade.migrarCliente("Bia", "123456789");
    }     
}
