package mx.edu.utez.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class PersonaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "primer_apellido")
	private String primer_apellido;
	@Column(name = "segundo_apellido")
	private String segundo_apellido;
	@Column(name = "rfc")
	private String rfc;
	@Column(name = "curp")
	private String curp;
	@Column(name = "clave_elector")
	private String clave_elector;
	@Column(name = "entidad_federativa")
	private String entidad_federativa;
	@Column(name = "municipio")
	private String municipio;
	@Column(name = "colonia")
	private String colonia;
	@Column(name = "calle")
	private String calle;
	@Column(name = "numero_ext")
	private String numero_ext;
	@Column(name = "numero_int")
	private String numero_int;
	@Column(name = "correo")
	private String correo;
	@Column(name = "fecha_registro")
	private String fecha_registro;


	public PersonaEntity() {

	}


	public long getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}


	public String getPrimer_apellido() {
		return primer_apellido;
	}


	public String getSegundo_apellido() {
		return segundo_apellido;
	}


	public String getRfc() {
		return rfc;
	}


	public String getCurp() {
		return curp;
	}


	public String getClave_elector() {
		return clave_elector;
	}


	public String getEntidad_federativa() {
		return entidad_federativa;
	}


	public String getMunicipio() {
		return municipio;
	}


	public String getColonia() {
		return colonia;
	}


	public String getCalle() {
		return calle;
	}


	public String getNumero_ext() {
		return numero_ext;
	}


	public String getNumero_int() {
		return numero_int;
	}


	public String getCorreo() {
		return correo;
	}


	public String getFecha_registro() {
		return fecha_registro;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}


	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public void setCurp(String curp) {
		this.curp = curp;
	}


	public void setClave_elector(String clave_elector) {
		this.clave_elector = clave_elector;
	}


	public void setEntidad_federativa(String entidad_federativa) {
		this.entidad_federativa = entidad_federativa;
	}


	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public void setColonia(String colonia) {
		this.colonia = colonia;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public void setNumero_ext(String numero_ext) {
		this.numero_ext = numero_ext;
	}


	public void setNumero_int(String numero_int) {
		this.numero_int = numero_int;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
}
