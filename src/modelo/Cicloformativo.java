package modelo;
// Generated 20:57:28, 19 de xan. de 2023 by Hibernate Tools 5.6.14.Final

/**
 * Cicloformativo generated by hbm2java
 */
public class Cicloformativo implements java.io.Serializable {

	private Integer idCiclo;
	private String nombreCiclo;
	private Integer horas;

	public Cicloformativo() {
	}

	public Cicloformativo(String nombreCiclo, Integer horas) {
		this.nombreCiclo = nombreCiclo;
		this.horas = horas;
	}

	public Integer getIdCiclo() {
		return this.idCiclo;
	}

	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
	}

	public String getNombreCiclo() {
		return this.nombreCiclo;
	}

	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}

	public Integer getHoras() {
		return this.horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

}
