package sistema.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.servlet.http.HttpServletRequest;

import util.AlertaUtil;


@ManagedBean
@ViewScoped
public class LoginBean{
	
	private AlertaUtil msg = new AlertaUtil();
	
	
	public void preRender(){
		
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		if ("true".equals(request.getParameter("error"))) {
			msg.exibirErroGrowl("Usu�rio ou senha inv�lidos");
		}
		
	}
	
	
}
