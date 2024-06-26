# Wyszukiwanie tekstu

Program  do przeszukiwania plików tekstowych w poszukiwaniu wzorca.

## Spis treści

1. Lista funkcjonalności
2. Instrukcja obsługi
   1. Wymagania wstępne
   2. Instalacja
   3. Uruchamianie aplikacji
   4. Przykłady użycia
   
## Lista funkcjonalności

### Przeszukiwanie plików .txt w bieżącym katalogu:

Aplikacja automatycznie identyfikuje wszystkie pliki z rozszerzeniem .txt w bieżącym katalogu.

### Obsługa wzorców z symbolami wieloznacznymi:

* _Wzorzec może zawierać symbol *, który reprezentuje dowolny ciąg znaków (także pusty)._

* _Wzorzec może zawierać symbol ?, który reprezentuje dokładnie jeden dowolny znak._

### Wyświetlanie wyników dopasowania:

Program wyświetla nazwę pliku, numer linii oraz fragment tekstu, który spełnia podany wzorzec.

### Czytelny interfejs użytkownika:

Wygodny i prosty sposób wprowadzania wzorca przez użytkownika za pomocą konsoli.

## Instrukcja obsługi

### Wymagania wstępne

* Java Development Kit (JDK): Wersja 8 lub wyższa.

* Środowisko uruchomieniowe Java (JRE): Wersja 8 lub wyższa

### Instalacja

#### Pobranie JDK:

Pobierz i zainstaluj JDK z oficjalnej strony Oracle lub zainstaluj OpenJDK z AdoptOpenJDK.

#### Konfiguracja zmiennej środowiskowej JAVA_HOME:

Upewnij się, że zmienna środowiskowa JAVA_HOME jest ustawiona na ścieżkę do zainstalowanego JDK.

### Uruchamianie aplikacji

#### Kompilacja programu:

* Otwórz terminal lub wiersz poleceń.

* Przejdź do katalogu, w którym znajduje się plik Main.java.

* Po uruchomieniu programu zostaniesz poproszony o wprowadzenie wzorca do wyszukania. Wprowadź wzorzec i naciśnij Enter.

#### Przykłady użycia

WZORZEC : **'ala'** ; _Wyszuka wszystkie linie zawierające tekst 'ala' z dowolnym ciągiem znaków._

WZORZEC : **'ala*kota'** ; _Wyszuka wszystkie linie zawierające tekst rozpoczynający się od 'ala' i kończący się na 'kota' z dowolnym ciągiem znaków pomiędzy._

WZORZEC : **'?la'**; _Wyszuka wszystkie linie zawierające tekst, w którym 'la' poprzedzone jest dowolnym jednym znakiem (np. 'ala')._

https://github.com/Klarks0n/projekt.git
