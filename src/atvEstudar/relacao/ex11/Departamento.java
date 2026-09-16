package atvEstudar.relacao.ex11;

import java.util.List;
import java.util.ArrayList;

public class Departamento {
    private String nomeDepartamento;
    private List<Funcionario> funcionarios;

    public Departamento(String nomeDepartamento){
        this.nomeDepartamento=nomeDepartamento;
        this.funcionarios= new ArrayList<>();
    }

    public void alocarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
}
