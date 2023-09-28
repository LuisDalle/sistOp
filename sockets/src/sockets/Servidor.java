package sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Servidor {
	
	public ServerSocket serverSocket;
	
	public void criarServidor(int porta) throws IOException {
		serverSocket = new ServerSocket(porta);
	}
	
	
	public Socket esperaConexao() throws IOException {
	Socket s = serverSocket.accept();
	return s;
	}
	
	public void tratarMensagem(Socket s) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
		
		ObjectInputStream in = new ObjectInputStream(s.getInputStream());
		
		String mensagem = in.readUTF();
		System.out.println("Mensagem recebida !");
		
		String resposta = mensagem.toUpperCase();
		System.out.println("Informação Transformada ");
		
		out.writeUTF(resposta);
		out.flush();
		System.out.println("Cliente respondido");
		
		out.close();
		in.close();
	}
	
	public void fechaSocket(Socket s) throws IOException {
		s.close();
	}

	public static void main(String[]args) {
		Servidor servidor = new Servidor();
		try {
			servidor.criarServidor(5555);
			
			System.out.println("Aguardando conexão ...");
			Socket s = servidor.esperaConexao();
			System.out.println("Mensagem recebida");
			servidor.tratarMensagem(s);
			System.out.println("Mensagem devolvida");
			
			servidor.fechaSocket(s);
			System.out.println("Processo concluído");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
	}
	
}	

