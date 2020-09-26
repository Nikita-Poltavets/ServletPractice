Реализовать веб-приложение, которое принимает GET запросы, и хранит в памяти список уникальных ip адресов, сделавших к нему запрос, и соответствующих значений http-заголовка User-Agent
При запросе выдает html документ с текущим списком ( при этом IP и User-Agent пользователя, сделавшего запрос - выделить жирным текстом - html тег <b></b>)

Пример элемента списка:

127.0.0.1 :: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:71.0) Firefox/71.0

<h1>HOW TO START</h1>

In order to start the application, enter the command in the terminal:
"mvn clean install". Next, in the Maven() window, the application itself
is launched along the next path: "Plugins -> tomcat7 -> tomcat7:run-war".
Then in your browser go to the corresponding path printed in the terminal.
 