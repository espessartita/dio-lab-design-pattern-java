package main.singleton;

/*
 * instância não disponível ao usuário - 
 * construtor privado
 *      - safer
 *  @see <a href="https://stackoverflow.com/a/24018148">ref</a>
 */
public class SingletonLazyHolder {
    //encapsulamento
    private static class InstanciaHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanciaHolder.instancia; 
    }
}
