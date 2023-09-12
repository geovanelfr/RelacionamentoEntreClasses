
package principal;

import java.util.Random;

/**
 *
 * @author geovanelfr
 */
public class Luta {
    
    //ATRIBUTOS
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    //METODOS ESPECIAIS

    public Luta() {
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
            this.aprovada = aprovada;
    }
    
    //METODOS ESPECIFICOS
    public void marcarLuta(Lutador dd, Lutador dt){
        if (dd.getCategoria() == dt.getCategoria() && dd.getNome() != dt.getNome()){
            setAprovada(true);
            this.setDesafiado(dd);
            this.setDesafiante(dt);
            System.out.println("Luta marcada com sucesso!");
        }else {
            setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Nao e possivel marcar a luta!");
        }
    }
    
    public void lutar(){
        if (this.getAprovada() == true) {
            getDesafiado().apresentar();
            getDesafiante().apresentar();
            
        Random rdn = new Random();
        int resultado = rdn.nextInt(3);
            
            System.out.println("Resultado da Luta: " + resultado);
        
        switch(resultado){
            case 0:
                System.out.println("Luta empatada!");
                getDesafiado().empatarLuta();
                getDesafiado().status();
                getDesafiante().empatarLuta();
                getDesafiante().status();
            break;
            
            case 1:
                System.out.println("Desafiado venceu a luta!");
                getDesafiado().ganharLuta();
                getDesafiado().status();
                getDesafiante().perderLuta();
            break;
            
            case 2:
                System.out.println("Desafiante venceu a luta!");
                getDesafiante().ganharLuta();
                getDesafiante().status();
                getDesafiado().perderLuta();
            break;
            
        }    
        
        }else {
            System.out.println("Luta nao pode acontecer!!!");
        }
    }
}
