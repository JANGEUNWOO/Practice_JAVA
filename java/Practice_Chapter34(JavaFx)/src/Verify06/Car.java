package Verify06;

import javafx.beans.property.SimpleStringProperty;

public class Car {

	private SimpleStringProperty scar;
	private SimpleStringProperty image;

	public Car() {
		this.scar = new SimpleStringProperty();
		this.image = new SimpleStringProperty();
	}

	public Car(String scar, String image) {
		this.scar = new SimpleStringProperty(scar);
		this.image = new SimpleStringProperty(image);
	}

	public String getScar() {
		return scar.get();
	}

	public void setScar(String scar) {
		this.scar.set(scar);
	}

	public String getImage() {
		return image.get();
	}

	public void setImage(String image) {
		this.image.set(image);;
	}

	
}
