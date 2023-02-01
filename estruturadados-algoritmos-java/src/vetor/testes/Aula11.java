package vetor.testes;

import vetor.VetorObject;

public class Aula11 {
    
    public static void main(String[] args) {
        
        VetorObject vetor = new VetorObject(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento string");
        
        System.out.println(vetor);
    }
}
