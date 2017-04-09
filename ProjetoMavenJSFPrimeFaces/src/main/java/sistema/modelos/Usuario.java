package sistema.modelos;

import java.util.Date;

public class Usuario {
	private String nome;
	private Date datanasc;
	private String email;
	private String senha;
	private String papel;
	private String documento;
	private String tipoDocumento;
	private boolean aceiteTime;
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
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public boolean isAceiteTime() {
		return aceiteTime;
	}
	public void setAceiteTime(boolean aceiteTime) {
		this.aceiteTime = aceiteTime;
	}

}
