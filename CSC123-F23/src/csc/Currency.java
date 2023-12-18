package csc;

public class Currency {
	//fields
	private String  CurrencyCode;
	private String  Description;
	private double  ConversionRate;
	
	//constructor
	public Currency(String cc, String d, double cr) {
		super();
		this.CurrencyCode = cc;
		this.Description = d;
		this.ConversionRate = cr;
	}

	public String getCountryCode() {
		return CurrencyCode;
	}

	public void setCountryCode(String countryCode) {
		CurrencyCode = countryCode;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getConversionRate() {
		return ConversionRate;
	}

	public void setConversionRate(double conversionRate) {
		ConversionRate = conversionRate;
	}
	
	public String toString() {
		return "Currency [CountryCode=" + CurrencyCode + ", Description=" + Description + ", ConversionRate="
				+ ConversionRate + "]";
	}

}
