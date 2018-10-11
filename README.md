
# Info

Простой пример реализации ui тестов при помощи стека:

- groovy
- spock framework
- selenide
- zalenium

Для выполнения тестов на хосте необходимо наличие JRE(JDK)

## Запуск тестов

В директории `misc` присутствует `docker-compose.yaml`, который предназначен для запуска zalenium локально.

```bash
docker-compose pull
docker-compose up zalenium
```

После этого в корневой деректории проекта можно выполнить, для старта тестов

```bash
./gradlew test
```