package vetor.testes;

import vetor.VetorObject;

public class Aula10 {
    
    public static void main(String[] args) {
        
        VetorObject vetor = new VetorObject(3);

        Contato c1 = new Contato("Luccas", "1234-56789", "luccas@gmail.com");
        Contato c2 = new Contato("Gabriel", "1234-56789", "gabriel@gmail.com");
        Contato c3 = new Contato("Maria", "1234-56789", "maria@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c1);
        if(pos > -1){
            System.out.println("Elemento existe no vetor!");
        }else{
            System.out.println("Elemento não existe!");
        }

        System.out.println(vetor);
    }
}
