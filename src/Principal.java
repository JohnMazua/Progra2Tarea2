
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario mi_usuario = new Usuario();
		Usuario mi_usuario2 = new Usuario();
		
		mi_usuario.setNombre("Lolo");
		mi_usuario.setPass("secreto");
		mi_usuario.setId(11);
		
		mi_usuario2.setNombre("Lola");
		mi_usuario2.setPass("invalido");
		mi_usuario2.setId(32);		
		
		System.out.println("Usuario: " + mi_usuario.getNombre());
		System.out.println("Password: " + mi_usuario.getPass());
		System.out.println("Id: " + mi_usuario.getId());
		
		System.out.println("Usuario: " + mi_usuario2.getNombre());
		System.out.println("Password: " + mi_usuario2.getPass());
		System.out.println("Id: " + mi_usuario2.getId());
	}

}
