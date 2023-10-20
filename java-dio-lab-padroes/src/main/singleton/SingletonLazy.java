package main.singleton;

/*
 * instância não disponível ao usuário - 
 * construtor privado
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
