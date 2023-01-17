package chat.conversa;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Vitor
 */
public class Servidor implements Msg {

    public static void main(String[] args) {
        try {
            // cria um objeto para se tornar acessível via rede
            Servidor server = new Servidor();
            String objName = "rmi://localhost/Calc";

            System.out.println("Registrando o objeto no RMIRegistry...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(objName, server);

            System.out.println("Aguardando Clientes!");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

//Métodos da conversa
    

    @Override
    public String entrouNoChat(String nome) throws RemoteException {
        return formatarMensagemEntrouNoChat(nome);
    }

    @Override
    public String saiuDoChat(String nome) throws RemoteException {
        return nome + " Saiu no chat!";
    }

    @Override
    public String formatarMensagemEnviada(String nome, String mensagem) throws RemoteException {
        return nome + ": " + mensagem;
    }

    @Override
    public String formatarMensagemEntrouNoChat(String nome) throws RemoteException {
        return nome + " Entrou no chat!";
    }

    @Override
    public String mensagemCliente(String nome, String msg) throws RemoteException {
        return formatarMensagemEnviada(nome, msg);
    }
}
