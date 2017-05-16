/**
 * 
 */
package sgbr.fachada;

import java.sql.SQLException;

import sgbr.cadastros.sql.DAOPessoa;
import sgbr.entidades.Pessoa;

/**
 * @author Reinaldo
 *
 */
public class FachadaSGBR {

	public Pessoa incluirPessoa(Pessoa pPessoa) throws SQLException {

		return DAOPessoa.getInstancia().incluir(pPessoa);

	}
}
