package listaInterface.ex7;

public class Usuario implements ExportavelCSV{
    private String nome_do_usuario;
    private String email_do_usuario;

    public Usuario(String nome_do_usuario, String email_do_usuario) {
        this.nome_do_usuario = nome_do_usuario;
        this.email_do_usuario = email_do_usuario;
    }

    public String getNome_do_usuario() {
        return nome_do_usuario;
    }

    public String getEmail_do_usuario() {
        return email_do_usuario;
    }

    @Override
    public String toCSV(){
        return getNome_do_usuario() + ";" + getEmail_do_usuario();
    }
}
