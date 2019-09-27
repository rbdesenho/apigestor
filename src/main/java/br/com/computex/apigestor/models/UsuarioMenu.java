package br.com.computex.apigestor.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="usuario_menu")
@SequenceGenerator(name="usuario_menu_sequence", sequenceName="usuario_menu_seq", allocationSize=1)
public class UsuarioMenu implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="usuario_menu_sequence")
	private long id;
	
	@ManyToOne
    @JoinColumn(name = "usuario", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Usuario usuario;
	
	@ManyToOne
    @JoinColumn(name = "menu", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Menu menu;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
}
