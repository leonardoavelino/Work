package system;


public class Processo {
	
	private Integer processoNumber;
	private Integer cdaNumber;
	private String claimer;
	private String claimed;
	private Integer assessment;
	private Integer box;
	

	public Processo (Integer number1, Integer number2, 
			String name1, String name2, Integer number3, Integer number4) {
		number1 = processoNumber;
		number2 = cdaNumber;
		number3 = assessment;
		number4 = box;
		name1 = claimer;
		name2 = claimed;
	}

	public Integer getProcessoNumber() {
		return processoNumber;
	}

	public void setProcessoNumber(Integer processoNumber) {
		this.processoNumber = processoNumber;
	}

	public Integer getCdaNumber() {
		return cdaNumber;
	}

	public void setCdaNumber(Integer cdaNumber) {
		this.cdaNumber = cdaNumber;
	}

	public String getClaimer() {
		return claimer;
	}

	public void setClaimer(String claimer) {
		this.claimer = claimer;
	}

	public String getClaimed() {
		return claimed;
	}

	public void setClaimed(String claimed) {
		this.claimed = claimed;
	}

	public Integer getAssessment() {
		return assessment;
	}

	public void setAssessment(Integer assessment) {
		this.assessment = assessment;
	}

	public Integer getBox() {
		return box;
	}
	
	public void setBox(Integer box) {
		this.box = box;
	}

}
