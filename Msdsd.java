
public class Msdsd {
	
public static void main(String[] args) {
	
Codigo<String, Integer> cod = new Codigo<>();	
cod.setPt1("A");
cod.setPt2(123);

ProdutoG<Codigo> produto = new ProdutoG<Codigo>(cod, "descricao", 100);
System.out.println(produto.getCodigo().getPt1() + produto.getCodigo().getPt2().toString());

}

}
