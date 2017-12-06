package professor;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/professores")
public class ProfessorRest {

  private ProfessorDao professorDao;

  public ProfessorRest() {
    professorDao = new ProfessorDao();
  }
  
	@GET
	@Produces("application/json")
	public List<Professor> listar() {
	  return professorDao.listar();
	}

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public Professor salvar(Professor professor) {
    return professorDao.salvar(professor);
  }

}