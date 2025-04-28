package br.dev.weslei.model;

import br.dev.weslei.gui.TelaConversor;

public class Temperatura {
	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	public double converterParaFahreinheit() {
		double fahreinheit = (celsius * 9/5) + 32;
		return fahreinheit;
	}

}
