package modelo;
// Generated 20:57:28, 19 de xan. de 2023 by Hibernate Tools 5.6.14.Final

/**
 * Profesor generated by hbm2java
 */
public class Profesor implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String ape1;
	private String ape2;
	private String tipoFuncionario;

	public Profesor() {
	}

	public Profesor(String nombre, String ape1, String ape2) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
	}

	public Profesor(String nombre, String ape1, String ape2, String tipoFuncionario) {
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.tipoFuncionario = tipoFuncionario;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return this.ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return this.ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getTipoFuncionario() {
		return this.tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

}
