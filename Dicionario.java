
public class Dicionario<K, V> {
public K key;
public V value;
public K[]	keys	=	(K[])	new	Object[10];
public V[]	values	=	(V[])	new	Object[10];
public void setValuesLength(int tamanho){
	values = (V[]) new Object[tamanho];
}
public void add(K key, V value){
	for(int i  = 0 ; i < keys.length ; i++){
		if(key == keys[i]){
			values[i] = value;
		}
	}
}

public V get(K key){
	for(int i = 0 ; i < keys.length ; i++){
		if(key == keys[i]){
			return values[i];
		}
	}
	return null;
}

public K getKey() {
	return key;
}

public void setKey(K key) {
	this.key = key;
}

public V getValue() {
	return value;
}

public void setValue(V value) {
	this.value = value;
}

public K[] getKeys() {
	return keys;
}

public void setKeys(K[] keys) {
	this.keys = keys;
}

public V[] getValues() {
	return values;
}

public void setValues(V[] values) {
	this.values = values;
}
}
