
public class Usuario {
	private String nombre;
	private String pass;
	private int id;
	
	Usuario()
	{
		System.out.println("Constructor del usuario");
		nombre= "anonimo";
		pass = "";
		id = 0;
	}
	
	
	
	
	void setPass(String pass)
	{
		this.pass = pass;
	}
	
	void setNombre(String nombre)
	{
			this.nombre = nombre;
	}
	
	void setId(int id)
	{
		this.id = id;
	}
	
	String getPass()
	{
		return pass;
	}
	
	String getNombre()
	{
		return nombre;
	}
	
	int getId()
	{
		return id;
	}
	
	void setAttributes(String nombre, String pass, int id)
	{
		setNombre(nombre);
		setPass(pass);
		setId(id);
	}
	
}
