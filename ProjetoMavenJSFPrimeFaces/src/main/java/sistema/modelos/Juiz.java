package sistema.modelos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Juiz implements Serializable{
	
	private enum Tipo{
		JUIZ,BANDEIRINHA,ARBITRO
	}
	@OneToOne(targetEntity = Usuario.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	private Usuario usuario;
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int JuizID;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
