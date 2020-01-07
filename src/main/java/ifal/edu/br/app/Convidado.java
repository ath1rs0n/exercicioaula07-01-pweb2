package ifal.edu.br.app;

public class Convidado {
    private int id;
    private String nome;
    private Integer quantidadeAcompanhantes;

    public Convidado() {
    }

    public Convidado(int id, String nome, Integer quantidadeAcompanhantes) {
        this.id = id;
        this.nome = nome;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }
    
    public Convidado(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Convidado){
            Convidado novo = (Convidado) obj;
            if(this.id == novo.getId()){
                return true;
            }
        }
        return super.equals(obj);
    }

}