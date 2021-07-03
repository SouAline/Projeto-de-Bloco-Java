
package br.edu.infnet.domain;

public class Mensalista extends Funcionario {
    protected double salario;
    
    public Mensalista(int matricula, String nome, String cargo, double salario){
        super (matricula, nome, cargo);
        this.salario = salario;
    }
    
    @Override
    public void calcularSalario(){
           StringBuilder sb = new StringBuilder();
           sb.append(mostrarCabeçalho());
           sb.append("Slario Bruto.............." + nf.format(salario));
           double.imposto = this.calcularImposto(this.salario);
           sb.append("Imposto...................." + nf.format(imposto));
           double liquido = this.salario + imposto;
           sb.append("Salario Líquido............." + nf.format(liquido));
           return 
    }
    
}
