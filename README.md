# Проект по автоматизации тестирования интернет-магазина "Клуб ДКС"

---
> Ссылка на  [интернет-магазин ДКС](https://club.dkc.ru/)

<p align="center">
<img width="40%" title="LOGO" src="media/icon/Logo.svg">
<br>

---
## :hammer_and_wrench:  Технологический стек

<p align="center">
<a href="https://www.jetbrains.com/idea/">
<img width="7%" title="IntelliJ IDEA" src="media/icon/Intelij_IDEA.svg">
 </a>

<a href="https://www.java.com/">
<img width="7%" title="Java" src="media/icon/Java.svg">
 </a>

<a href="https://selenide.org/">
<img width="7%" title="Selenide" src="media/icon/Selenide.svg">
</a>

<a href="https://aerokube.com/selenoid/">
<img width="7%" title="Selenoid" src="media/icon/Selenoid.svg">
</a>

<a href="https://qameta.io/">
<img width="7%" title="Allure Report" src="media/icon/Allure_Report.svg">
</a>

<a href="https://gradle.org/">
<img width="7%" title="Gradle" src="media/icon/Gradle.svg">
</a>

<a href="https://junit.org/junit5/">
<img width="7%" title="JUnit5" src="media/icon/JUnit5.svg">
</a>

<a href="https://github.com/">
<img width="7%" title="GitHub" src="media/icon/GitHub.svg">
</a>

<a href="https://www.jenkins.io/">
<img width="7%" title="Jenkins" src="media/icon/Jenkins.svg">
</a>

<a href="https://telegram.org/">
<img width="7%" title="Telegram" src="media/icon/Telegram.svg">
</a>
</p>

Язык: Java 21  
Фреймворки: Selenide, JUnit 5  
Сборка: Gradle 8.x  
Отчетность: Allure Report  
Инфраструктура: Jenkins, Selenoid (Docker)  
Уведомления: Telegram Bot  
Библиотеки: Assertj (агенты)  

---
## :open_file_folder: Инфраструктура проекта
### 1. [Jenkins CI/CD](https://jenkins.autotests.cloud/job/dkc/)
   Настроен Pipeline для сборки проекта и прогона тестов по тегам.
<p align="center">
<img width="80%" title="Jenkins" src="media/images/jenkinsBuild.jpg">
<br>

### 2. [Selenoid (Удаленный запуск браузеров)](https://selenoid.autotests.cloud/#/capabilities/)
   Тесты запускаются в изолированных Docker-контейнерах. Selenoid позволяет наблюдать за выполнением теста в реальном времени.
<p align="center">
<img width="80%" title="Selenoid" src="media/images/selenoid.jpg">
<br>

---
## 📊 Мониторинг и отчетность
### 1. :chart_with_upwards_trend: [Allure Report](https://jenkins.autotests.cloud/job/dkc/allure/)
   Подробные отчеты с шагами выполнения, скриншотами и исходным кодом страницы в случае падения.
<p align="center">  
<img width="80%" title="Allure Report" src="media/images/allureReport.jpg" width="850">  
</p> 

### 2. 🔔 [Уведомления в Telegram](https://t.me/+amlXV4MQZqM5NDRi)  
   После каждой сборки бот присылает краткий отчет со статистикой прохождения тестов.
<p align="center">
<img title="TG Report" src="media/images/tgReport.jpg" height="300">
<br>

### 3. 🎥 Видео выполнения тестов  
Использование Selenoid позволяет не только наблюдать за тестами в реальном времени, но и автоматически записывать видео каждого прогона. Это значительно ускоряет анализ причин падения тестов.
<p align="center">
<video src="media/video/videoReport.mp4" width="950" height="400" controls muted>
</video> 
</p>


<p align="center">
<video src="media/video/vid.mp4" width="950" height="400" controls muted>
</video> 
</p>

<p align="center">
<video src="media/video/vid.gif" width="950" height="400" controls muted>
</video> 
</p>

<p align="center">
<video src="media/video/vidd.mp4" width="950" height="400" controls muted>
</video> 
</p>

<p align="center">
<video src="media/video/vidd.gif" width="950" height="400" controls muted>
</video> 
</p>

---
### 🚀 Запуск автотестов  

Локальный запуск  
```bash
gradle clean test
