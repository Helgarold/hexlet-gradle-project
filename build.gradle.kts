plugins {
    // Поддержка запуска из командной строки
    application
}

repositories {
    // Подключаем автоматическую работу с репозиторием Maven Central
    mavenCentral()
}

// Для плагина application указываем главный класс приложения
application {
    // Входная точка
    mainClass.set("io.hexlet.example.App")
}
