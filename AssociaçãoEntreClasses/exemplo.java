package AssociaçãoEntreClasses;

 
public class exemplo {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", "Desenvolvedor");
        Funcionario funcionario2 = new Funcionario("Maria", "Gerente");
        Funcionario funcionario3 = new Funcionario("Pedro", "Analista");
        Funcionario funcionario4 = new Funcionario("Ana", "Designer");
 
        Departamento departamentoTI = new Departamento("TI");
        departamentoTI.adicionarFuncionario(funcionario1);
        departamentoTI.adicionarFuncionario(funcionario2);
 
        Departamento departamentoRH = new Departamento("Recursos Humanos");
        departamentoRH.adicionarFuncionario(funcionario3);
        departamentoRH.adicionarFuncionario(funcionario4);
 
        Empresa empresa = new Empresa("Minha Empresa");
        empresa.adicionarDepartamento(departamentoTI);
        empresa.adicionarDepartamento(departamentoRH);
 
        empresa.mostrarInformacoes();
    }
}
class Empresa {
    private String nome;
    private Departamento[] departamentos;
    private int numDepartamentos;
 
    public Empresa(String nome) {
        this.nome = nome;
        this.departamentos = new Departamento[10];
        this.numDepartamentos = 0;
    }
 
    public void adicionarDepartamento(Departamento departamento) {
        departamentos[numDepartamentos] = departamento;
        numDepartamentos++;
    }
 
    public void mostrarInformacoes() {
        System.out.println("Empresa: " + nome +"\n");
        for (int i = 0; i < numDepartamentos; i++) {
            departamentos[i].mostrarInformacoes();
        }
    }
}
 
class Departamento {
    private String nome;
    private Funcionario[] funcionarios;
    private int numFuncionarios;
 
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new Funcionario[10];
        this.numFuncionarios = 0;
    }
 
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios[numFuncionarios] = funcionario;
        numFuncionarios++;
    }
 
    public void mostrarInformacoes() {
        System.out.println("Departamento: " + nome);
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println(funcionarios[i].getNome() + " - " + funcionarios[i].getCargo());
        }
        System.out.println();
    }
}
 
class Funcionario {
    private String nome;
    private String cargo;
 
 
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
 
    public String getNome() {
        return nome;
    }
 
    public String getCargo() {
        return cargo;
    }
}
