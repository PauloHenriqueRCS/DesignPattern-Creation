package TesteOP;

import FilesOP.Funcionario;
import FilesOP.FuncionarioPool;
import FilesOP.Pool;

public class TestaFuncionarioPool {

	public static void main(String[] args) {
		
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.acquire();
		while (funcionario != null) {
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.acquire();
		}
	}

}
