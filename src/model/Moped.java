package model;

/**
 * @author Angela Ward
 *
 */
public class Moped {
	private String color;
	private String model;
	private String vin;

	public Moped() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	/**
	 * @return String describing noise vehicle makes
	 */
	public String makeNoise() {
		return "Beep Beep!";
	}
}
