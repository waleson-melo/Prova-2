public class Main {
    public static void main(String[] args) {
        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        // Macaco1
        macaco1.setNome("Jurema");
        // Alimento 1
        macaco1.comer("banana");
        macaco1.verBucho();
        macaco1.digerir();
        // Alimento 2
        macaco1.comer("laranja");
        macaco1.verBucho();
        macaco1.digerir();
        // Alimento 3
        macaco1.comer("abacate");
        macaco1.verBucho();
        macaco1.digerir();

        System.out.println("");

        // Macaco2
        macaco2.setNome("Sebastiao");
        // Alimento 1
        macaco2.comer("bisteca");
        macaco2.verBucho();
        macaco2.digerir();
        // Alimento 2
        macaco2.comer("melancia");
        macaco2.verBucho();
        macaco2.digerir();
        // Alimento 3
        macaco2.comer("manga");
        macaco2.verBucho();
        macaco2.digerir();

        System.out.println("");

        System.out.println("Não é possível criar um macaco canibal, a não ser "
                +"que modifique o código para receber um objeto do tipo macaco.");
    }
}
