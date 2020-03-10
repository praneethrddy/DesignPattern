package com.epam.builderPattern;

public class Building {
	private Boolean Wall;
	private Boolean Window;
	private Boolean Door;
	private Boolean TotalWindows;
	private Boolean Chimmney;
	private Boolean Garrage;
	private Boolean SwimmingPool;
	
	public Building(Boolean Wall, Boolean Window, Boolean Door){
		this.Wall = Wall;
		this.Window  = Window;
		this.Door = Door;
	}
	
	public Building(Boolean Wall, Boolean Window, Boolean Door,
			Boolean Chimmney, Boolean Garrage, Boolean SwimmingPool){
		this.Wall = Wall;
		this.Window  = Window;
		this.Door = Door;
		this.Chimmney=Chimmney;
		this.Garrage = Garrage;
		this.SwimmingPool = SwimmingPool;
	}
	
	public void detailsOfBuilding() {
		String message ="";
		if(Wall)
		{
			message += "Building has Wall \n";
		}
		if(Door)
		{
			message+= "Building has dooes\n";
		}
		if(Window)
		{
			message += "Building has Window \n";
		}
		if(Chimmney)
		{
			message += "Building has Chimmney \n";
		}
		if(Garrage)
		{
			message += "Building has Garrage \n";
		}
		if(SwimmingPool)
		{
			message+= "Building has swimming Pool ";
		}
		System.out.println(message);
	}

	public Boolean getWalls() {
		return Wall;
	}

	public void setWalls(Boolean Wall) {
		this.Wall = Wall;
	}

	public Boolean getWindows() {
		return Window;
	}

	public void setWindows(Boolean Window) {
		this.Window = Window;
	}

	public Boolean getDoors() {
		return Door;
	}

	public void setDoors(Boolean Door) {
		this.Door = Door;
	}

	public Boolean getWindowsCount() {
		return TotalWindows;
	}

	public void setWindowsCount(Boolean TotalWindows) {
		this.TotalWindows = TotalWindows;
	}

	public Boolean getChimney() {
		return Chimmney;
	}

	public void setChimney(Boolean Chimmney) {
		this.Chimmney = Chimmney;
	}

	public Boolean getGarage() {
		return Garrage;
	}

	public void setGarage(Boolean Garrage) {
		this.Garrage = Garrage;
	}

	public Boolean getSwimmingPool() {
		return SwimmingPool;
	}

	public void setSwimmingPool(Boolean SwimmingPool) {
		this.SwimmingPool = SwimmingPool;
	}
	
	
}
