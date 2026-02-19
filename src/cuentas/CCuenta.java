package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    /**
    * Nombre del titular de la cuenta.
    */
    private String nombre;
    /**
    * Número de cuenta bancaria.
    */
    private String cuenta;
    /**
    * Saldo actual de la cuenta.
    */
    private double saldo;
    /**
    * Tipo de interés aplicado.
    */
    private double tipoInteres;

    /** Constructor por defecto. */ 
    public CCuenta() {
    }

    /**
    * Constructor con parámetros para inicializar la cuenta.
    * @param nom nombre del titular
    * @param cue número de cuenta
    * @param sal saldo inicial
    * @param tipo tipo de interés
    */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres = tipo;
    }

    /**
    * Modifica el nombre del titular.
    * @param nombre nuevo nombre del titular
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * Modifica el número de cuenta.
    * @param cuenta nuevo número de cuenta
    */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Modifica el saldo.
    * @param saldo nuevo saldo
    */ 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
    * Modifica el tipo de interés.
    * @param tipoInteres nuevo tipo de interés
    */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    /**
    * Devuelve el nombre del titular.
    * @return nombre del titular
    */
    public String getNombre() {
        return nombre;
    }
    /**
    * Devuelve el número de cuenta.
    * @return número de cuenta
    */    
    public String getCuenta() {
        return cuenta;
    }
    /**
    * Devuelve el saldo.
    * @return saldo actual
    */
    public double getSaldo() {
        return saldo;
    }
    /**
    * Devuelve el tipo de interés.
    * @return tipo de interés
    */    
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
    * Devuelve el saldo actual de la cuenta.
    * @return saldo disponible
    */
    public double estado() {
        return saldo;
    }

    /**
    * Ingresa una cantidad en la cuenta.
    * @param cantidad cantidad a ingresar
    * @throws Exception si la cantidad es negativa
    */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
    * Retira una cantidad de la cuenta.
    * @param cantidad cantidad a retirar
    * @throws Exception si la cantidad es negativa o no hay saldo suficiente
    */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
