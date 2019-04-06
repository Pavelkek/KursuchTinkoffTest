package testSite;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import pages.Page;



public class MainBuyTickets extends BaseBuyTickets {


    @Test
    public void test1() {
        Page buy = new Page(driver);
        if(!driver.getTitle().equals("Welcome: Mercury Tours")){
            MatcherAssert.assertThat("Не та страница", false);
        }
        buy.login("test1","test1");

        if(!driver.getTitle().equals("Find a Flight: Mercury Tours:")){
            MatcherAssert.assertThat("Не та страница", false);
        }
        buy.setDetails();

        if(!driver.getTitle().equals("Select a Flight: Mercury Tours")){
            MatcherAssert.assertThat("Не та страница", false);
        }
        buy.setFlights();

        if(!driver.getTitle().equals("Book a Flight: Mercury Tours")){
            MatcherAssert.assertThat("Не та страница", false);
        }
        buy.setBookFlight("Dasha", "Nyasha",
                          "Pasha", "Molodec",
                          "8464852164867823", "Middle",
                          "ул. Гагарина, 59", "Рязань",
                          "Рязанская область", "390005");

        if(!driver.getTitle().equals("Flight Confirmation: Mercury Tours")){
            MatcherAssert.assertThat("Не та страница", false);
        }
        String departing = buy.getDeparting();
        if (!departing.equals("Paris to Sydney\n" + "4/5/2019 @ 5:03 w/ Blue Skies Airlines 360\n" +
                "First\n" + "$270 each")) {
            MatcherAssert.assertThat("Билет отправления не совпал с ожидаемым", false);
        }

        String returning = buy.getReturning();
        if (!returning.equals("Sydney to Paris\n" + "5/5/2019 @ 12:23 w/ Blue Skies Airlines 630\n" +
                "First\n" + "$270 each")) {
            MatcherAssert.assertThat("Обратный билет не совпал с ожидаемым", false);
        }

        String passengers = buy.getPassengers();
        if (!passengers.equals("2 passengers")) {
            MatcherAssert.assertThat("Число пассажиров не совпало с ожидаемым", false);
        }

        String billedTo = buy.getBilledTo();
        if (!billedTo.equals("Pasha Middle Molodec\n" + "ул. Гагарина, 59\n" + "\n"
                + "Рязань, Рязанская область, 390005\n" +  "AX 0")) {
            MatcherAssert.assertThat("Паспортные данные не совпали с ожидаемыми", false);
        }

        String deliveryAddress = buy.getDeliveryAddress();
        if (!deliveryAddress.equals("ул. Гагарина, 59\n" + "\n"
                + "Рязань, Рязанская область, 390005")) {
            MatcherAssert.assertThat("Адрес доставки не совпал с ожидаемым", false);
        }

        String totalPrice = buy.getTotalPrice();
        if (!totalPrice.equals("$1169 USD")) {
            MatcherAssert.assertThat("Цена не совпала с ожидаемой", false);
        }
    }
}
