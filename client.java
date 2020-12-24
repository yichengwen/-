package model;

import java.io.*;
import java.net.UnknownHostException;
import java.net.Socket;

public class client implements MyProtocal {
	ObjectOutputStream oos;
	ObjectInputStream ois;

	public client() throws UnknownHostException, IOException {
		Socket s = new Socket("10.51.158.244", 12312);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}

	public boolean login(String name, String pw,int num) throws IOException {
		oos.writeInt(LOGIN);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		oos.writeInt(num);
		oos.flush();
		boolean result = ois.readBoolean();
		return result;

	}

	public String register(String name, String pw) throws IOException {
		oos.writeInt(REGISTER);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		String result = ois.readUTF();
		return result;

	}

}
