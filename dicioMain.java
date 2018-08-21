
public class dicioMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dicionario<String, String> Dicionarioo = new Dicionario<>();
		String[] chaves = {"1","2","3","4","234214"};
		Dicionarioo.setKeys(chaves);
		Dicionarioo.add("2", "valor na chave 2");
		for(int i = 0 ;i < Dicionarioo.getKeys().length ;i++ ){
			System.out.println("Key:"+Dicionarioo.getKeys()[i].toString() + " Value:"+Dicionarioo.get(Dicionarioo.getKeys()[i]));
			
		}
	}

}
