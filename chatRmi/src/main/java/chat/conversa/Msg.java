/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chat.conversa;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Vitor
 */
public interface Msg extends Remote{
    //Metodos
    public String entrouNoChat(String nome) throws RemoteException;
    public String saiuDoChat(String nome) throws RemoteException;
    public String formatarMensagemEnviada(String nome, String mensagem) throws RemoteException;
    public String formatarMensagemEntrouNoChat(String nome) throws RemoteException;
    public String mensagemCliente(String nome, String msg) throws RemoteException;
}
