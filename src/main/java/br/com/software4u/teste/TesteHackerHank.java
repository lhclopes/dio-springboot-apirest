package br.com.software4u.teste;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TesteHackerHank {

    static class Pair {
        String chave;
        int score;
    
        public Pair(String chave, int score) {
            this.chave = chave;
            this.score = score;
        }
    
        @Override
        public String toString() {
            return chave + " -> " + score;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Pair> fila = new PriorityQueue<>(
            Comparator.comparingInt((Pair p) -> p.score).reversed()
        );

        fila.add(new Pair("TeamA", 1));
        fila.add(new Pair("TeamB", 2));
        fila.add(new Pair("TeamC", 3));
        fila.add(new Pair("TeamD", 1));

        Pair primeiro = fila.peek();
        System.out.println("Primeiro elemento: " + primeiro);

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

    }

}
