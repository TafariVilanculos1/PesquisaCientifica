/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author tafarivilanculos
 */
import Model.PesquisaCientifica;
import View.ObserverGraficos;
import java.util.ArrayList;
import java.util.List;

public class ControlPesquisa {
    
    
    List<PesquisaCientifica> listapesquisas = new ArrayList<PesquisaCientifica>();
    List<ObserverGraficos> listaObservers = new ArrayList<ObserverGraficos>();
    
    public void adicionarPesquisa(PesquisaCientifica pesquisa)
    {
       listapesquisas.add(pesquisa);
    
       notificarObservers();
    
    }
    
    public void adicionarListaObserevers(ObserverGraficos o)
    {
      listaObservers.add(o);
    
    }
    
    
    private void notificarObservers() {
        
        for(ObserverGraficos o : listaObservers)
        {
            o.actualizar();
        
        }
       
    }
    
    
   public List<PesquisaCientifica> listaDePesquisas() {
    return listapesquisas;
}

    
 
    
}

