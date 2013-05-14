package system;

import java.util.List;
import java.util.Map;

import exceptions.ProcessoException;

public class Data {
	
	private Map<Integer, Processo> processoPerNumber;
	private Map<Integer, Processo> processoPerCDANumber;
	private List<Processo> processList;

	
	public void createProcess(Integer processoNumber, Integer  cdaNumber, String claimer,
			String claimed, Integer assessment, Integer box) {
		Processo newProcesso = new Processo(processoNumber, cdaNumber, 
				claimer, claimed, assessment, box);
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
	
	
}
