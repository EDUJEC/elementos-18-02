/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org.elementos;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author JOSEEDUARDO
 */
public interface RepositorioMensajitos extends CrudRepository<Mensajitos, Integer>{
    /**Solucion con polimorfismo de la injeccion de dependencias**/
    /** contiene todos los comandos de My sql**/
    
    
}
