# QATestLab. Lecture №2. Nazarenko Maxim.
В ходе выполнения домашнего задания, в IDE IntelliJ IDEA был создан Maven проект, который использует библиотеки Selenium и Junit для реализации скриптов.

Проект содержит два класса с тестами (LoginToAdminPanelTest.java и MainMenuTest.java) и два вспомогательных класса (ChromeWebDriverSettings.java и Properties.java). В классах с тестами реализованы скрипты А и Б из домашнего задания, 

В классе LoginToAdminPanelTest.java реализовыван скрипт А, который проверяет логин в админ панель. Проверка реализована путем входа и выхода из админ панели. 

В классе MainMenuTest.java реализовыван скрипт Б, который проверяет работоспособность главного меню в админ панели. Проверка реализована путем перехода на страницу каждого пункта меню (без подпунктов из выпадающего меню), проверки на этой странице заголовка и содержимого тега TITLE. Также, реализована проверка, что пользователь остается в том же разделе после перезагрузки страницы.

Класс ChromeWebDriverSettings.java был создан для работы с драйвером браузера Google Chrome.

Класс Properties.java хранит константы (данные для входа в админ панель, ссылки на страницы).
