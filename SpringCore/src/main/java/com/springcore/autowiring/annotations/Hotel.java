package com.springcore.autowiring.annotations;

public class Hotel {
      private int vadapao;
      private int Misal;
      private int vadasambar;
      private int pohe;
      private int idali;
      private int chaha;
      
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int vadapao, int misal, int vadasambar, int pohe, int idali, int chaha) {
		super();
		this.vadapao = vadapao;
		Misal = misal;
		this.vadasambar = vadasambar;
		this.pohe = pohe;
		this.idali = idali;
		this.chaha = chaha;
	}

	public int getVadapao() {
		return vadapao;
	}

	public void setVadapao(int vadapao) {
		this.vadapao = vadapao;
	}

	public int getMisal() {
		return Misal;
	}

	public void setMisal(int misal) {
		Misal = misal;
	}

	public int getVadasambar() {
		return vadasambar;
	}

	public void setVadasambar(int vadasambar) {
		this.vadasambar = vadasambar;
	}

	public int getPohe() {
		return pohe;
	}

	public void setPohe(int pohe) {
		this.pohe = pohe;
	}

	public int getIdali() {
		return idali;
	}

	public void setIdali(int idali) {
		this.idali = idali;
	}

	public int getChaha() {
		return chaha;
	}

	public void setChaha(int chaha) {
		this.chaha = chaha;
	}

	@Override
	public String toString() {
		return "Items : [vadapao=" + vadapao + ", Misal=" + Misal + ", vadasambar=" + vadasambar + ", pohe=" + pohe
				+ ", idali=" + idali + ", chaha=" + chaha + "]" ;
	}
	
	
      
      
}
