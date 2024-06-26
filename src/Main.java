import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        ArrayList<Banco> listaBancos = new ArrayList<Banco>();

        while (true) {
            System.out.println(">> DADOS BANCARIOS");

            Banco bc = new Banco();

            System.out.println("- Nome Banco:");
            bc.setRazao(sc.nextLine());
            System.out.println("- Numero Banco:");
            bc.setIdBancario(sc.nextInt());
            sc.nextLine();

            listaBancos.add(bc);

            Cliente cl = new Cliente();

            System.out.println(">> DADOS DE CLIENTE ");
            System.out.println("- cpf: ");
            cl.setCpf(sc.nextLine());
            System.out.println("- nome: ");
            cl.setNome(sc.nextLine());
            System.out.println("- telefone: ");
            cl.settelefone(sc.nextLine());

            listaCliente.add(cl);

            System.out.println(" ");
            System.out.println(">>>> Lista de Bancos ");
            System.out.println(listaBancos.toString());

            System.out.println(">>>> Lista de Clientes ");
            System.out.println(listaCliente.toString());

        }
    }
}