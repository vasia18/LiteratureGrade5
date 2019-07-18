package arkadii.ivanov.literaturegrade5;

class ProductList {

	private int id;
	private String name;
	private int prise;
	private String description;

	//Сонструктор

	public ProductList(int id, String name, int prise, String description) {
		this.id = id;
		this.name = name;
		this.prise = prise;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
