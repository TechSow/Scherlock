package br.com.techsow.sherlock.control.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.techsow.sherlock.model.exception.ApelidoException;
import br.com.techsow.sherlock.model.exception.EmailNotFound;
import br.com.techsow.sherlock.model.exception.LengthException;
import br.com.techsow.sherlock.model.exception.NumberException;
import br.com.techsow.sherlock.model.interfaces.web.Task;

public class GetPessoaController implements Task {

	@Override
	public String processTask(HttpServletRequest req, HttpServletResponse resp)
			throws LengthException, NumberException, ApelidoException, EmailNotFound, Exception {

		
		int id = Integer.parseInt(req.getParameter("usuarioId"));
		System.out.println(id);
		
		return "pessoa.jsp";
	}

	
	
	
}
