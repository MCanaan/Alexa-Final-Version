# Alexa-Final-Version
Alexa Skill to translate fast while reading

Dieser Alexa-Skill ist der Perfekte Skill für diejenigen, die beim
Lesen eines fremdsprachigen Buches Wörter übersetzen und verstehen möchten,
nichtsdestotrotz die Lese-Konzentration nicht verlieren wollen.

Der Skill bietet einen Übersetzer in Zwei Sprachen an, von Englisch nach Deutsch
und von Deutsch nach Englisch.

Quickstart:

Wenn Sie das Projekt zum ersten Mal importieren, können Sie
müssen Bibliotheken von Drittanbietern konfigurieren (alexa-skillskit)

- Klicken Sie dazu mit der rechten Maustaste auf Ihren Projektordner in
Eclipse und gehen Sie zu Maven > Projekt aktualisieren...


- Um die .war-Datei zu erstellen, klicken Sie mit der rechten Maustaste auf Ihre
Projekt in Eclipse und gehen Sie zu

Ausführen als > Maven installieren

1)für Diesen Skill benutzen wir apache-tomcat for Web server und Ngrok um ein HTTPS zu bekommen.


2)Wir Benutzen eine Lokale Datenbank für die Speicherung von wörtern
	//create connection

        	con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/alexa.db");

Es wird ein Ordner sqlite  in C: benötigt mit  weiterm Ordner db dadrin.
Sie können das entsprechend ändern wo Sie das speichern wollen.


3)•Tomcat download, unzip 

• put your .war file in the “webapps” folder

to start: ./startup.sh

to stop: ./shutdown.sh

• check http://localhost:8080/ if tomcat is working


4)Architecture – SSL Tunnel (Ngrok)

1. ngrok herunterladen/entpacken

2. Geben Sie auf der Konsole in diesem Ordner ./ngrok http 8080 (8080-Port des localhost) ein.

3. Fügen Sie die HTTPS, die Sie erhalten, zu Ihrem Alexa Skill Endpoint hinzu. 

Example:https://1ae317b7.ngrok.io/myskill/myrequest



