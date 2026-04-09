
package datos.interfaces;

import java.util.List;


public interface CrudSimpleInterface<T> {
    public List<T> listar(String texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean desactivar(T obj);
    public boolean activar(T obj);
    public boolean total();
    public boolean existe(String texto);
}
