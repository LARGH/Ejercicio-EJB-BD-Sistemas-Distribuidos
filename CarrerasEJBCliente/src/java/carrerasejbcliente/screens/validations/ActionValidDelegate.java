package carrerasejbcliente.screens.validations;

/**
 *
 * @author Rafael Landa
 * @param <Form>
 */
public interface ActionValidDelegate<Form>{
    
    public ActionErrors validateForm(Form form);
    
}
