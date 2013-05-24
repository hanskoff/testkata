# Agenda
* Podstawy
* Jukito - http://jukito.arcbees.com/
* gwt-test-utils - https://github.com/gwt-test-utils/gwt-test-utils
* Po��czenie Jukito i GwtTest - @RunWith(JukitoGwtTestRunner.class)
* Modu�y Testowe
* Request Factory
* Edytory i Driver
 
# Podstawy
* SUT - System Under Test
* DOC - Dependend On  Component
* Fixtura - zbudowanie mikro �rodowiska dla SUT- czyli  przygotowanie DOC  
* BDD - Given, When, Then
* nazwy test�w
* Practical Unit Testing - Tomek Kaczanowski
 
# Jukito
http://jukito.arcbees.com/
## Mo�liwo�ci Jukito
* wstrzykiwanie DOC na pola oraz do metod
* resetowanie DOC oraz SUT przed wykonaniem kolejnej metody testowej  - @TestSingleton
* W�asne modu�y Guice

## Konfiguracja Jukito
* @RunWith(JukitoRunner.class) na klasie testu
* klasa wewn�trzna z modu�ami Guice:   public static class A extends JukitoModule
 
## Przyk�ady
* TestApplicationFlowManager
* TestFakePlaceManager
* TestOnPathExitHandler
* TestAddressWidgetPresenter
* TestDocumentToCollectWidgetPresenter

## Uwagi
* Scope @TestSingleton jest u�ywany domy�lnie dla klas. Interfejsy s� bindowane w normalnym Scope

# gwt-test-utils
https://github.com/gwt-test-utils/gwt-test-utils
## Mo�liwo�ci
* brak problemu z GWT.create()
* symulacja przegl�darki (loopend, wype�nienie pola tekstowego, klikanie, ustawianie locale itp)
* generowanie kodu w te�cie (Editors, i18n)
 
## Konfiguracja
* extends GwtTest
* @GwtModule("com.efigence.efinity.gxt.Efinity-web-gxt") na klasie testu
* gwt-test-utils.properties w src/test/resources z deklaracjami modu��w *.gwt.xml
* com.efigence.efinity.gxt.Efinity-web-gxt = gwt-module
 
# Po��czenie Jukito i GwtTest - @RunWith(JukitoGwtTestRunner.class)
## Mo�liwo�ci
* Wstrzykiwanie zale�no�ci jak w czystym Jukito
* Wszystkie dobrodziejstwa gwt-test-utils

## Konfiguracja
* To co typowo dla gwt-test-utils oraz Jukito
zamiast @RunWith(JukitoRunner.class) stosujemy @RunWith(JukitoGwtTestRunner.class) na klasie testu

## Przyk�ady
* TestAddressDataEditor - testy prostego edytora
* TestCancellationTypeEditor - testy na edytor zbudowany jako grupa radio button'ow
* TestComboBoxEditor - testy na edytor Enum lub String'a zbudowany jako comboBox
* TestTwoAddressOneDriver - test bardziej z�o�onego edytora
* TestSecuringTheSecureButton - test akceptacyjny dla konfiguracji uprawnie� w danym wdro�eniu
 

# Request Factory
* Operowanie na projekcjach modelu JPA
* Brak problemu z Lazy Init
* Automatyczne rewrittery
* Automatyczny binding do Edytor�w
* ATP na etapie kompilacji - kontrola kontraktu

# Edytory i Driver
* Abstrakcja i automat do ustawiania modelu i pobierania modelu z formatki
* Graf edytor�w odpowiada grafowi domeny
* Stanowy driver wpisuje modele do edytor�w i po zako�czeniu edycji przez user'a aktualizuje modele

# EDRunner 
# Pu�apki

# Usecases a la WebDriver
## Jako U rejestruje sw�j profil
* Otwieram aplikacj�
* Klikam "rejestruj profil"
* Wype�niam formatk� na ekranie
* Klikam zapisz
* Przegl�dam stron� swojego nowego profilu i oczekuj� �e dane zosta�y zapisane

## Jako U edytuj� sw�j profil
* Klikam "Edytuj profil"
* Zmieniam adres zamieszkania
* Zapisuje zmiany i oczekuj� �e m�j profil zosta� zakutalizowany