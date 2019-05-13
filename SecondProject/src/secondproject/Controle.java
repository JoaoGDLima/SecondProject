package secondproject;

import java.util.ArrayList;
import java.util.TreeMap;

public class Controle {
    int reviews;
    int mediocres;
    double percMediocre;
    double somaScore;
    String melhorJogo;
    double scoreMelhor;
    String piorJogo;
    double scorePior;
    ArrayList<Double> scores;

    public Controle(Double score, String nome) {
        reviews = 0;
        percMediocre = 0;
        melhorJogo = nome;
        scoreMelhor = score;
        piorJogo = nome;
        scorePior = score;
        scores = new ArrayList();
        scores.add(score);
    }
    
    public void contReview(){
        this.reviews ++;
    }
    
    public void contMediocres(String avaliacao){
        if (avaliacao.equals("Mediocre")) {
            this.mediocres ++;
        }
    }
    
    public void somaScore(double score){
        somaScore = somaScore + score;
    }
    
    public void verificaMelhorJogo(double score, String nomeJogo){
        if (score > this.scoreMelhor) {
            this.scoreMelhor = score;
            this.melhorJogo = nomeJogo;
        }
    }
    
    public void verificaPiorJogo(double score, String nomeJogo){
        if (score < this.scorePior) {
            this.scorePior = score;
            this.piorJogo = nomeJogo;
        }
    }
    
    public Double mediaScore(){
        return somaScore / reviews;
    }
    
    public String percMediocre(){
        return (this.mediocres*100/this.reviews) + "%";
    }
    
    public double desvioPadrao(){
        double soma = 0;
        for (int i = 0; i < this.scores.size(); i++) {
            soma = soma + Math.pow(this.scores.get(i) - this.mediaScore(), 2);
        }
        return Math.sqrt(soma/this.reviews);
    }
}
