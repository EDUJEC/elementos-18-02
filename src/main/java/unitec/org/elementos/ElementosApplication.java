package unitec.org.elementos;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner{
    
    /**Aqui se prueban todas las operaciones crud**/
    @Autowired RepositorioMensajitos repoMensa;

	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
                
	}

    @Override
    public void run(String... strings) throws Exception {
        Mensajitos m=new Mensajitos("primero","Mi primer mensajito con hibernate");
            //repoMensa.save(m);
            
           // ArrayList<Mensajitos> mensajitos = ( ArrayList<Mensajitos>)repoMensa.findAll();
           // for(Mensajitos mensa: mensajitos){
           // System.out.println(mensa.getTitulo());
           // }
      
          //Ahora probaremos buscar por id
           // repoMensa.findOne(1);
          
           //Actualizacion
           ;repoMensa.save(new Mensajitos(2,"otro","malo"));
           
           //Borrara
           repoMensa.delete(1);
    }
}
