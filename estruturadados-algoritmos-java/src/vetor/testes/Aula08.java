package vetor.testes;

import vetor.Vetor;

public class Aula08 {
    
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(2);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
    }
}
