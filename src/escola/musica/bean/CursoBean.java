package escola.musica.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

@ManagedBean
@SessionScoped
public class CursoBean {

	private Curso curso = new Curso();
	private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());
	private List<Curso> cursos= new ArrayList<Curso>();
	
	public String salvar(){
		cursos.add(curso);
		
		curso= new Curso();
		
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Salvado con exito"));
		
		return "curso_lista?faces-redirect=true";
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<TipoCurso> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoCurso> tipos) {
		this.tipos = tipos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	

}
