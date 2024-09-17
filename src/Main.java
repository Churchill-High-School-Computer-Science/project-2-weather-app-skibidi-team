public class Main {
    public static void main(String[] args) {

        WeatherAPI apiWeather = new WeatherAPI();

        GUI gooey = new GUI(apiWeather);

        gooey.createWindow();
        gooey.setUpButton();
        gooey.cyanBackground();

        
        


    }
}
