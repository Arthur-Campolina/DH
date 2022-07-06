public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Jorge", "Silva");
        Observador juan = new Seguidor("Juan", "Silva");
        Observador pedro = new Seguidor("Pedro", "Silva");

        usuario.adicionar(juan);
        usuario.adicionar(pedro);
        usuario.publicarFoto();

    }
}
