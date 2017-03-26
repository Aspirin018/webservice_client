package webservice_server;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class WeatherClient {
	public static void main(String[] args) {
		WeatherInterfaceImplService service = new WeatherInterfaceImplService();
		WeatherInterfaceImpl portType  = service.getWeatherInterfaceImplPort();
		String weatherInfo = portType.getWeatherByCity("北京");
		System.out.println(weatherInfo);
	}

}
