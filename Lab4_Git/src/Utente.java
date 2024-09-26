
public class Utente {
private String nome;
private String genero;
private int idade;
private float altura;
private int peso;
/**
 * @param nome
 * @param genero
 * @param idade
 * @param altura
 * @param peso
 */
public Utente(String nome, String genero, int idade, float altura, int peso) {
	super();
	this.nome = nome;
	this.genero = genero;
	this.idade = idade;
	this.altura = altura;
	this.peso = peso;
}
/**
 * @return the nome
 */
public String getNome() {
	return nome;
}
/**
 * @param nome the nome to set
 */
public void setNome(String nome) {
	this.nome = nome;
}
/**
 * @return the genero
 */
public String getGenero() {
	return genero;
}
/**
 * @param genero the genero to set
 */
public void setGenero(String genero) {
	this.genero = genero;
}
/**
 * @return the idade
 */
public int getIdade() {
	return idade;
}
/**
 * @param idade the idade to set
 */
public void setIdade(int idade) {
	this.idade = idade;
}
/**
 * @return the altura
 */
public float getAltura() {
	return altura;
}
/**
 * @param altura the altura to set
 */
public void setAltura(float altura) {
	this.altura = altura;
}
/**
 * @return the peso
 */
public int getPeso() {
	return peso;
}
/**
 * @param peso the peso to set
 */
public void setPeso(int peso) {
	this.peso = peso;
}

}
