
package datos.interfaces;

import java.util.List;

// prueba, subir archivos
public interface CrudSimpleInterface<T> {
    public List<T> listar(String texto);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean desactivar(int obj);
    public boolean activar(int obj);
    public int total(); // arreglado
    public boolean existe(String texto);
}
