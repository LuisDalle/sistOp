package sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	
	public static void main(String[] args) {
		
		String host = "localhost";
		int porta = 5555;
		
		try {
			//	estabelece a conexão entre cliente e servidor
			Socket s = new Socket(host, porta);
			
			//	objeto responsavel por envio das relações
			ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
			
			//	objeto responsavel pelo recebimento das respostas
			ObjectInputStream in = new ObjectInputStream(s.getInputStream());
			
			//	enviando a mensagem para o servidor
			System.out.println("enviando a mensagem para o servidor");
			String mensagem = "Olá";
			out.writeUTF(mensagem);
			out.flush();
			
			//	receber a resposta tratada do servidor
			String resultado = in.readUTF();
			System.out.println("Resposta: "+resultado);
			System.out.println("Fim da solicitação deste cliente");
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
