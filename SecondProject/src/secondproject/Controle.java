package secondproject;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Controle {
    int reviews;
    int mediocres;
    double percMediocre;
    double somaScore;
    String melhorJogo;
    double scoreMelhor;
    String piorJogo;
    double scorePior;
    int contAction;
    ArrayList<Double> scores;
    Map<String, Double> jogos;

    public Controle(Double score, String nome) {
        this.reviews = 0;
        this.percMediocre = 0;
        this.melhorJogo = nome;
        this.scoreMelhor = score;
        this.piorJogo = nome;
        this.scorePior = score;
        this.scores = new ArrayList();
        this.scores.add(score);
        this.contAction = 0;
        this.jogos = new TreeMap<String, Double>();
    }
    
    public void addJogo(String jogo, Double score){
        this.jogos.put(jogo, score);
    }
    
    public void addAction(String avaliacao, String jogo){
        if (avaliacao.equals("Action")&&!this.jogos.containsKey(jogo)) 
        {
            this.contAction ++;
        }
    }
    
    public void addScore(Double s){
        this.scores.add(s);
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
