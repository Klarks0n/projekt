Wyszukiwanie tekstu

Spis treści
  1. lista funkcjonalności
  2. instrukcja obsługi
     Wymagania wstępne
     Instalacja
     Uruchamianie aplikacji
     Przykłady użycia
   
1. Lista funkcjonalności
     Przeszukiwanie plików .txt w bieżącym katalogu:
        Aplikacja automatycznie identyfikuje wszystkie pliki z rozszerzeniem .txt w bieżącym katalogu.
     Obsługa wzorców z symbolami wieloznacznymi:
        Wzorzec może zawierać symbol *, który reprezentuje dowolny ciąg znaków (także pusty).
        Wzorzec może zawierać symbol ?, który reprezentuje dokładnie jeden dowolny znak.
     Wyświetlanie wyników dopasowania:
        Program wyświetla nazwę pliku, numer linii oraz fragment tekstu, który spełnia podany wzorzec.
     Czytelny interfejs użytkownika:
        Wygodny i prosty sposób wprowadzania wzorca przez użytkownika za pomocą konsoli.

2. Instrukcja obsługi
     Wymagania wstępne
        Java Development Kit (JDK): Wersja 8 lub wyższa.
        Środowisko uruchomieniowe Java (JRE): Wersja 8 lub wyższa
     Instalacja
        Pobranie JDK:
            Pobierz i zainstaluj JDK z oficjalnej strony Oracle lub zainstaluj OpenJDK z AdoptOpenJDK.
        Konfiguracja zmiennej środowiskowej JAVA_HOME:
            Upewnij się, że zmienna środowiskowa JAVA_HOME jest ustawiona na ścieżkę do zainstalowanego JDK.
     Uruchamianie aplikacji
        Kompilacja programu:
            Otwórz terminal lub wiersz poleceń.
            Przejdź do katalogu, w którym znajduje się plik Main.java.
            Po uruchomieniu programu zostaniesz poproszony o wprowadzenie wzorca do wyszukania. Wprowadź wzorzec i naciśnij Enter.
     Przykłady użycia
            WZORZEC : 'ala' ; Wyszuka wszystkie linie zawierające tekst 'ala' z dowolnym ciągiem znaków.
            WZORZEC : 'ala*kota' ; Wyszuka wszystkie linie zawierające tekst rozpoczynający się od 'ala' i kończący się na 'kota' z dowolnym ciągiem znaków pomiędzy.
            WZORZEC : '?la'; Wyszuka wszystkie linie zawierające tekst, w którym 'la' poprzedzone jest dowolnym jednym znakiem (np. 'ala').
