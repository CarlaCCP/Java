package lista2Heranca;

public class Vendedor  extends Pessoa{
private double valorVendas;
private double atributoComissao;


public double getValorVendas() {
	return valorVendas;
}
public void setValorVendas(double valorVendas) {
	this.valorVendas = valorVendas;
}
public double getAtributoComissao() {
	return atributoComissao;
}
public void setAtributoComissao(double atributoComissao) {
	this.atributoComissao = atributoComissao;
}


public Vendedor (String nome, String endereco, String telefone, double valorVendas, double atributoComissao) {
	super (nome, endereco, telefone);
	this.valorVendas = valorVendas;
	this.atributoComissao = atributoComissao;
	
}

}
