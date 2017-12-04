/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cidades;
import Modelo.Estabelecimentos;
import Modelo.Promocoes;
import Modelo.Usuarios;
import Util.HibernateUtil;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.CroppedImage;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Hipercom
 */
@javax.faces.bean.ManagedBean //gera bean
@RequestScoped
public class EstabelecimentosDAO implements java.io.Serializable{

    private String imagemTemporaria;
    EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();

    Estabelecimentos e = new Estabelecimentos();
     List<Estabelecimentos> lista;
     List<Cidades> cidades;

    public Estabelecimentos getE() {
        return e;
    }

    public void setE(Estabelecimentos e) {
        this.e = e;
    }
    
    
    
    private StreamedContent imagemEnviada = new DefaultStreamedContent();

private CroppedImage croppedImage;
private boolean exibeBotao = false;

    /* getters e setters */
    public StreamedContent getImagemEnviada() {
        return imagemEnviada;
    }

    public void setImagemEnviada(StreamedContent imagemEnviada) {
        this.imagemEnviada = imagemEnviada;
    }

    public String getImagemTemporaria() {
        return imagemTemporaria;
    }

    public void setImagemTemporaria(String imagemTemporaria) {
        this.imagemTemporaria = imagemTemporaria;
    }

    public CroppedImage getCroppedImage() {
        return croppedImage;
    }

    public void setCroppedImage(CroppedImage croppedImage) {
        this.croppedImage = croppedImage;
    }

    public boolean isExibeBotao() {
        return exibeBotao;
    }

    public void setExibeBotao(boolean exibeBotao) {
        this.exibeBotao = exibeBotao;
    }
 


   public void criaArquivo(byte[] bytes, String arquivo) throws IOException {
      FileOutputStream fos;
      try {
         fos = new FileOutputStream(arquivo);
         fos.write(bytes);
         fos.close();
      } catch (FileNotFoundException ex) {
         Logger.getLogger(EstabelecimentosDAO.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
         Logger.getLogger(EstabelecimentosDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
 
   public void enviarImagem(FileUploadEvent event) throws IOException {
      byte[] img = event.getFile().getContents();
      imagemTemporaria = event.getFile().getFileName();
      FacesContext facesContext = FacesContext.getCurrentInstance();
      ServletContext scontext = (ServletContext) facesContext.getExternalContext().getContext();
      String arquivo = "E:\\Downloads\\testeJsf\\upload\\"+imagemTemporaria;
       System.err.println(arquivo);
      criaArquivo(img, arquivo);
      
   }
 
   public void crop() {
      setImagemEnviada(new DefaultStreamedContent(new ByteArrayInputStream(croppedImage.getBytes())));
   }   
    
    public List<Cidades> $BuscarCidades(){
    Query query = em.createQuery("SELECT e.cid_nome  FROM cidades e");
        cidades = (List<Cidades>) query.getResultList();
        
        return cidades;
    }
    
    public String $AdicionarEstabelecimentos() {
        this.em.getTransaction().begin();
        this.em.persist(e);
        this.em.getTransaction().commit();
        this.em.close();
        String a = "Inserir";
        return a;
    }

    public void $ExcluirUsuario() {       
        this.em.getTransaction().begin();
        this.em.remove(e);
        this.em.getTransaction().commit();
        this.em.close();        
    }
    

    public Estabelecimentos $RetornarEstabelecimentos(int id) {
        this.em.getTransaction().begin();
        Estabelecimentos est1 = this.em.find(Estabelecimentos.class, id);
        this.em.getTransaction().commit();
        this.em.close();
        return est1;
    }

    public void $EditarEstabelecimentos(Estabelecimentos est_new) {
        this.em.getTransaction().begin();
        this.em.merge(est_new);
        this.em.getTransaction().commit();
        this.em.close();
    }

    public List<Estabelecimentos> $RetornarTodosEstabelecimentos() {
        
        Query query = em.createQuery("SELECT e FROM Estabelecimentos  e");
        lista = (List<Estabelecimentos>) query.getResultList();
        
        return lista;
    }

//    public void $AdicionarPromocao(int promo_id, int est_id) {
//        Promocoes p1 = this.em.find(Promocoes.class, promo_id);
//        Estabelecimentos est1 = this.em.find(Estabelecimentos.class, est_id);
//        em.getTransaction().begin();
//        est1.getEst_promo().add(p1);
//        em.getTransaction().commit();
//        em.close();
//    }
    
    public List getEstabelecimentos(){
    return $RetornarTodosEstabelecimentos();
    }
}
