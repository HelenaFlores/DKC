# Проект по автоматизации тестирования интернет-магазина "Клуб ДКС"

---

> Ссылка на  [интернет-магазин ДКС](https://club.dkc.ru/)

<p align="center">
<img width="40%" title="LOGO" src="src/test/resources/additional_attachments/icon/logo.svg">
<br>

--- 

### :hammer_and_wrench:  Технологический стек

<p align="center">
<img width="8%" title="IntelliJ IDEA" src="src/test/resources/additional_attachments/icon/Intelij_IDEA.svg">
<img width="8%" title="Java" src="src/test/resources/additional_attachments/icon/Java.svg">
<img width="8%" title="Selenide" src="src/test/resources/additional_attachments/icon/Selenide.svg">
<img width="8%" title="Selenoid" src="src/test/resources/additional_attachments/icon/Selenoid.svg">
<img width="8%" title="Allure Report" src="src/test/resources/additional_attachments/icon/Allure_Report.svg">
<img width="8%" title="Gradle" src="src/test/resources/additional_attachments/icon/Gradle.svg">
<img width="8%" title="JUnit5" src="src/test/resources/additional_attachments/icon/JUnit5.svg">
<img width="8%" title="GitHub" src="src/test/resources/additional_attachments/icon/GitHub.svg">
<img width="8%" title="Jenkins" src="src/test/resources/additional_attachments/icon/Jenkins.svg">
<img width="8%" title="Telegram" src="src/test/resources/additional_attachments/icon/Telegram.svg">
</p>

Язык: Java 21  
Фреймворки: Selenide, JUnit 5  
Сборка: Gradle 8.x  
Отчетность: Allure Report  
Инфраструктура: Jenkins, Selenoid (Docker)  
Уведомления: Telegram Bot  
Библиотеки: Assertj (агенты)  

---
### :open_file_folder: Инфраструктура проекта
1. Jenkins CI/CD
   Настроен Pipeline для сборки проекта и прогона тестов по тегам.
<p align="center">
<img width="80%" title="Jenkins" src="src/test/resources/additional_attachments/icon/jenkinsBuild.jpg">
<br>

2. Selenoid (Удаленный запуск браузеров)
   Тесты запускаются в изолированных Docker-контейнерах. Selenoid позволяет наблюдать за выполнением теста в реальном времени.
<p align="center">
<img width="80%" title="Selenoid" src="src/test/resources/additional_attachments/icon/selenoid.jpg">
<br>

---
### 📊 Мониторинг и отчетность

1. Allure Report  
   Подробные отчеты с шагами выполнения, скриншотами и исходным кодом страницы в случае падения.
<p align="center">  
<img width="80%" title="Allure Report" src="src/test/resources/additional_attachments/icon/allureReport.jpg" width="850">  
</p> 

2. 🔔 Уведомления в Telegram  
   После каждой сборки бот присылает краткий отчет со статистикой прохождения тестов.
<p align="center">
<img width="45%" title="TG Report" src="src/test/resources/additional_attachments/icon/tgReport.jpg">
<br>

---
### 🎥 Видео выполнения тестов  
Использование Selenoid позволяет не только наблюдать за тестами в реальном времени, но и автоматически записывать видео каждого прогона. Это значительно ускоряет анализ причин падения тестов.
<p align="center">
<img width="45%" title="Video Report" src="additional_attachments/images/files/videoReport.gif" width="550" height="350"  alt="video">
</p>

<p align="center">
  <video src="https://github.com/HelenaFlores/DKC/blob/main/src/test/resources/additional_attachments/images/files/videoReport.gif" width="550" height="350" controls muted>
  </video>
</p>
---

### 🚀 Запуск автотестов  

Локальный запуск  
```bash
gradle clean test
