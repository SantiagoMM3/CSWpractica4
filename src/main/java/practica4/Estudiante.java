package practica4;

import java.util.Arrays;

public class Estudiante {

	private String nombre;
	private String apellidos;
	private int fechaNacimiento;
	private int curso;
	private String[] asignaturasPendientes;
	
	public Estudiante(String nombre, String apellidos, int fechaNacimiento, int curso, String[] asignaturasPendientes) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
		this.asignaturasPendientes = asignaturasPendientes;
	}
	
	// OTROS METODOS
	public String getNombreCompleto() {
		return this.getNombre() + " " + this.getApellidos();
	}
	
	public int calcularEdad() {
		return 2022 - this.fechaNacimiento;
	}
		
	public void avanzarCurso() {
		this.curso++;
	}
	
	public int cursosParaFinalizar() {
		return 4 - this.curso + 1;
	}

	public int getNumeroAsignaturasPendientes() {
		return this.asignaturasPendientes.length;
	}
	
	
	// GETTER AND SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String[] getAsignaturasPendientes() {
		return asignaturasPendientes;
	}

	public void setAsignaturasPendientes(String[] asignaturasPendientes) {
		this.asignaturasPendientes = asignaturasPendientes;
	}

	public int getCurso() {
		return this.curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
}
