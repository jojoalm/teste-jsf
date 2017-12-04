/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import javax.el.ELContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author USER
 */
class UploadedFile {
    
    
    private UploadedFile getUploadedPicture()
    {
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        UploadBean uploadBean = (UploadBean) elContext.getELResolver().getValue(elContext, null, "uploadBean");
        return null;
    
    }

    public void createPerson()
    {
        UploadedFile uploadedPicture = getUploadedPicture();
        // Create person with picture;
    }
}
