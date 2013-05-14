package system;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exceptions.ProcessoException;

public class Data {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String FILE_NAME = "dados.dat";
	private Map<Integer, Processo> processoPerNumber;
	private Map<Integer, Processo> processoPerCDANumber;
	private List<Processo> processList;
	private static Data data;

	private Data() {
		processoPerNumber = new HashMap<Integer, Processo>();
		processoPerCDANumber = new HashMap<Integer, Processo>();
		processList = new ArrayList<Processo>();
	}

	public static Data getInstance() {
		if (data == null) {
			try {
				data = loadData();
			} catch (IOException e) {
				data = new Data();
			}
		}
		return data;
	}

	public void createProcess(Integer processoNumber, Integer cdaNumber,
			String claimer, String claimed, Integer assessment, Integer box) {
		Processo newProcesso = new Processo(processoNumber, cdaNumber, claimer,
				claimed, assessment, box);
		processList.add(newProcesso);
		processoPerNumber.put(processoNumber, newProcesso);
		processoPerCDANumber.put(cdaNumber, newProcesso);
	}

	public Processo getProcess(Integer number) throws ProcessoException {
		return search(number);
	}

	private Processo search(Integer number) throws ProcessoException {
		if (processoPerNumber.containsKey(number)) {
			return getProcessoPerNumber().get(number);
		} else {
			throw new ProcessoException("O Processo Não Existe");
		}
	}

	public Map<Integer, Processo> getProcessoPerNumber() {
		return processoPerNumber;
	}

	public Map<Integer, Processo> getProcessoPerCDANumber() {
		return processoPerCDANumber;
	}

	private static void saveToFile() throws IOException {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(FILE_NAME)));
			out.writeObject(data);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	public static void saveData() throws IOException {
		saveToFile();
	}

	public static Data loadData() throws IOException {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream(FILE_NAME)));
			return (Data) in.readObject();
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (in != null) {
				in.close();
			}
		}
		return null;
	}

}
