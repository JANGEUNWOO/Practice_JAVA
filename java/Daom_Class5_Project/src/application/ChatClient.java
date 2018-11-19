package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


//한명의 클라이 언트와 통신하도록 해주는 클라이언트 클래스 입니다
public class ChatClient {
	public Socket socket;
	

	public ChatClient(Socket socket) {
		this.socket = socket;
		receive();
	}
	
	Cm cm2=new Cm();

//반복적으로 클라이언트로 부터 메세지를 받는 메소드입니다
	public void receive() {
		// TODO Auto-generated method stub
		Runnable thread = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while (true) {
						InputStream in = socket.getInputStream();
						byte[] buffer = new byte[512];
						int length = in.read(buffer);
						if (length == -1)
							throw new IOException();
						System.out.println("[메시지 수신 성공]" + socket.getRemoteSocketAddress() + ":"
								+ Thread.currentThread().getName());
						String message = new String(buffer, 0, length, "utf-8");
						for (ChatClient client : cm2.clients) {
							client.send(message);
						}
					}
				} catch (Exception e) {
					try {
						System.out.println("[메시지 수신 오류]" + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName());
						cm2.clients.remove(ChatClient.this);
						socket.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		};
		cm2.threadPool.submit(thread);
	}

//해당 클라이언트에게 메세지를 전송하는 메소드입니다
	public void send(String message) {
		Runnable thread = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					OutputStream out = socket.getOutputStream();
					byte[] buffer = message.getBytes("utf-8");
					out.write(buffer);
					out.flush();
				} catch (Exception e) {
					try {
						System.out.println("[메시지 송신 오류]" + socket.getRemoteSocketAddress() + ":"
								+ Thread.currentThread().getName());
						cm2.clients.remove(ChatClient.class);
						socket.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		};
		cm2.threadPool.submit(thread);

	}
}
