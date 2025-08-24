package controller;

import java.io.*;

import javax.swing.JOptionPane;

public class DistroController {
	
	public DistroController() {
		super();
	}
	
	private static String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	private final String currentOs = os();
	
	public void exibeDistro() {
		try {
			if (currentOs.contains("Linux")) {
				StringBuffer strBuffer = new StringBuffer();
				
				strBuffer.append("cat").append(" ").append("/etc/os-release");
				Process p = Runtime.getRuntime().exec(strBuffer.toString());

				InputStream inStream = p.getInputStream();
				InputStreamReader streamReader = new InputStreamReader(inStream);
				BufferedReader rdrBuffer = new BufferedReader(streamReader);
				
				String linha = rdrBuffer.readLine();
				
				while (linha != null) {
					if (linha.contains("PRETTY_NAME")) {
						String[] currentLine = linha.split("=");
						System.out.println("A distribuicao linux é: " + currentLine[1]);
					}
					linha = rdrBuffer.readLine();
				}
				
				
			} else {
				JOptionPane.showMessageDialog(null, "Usuário não está em uma distribuição linux. Sistema atual: "
						+ currentOs);
			}
			
		} catch (Exception e) {
			String msg = e.getMessage();
			System.err.println(msg);
			
		}
	}

}
