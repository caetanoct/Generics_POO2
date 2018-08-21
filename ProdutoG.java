
public class ProdutoG<T> {
private T codigo;
private String descricao;
private double preco;

public ProdutoG(T cod, String des, double pr){
	codigo = cod;
	descricao = des;
	preco = pr;
	
}

public T getCodigo() {
	return codigo;
}

public void setCodigo(T codigo) {
	this.codigo = codigo;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

}
