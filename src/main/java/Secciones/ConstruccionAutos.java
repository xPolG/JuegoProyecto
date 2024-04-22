package Secciones;

public class ConstruccionAutos {

    private LineaProduccion primeraLineaProduccion;
    private int cantidadLineasProduccion;

    public ConstruccionAutos(int cantidadLineasProduccion) {
        this.cantidadLineasProduccion = cantidadLineasProduccion;
        this.primeraLineaProduccion = null;
        for (int i = 0; i < cantidadLineasProduccion; i++) {
            agregarLineaProduccion();
        }
    }

    private void agregarLineaProduccion() {
        LineaProduccion nuevaLinea = new LineaProduccion();
        nuevaLinea.setSiguiente(primeraLineaProduccion);
        primeraLineaProduccion = nuevaLinea;
    }

    public void iniciarProduccion(String modelo, String color, int año) {
        LineaProduccion lineaActual = primeraLineaProduccion;
        while (lineaActual != null) {
            if (lineaActual.obtenerAutoEnProduccion() == null) {
                // Si la línea de producción está libre, iniciar la producción del auto
                lineaActual.iniciarProduccion(modelo, color, año);
                System.out.println("Auto creado correctamente en la línea de producción.");
                return;
            }
            lineaActual = lineaActual.getSiguiente();
        }
        // Si todas las líneas de producción están ocupadas
        System.out.println("Todas las líneas de producción están ocupadas. No se pudo crear el auto.");
    }
}
