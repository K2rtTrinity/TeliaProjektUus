# TeliaProjekt
Projekt sisaldab:
1. person_manager/ – mis on Spring Bootis tehtud bckend (Java 21, Gradle)
2. person_manager_frontend/ – mis on Vue.js frontend
3. docker-compose.yml – mis on fail konteinerite käivitamiseks

Paigaldatud peab olema
1. Docker 
2. Docker Compse
3. Java 21

Käivitamine:
# Projekti salvestamine
1. Navigeri terminalis kausta, kuhu projekti salvestada soovid
2. Pane terminali ´git clone https://github.com/K2rtTrinity/TeliaProjekt´
# Kontrolli, et sul ei jookse midagi portidel 8080 ja 8081
1. Kõiki kasutusel olevaid porte näed käsuga `docker ps`
2. Eraldi porte 8080 ja 8081 näed käskudega `lsof -i :8080` ja `lsof -i :8081`
# Ehitame backend-i 
1. Mine terminalis kausta person_manager: `cd person_manager`
2. Sisesta terminali käsk `./gradlew build` (see tekitab faili personal_manager/build/libs/person_manager-0.0.1-SNAPSHOT.jar)
# Paneme frontendi ja backendi tööle
1. Mine terminalis projekti kausta (kus on omakorda kaustad person_manager, person_manager_frontend ning üks 
2. Sisesta terminali `docker-compose up –build`
# Rakenduse ligipääs
1. Ava brauserist http://localhost:8081/ frontend.
2. Soovi korral ava ka backend brauserist http://localhost:8080/api/persons
# Kui soovid lõpetada
1. Peata konteinerid: `docker-compose down`
