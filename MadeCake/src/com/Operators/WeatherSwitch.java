package com.Operators;

public class WeatherSwitch {

    public static void main(String[] args) {

        String supraWeather = "Snowing";
        System.out.println("Supra, weather forecast & today it is: " + supraWeather);

        switch (supraWeather) {
            case "Sunny":
                System.out.println("Suns out, Supras out!");
                break;
            case "Overcast":
                System.out.println("Great day for detailing");
                break;
            case "Raining":
                System.out.println("Typical, always on a show day!");
                break;
            case "Snowing":
                System.out.println("Free Skids :D");
                break;
            case "Clear Skies":
                System.out.println("I can see for miles!");
                break;
            default:
                System.out.println("Apocalypse");
                break;
        }
    }

    public String weatherInfo(int weather)
    {

        return null;
    }
}
