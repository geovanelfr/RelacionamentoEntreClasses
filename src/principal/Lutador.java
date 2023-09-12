package principal;

/**
 *
 * @author geovanelfr
 */
public class Lutador implements ILutador{
    
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas; 
    private int empates;

    //metodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Lutador() {
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getNacionalidade() {return nacionalidade;}
    public void setNacionalidade(String nacionalidade) {this.nacionalidade = nacionalidade;}
    
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}

    public float getPeso() {return peso;}
    public void setPeso(float peso) {
        this.peso = peso; 
        this.setCategoria();
    }

    public String getCategoria() {return categoria;}
    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        }else if (this.peso <= 120.2) {
            this.categoria = "pesado";
        }else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {return vitorias;}
    public void setVitorias(int vitorias) {this.vitorias = vitorias;}

    public int getDerrotas() {return derrotas;}
    public void setDerrotas(int derrotas) {this.derrotas = derrotas;}

    public int getEmpates() {return empates;}
    public void setEmpates(int empates) {this.empates = empates;}
    
    //Metodos da Interface
    @Override
    public void apresentar() {
        System.out.println(this.getNome() + " de(a) " + this.getNacionalidade() + " com " +this.getIdade() + " anos, pesando " + this.getPeso() + " com " + this.getAltura() + " de altura"
        + " na categoria dos pesos " + this.getCategoria() +", com um historico de " + this.getVitorias() + " Vitorias, " + this.getEmpates() + " Empates e "  + this.getDerrotas() + " Derrotas");
    }

    @Override
    public void status() {
        System.out.println("Nome: "+this.getNome()+"  |  Peso: "+this.getPeso()+"  |  Categoria: "+this.getCategoria()+"  |  Vitorias: "+ this.getVitorias()+"  |  Derrotas: "+this.getDerrotas()+"  |  Empates:"+ this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
