package main.singleton;

/*
 * instância não disponível ao usuário - 
 * construtor privado
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
