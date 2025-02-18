/**
 * 	Cuentas
 *  @author Franco
 *  @version 1.0
 *  
 *  Clase importada del ejercicio
 */
package Cuentas;
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
	/**
	 * getestado
	 * @return saldo
	 */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * ingresar 
     * se le pasa una cantidad y la añade al saldo
     *      * 
     * @param cantidad numero a ingresar
     * @throws Exception 
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * retirar 
     * se le pasa una cantidad y la quita del saldo
     * 
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

	/**
	 * @return the tipoInterés
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés the tipoInterés to set
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
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
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
