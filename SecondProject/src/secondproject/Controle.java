package secondproject;

public class Controle {
    int reviews;
    int mediocres;
    double percMediocre;
    double somaScore;
    double desvioScore;
    String melhorJogo;
    double scoreMelhor;
    String piorJogo;
    double scorePior;

    public Controle(double score, String nome) {
        reviews = 0;
        percMediocre = 0;
        desvioScore = 0;
        melhorJogo = nome;
        scoreMelhor = score;
        piorJogo = nome;
        scorePior = score;
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
}
