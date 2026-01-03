package tienda;

/**
 * Representa a un cliente dentro del sistema de la tienda.
 * Esta clase ha sido refactorizada para proteger sus datos mediante encapsulamiento.
 */
public class Cliente {
    private String nombre;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


