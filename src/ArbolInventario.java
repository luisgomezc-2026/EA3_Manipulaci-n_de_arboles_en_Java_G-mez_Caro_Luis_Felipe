public class ArbolInventario {
    private Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

    public void insertar(int id, String nombre) {
        Producto nuevoProducto = new Producto(id, nombre);

        if (raiz == null) {
            raiz = nuevoProducto;
        } else {
            insertarRecursivo(raiz, nuevoProducto);
        }
    }

    private void insertarRecursivo(Producto actual, Producto nuevo) {
        if (nuevo.getId() < actual.getId()) {

            if (actual.getIzquierdo() == null) {
                actual.setIzquierdo(nuevo);
                return;
            }

            insertarRecursivo(actual.getIzquierdo(), nuevo);

        } else if (nuevo.getId() > actual.getId()) {

            if (actual.getDerecho() == null) {
                actual.setDerecho(nuevo);
                return;
            }

            insertarRecursivo(actual.getDerecho(), nuevo);
        }
    }

    public void inorden() {
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(Producto actual) {
        if (actual != null) {
            inordenRecursivo(actual.getIzquierdo());

            System.out.println(
                "ID: " + actual.getId()
                + " | Nombre: " + actual.getNombre()
            );

            inordenRecursivo(actual.getDerecho());
        }
    }

    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private Producto buscarRecursivo(Producto actual, int id) {
        if (actual == null) {
            return null;
        }

        if (id == actual.getId()) {
            return actual;
        }

        if (id < actual.getId()) {
            return buscarRecursivo(actual.getIzquierdo(), id);
        } else {
            return buscarRecursivo(actual.getDerecho(), id);
        }
    }
}