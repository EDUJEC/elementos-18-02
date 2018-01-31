/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.org.elementos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



/**
 *
 * @author JOSEEDUARDO
 */ 
@Entity
public class Mensajitos {
    
    @Id/**para generar o espesificar el primari key de la tabla **/
    /**@Column(name="id") para inicializar una llave con nombre diferente**/
    @GeneratedValue /**para espesificar el auto incremento**/
    private Integer id;
    
    private String titulo;
    private String cuerpo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Mensajitos() {
    }

    public Mensajitos(Integer id) {
        this.id = id;
    }

    public Mensajitos(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensajitos(Integer id, String titulo, String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    
    
    
}
