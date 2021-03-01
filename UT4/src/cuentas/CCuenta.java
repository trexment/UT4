/**
 * Paquete donde guardamos los ficheros
 */
package cuentas;

/**
 * 
 * @author Fran Núñez
 */
public class CCuenta {

  
/**
 * @param nombre Cadena donde almacenamos el nombre del cliente
 * @param cuenta Cadena para almacenar el noombre de la cuenta
 * @param saldo variable donde metemos la cantidad de la cuenta
 * @param tipoInteres donde almacenaremos el tipo de interes que tiene la cuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    
    public CCuenta()
    {
    }

    /**
     * Constructor que se crea mediante parametros
     * @param nom variable nombre
     * @param cue variable nombre cuenta
     * @param sal variable para el saldo
     * @param tipo variable para tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
      /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInterés() {
        return tipoInteres;
    }

    /**
     * @param tipoInterés the tipoInteres to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInteres = tipoInterés;
    }


    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar dinero en la cuenta, en caso de error
     * lanza una excepción
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero, por parametro le pasamos la cantidad
     * a retirar y si da error lanza una excepción
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
