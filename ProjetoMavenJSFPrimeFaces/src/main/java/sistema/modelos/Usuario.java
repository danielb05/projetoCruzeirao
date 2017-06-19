package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name = "Usuario.pesquisarPorUserEmail", query = "select u from Usuario u where u.email = :email")
public class Usuario implements Serializable{
	public static final String PESQUISAR_POR_EMAIL = "Usuario.pesquisarPorUserEmail";

	private enum Sexo{
		M,F;
		
	};
	
	public enum TipoDocumento{
		RG,CPF,PASSAPORTE,DRIVER,CREF;
	}
	private enum Tipo{
		ADMIN,
		ORG,
		
	};
	public int getIdUsuario() {
		return UsuarioID;
	}
	public void setIdUsuario(int idUsuario) {
		this.UsuarioID = idUsuario;
	}
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int UsuarioID;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date datanasc;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@Enumerated(EnumType.STRING)	
	private TipoDocumento tipodocumento;
	
	public TipoDocumento getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(TipoDocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	
	
	private String email;
	private String senha;
	private String papel;
	private String documento;

	@ManyToMany(mappedBy="diretores",targetEntity=Time.class, fetch = FetchType.EAGER)
	private ArrayList<Time> times;
	
	@OneToMany(targetEntity = Inscricao.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Inscricao> inscricoes;
	
	@OneToMany(targetEntity = Campeonato.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)

	private ArrayList<Campeonato> campeonatos;
	

	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String foto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public ArrayList<Time> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneMovel() {
		return telefoneMovel;
	}
	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

}
