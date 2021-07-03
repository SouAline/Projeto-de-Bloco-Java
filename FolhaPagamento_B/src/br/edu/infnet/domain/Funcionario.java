
package br.edu.infnet.domain;

import java.text.NumberFormat;

public abstract class Funcionario {
    protected int matricula;
    protected String nome:
    protected NumberFormat nf = NumberFormat.getCurrencyInstance();
       
}
    public Funcionario[int matricula, String nome, String cargo]{
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;   
}
    public abstract void calcularSalario();
    
    protected void mostrarCabeçalho(){
        StringBuilder sb= new StringBuilder();
        sb.append("-----------------------------------")
        sb.append("  Instituto Infnet : Contracheque")
        sb.append("Matricula ...............", this matricula);
        sb.append("Nome.....................", this.nome)
        sb.append("Cargo....................", this.cargo)
        return sb.toString();
}
    protected double calcularImposto(double valor){
        double retorno = 0;
        if (valor > 1000 && valor <= 3000){
            retorno = valor * 0,15;
        } else if (valor > 3000 && valor <= 6000){
            retorno = valor * 0,2;
        }else if (valor > 6000){
            retorno = valor * 0,25;
        }
        return retorno;
    }
    
    public int getMatricula(){
        return matricula;
    }   
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }    
    public String getNome(){
        return nome;
}
    public void setNome(String nome){
        this.nome = nome;
}
    public String getCargo(){
        return cargo;
}
    public void setCargo(String cargo){
        this.cargo = cargo;
}

}  
