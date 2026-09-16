package atvRelacionamento.atv1;

public class Consulta {
    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, String horario, Medico medico, Paciente paciente){
        this.data=data;
        this.horario=horario;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void agendarConsulta(){
        System.out.println("Consulta agendada!");
    }

    public void cancelarConsulta(){
        System.out.println("consulta cancelada!");
    }

    public void exibirDados(){
        System.out.println("");
    }
}
