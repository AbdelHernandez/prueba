package com.personas.prueba.model;
@Entity

public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;

    private String estado;
    private String numeroInterior;
    private String direccion;
    private String telefono;

    // Constructor vacío requerido por JPA
    public Domicilio() {}

    // Constructor con parámetros
    public Domicilio(String calle, String estado, String numeroInterior, String direccion, String telefono) {
        this.calle = calle;
        this.estado = estado;
        this.numeroInterior = numeroInterior;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters para cada atributo
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getNumeroInterior() { return numeroInterior; }
    public void setNumeroInterior(String numeroInterior) { this.numeroInterior = numeroInterior; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    // Método toString() (opcional)
    @Override
    public String toString() {
        return "Domicilio{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", estado='" + estado + '\'' +
                ", numeroInterior='" + numeroInterior + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}