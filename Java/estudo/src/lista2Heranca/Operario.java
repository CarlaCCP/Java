package lista2Heranca;

public class Operario extends Pessoa {
private double valorProducao; //que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário
private double comissao;
public double getValorProducao() {
	return valorProducao;
}
public void setValorProducao(double valorProducao) {
	this.valorProducao = valorProducao;
}
public double getComissao() {
	return comissao;
}
public void setComissao(double comissao) {
	this.comissao = comissao;
}


public Operario (String nome, String endereco , String telefone, double valorProducao, double comissao) {
	super(nome, endereco, telefone);
	this.comissao = comissao;
	this.valorProducao = valorProducao;
}

double calcSalarioOperario () {
	 return this.valorProducao * (this.comissao / 100);
}

}
