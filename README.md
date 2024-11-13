## - Trabalho para a faculdade - UFAL 

- Weather Forecasting System: A software with classes for locations, forecasts, and weather data,
providing weather predictions and data analysis.

- Jetpack Compose was used to develop the Android front-end and Sprinboot Java for the back end. I used bff architecture (back for frontend) and connected it to the Openweather API. The project is required to have a Java backend.

## - Weather Forecasting System

• Weather Data Collection: Aggregating weather data from various sources;

• Forecast Generation: Generating short-term and long-term weather forecasts;

• User Location Services: Providing weather updates based on user location;

• Alert System for Severe Weather: Sending alerts for severe weather conditions;

• Historical Weather Data Access: Access to historical weather data and trends;

• Customizable Weather Widgets: Offering customizable widgets for websites and apps;

• Interactive Weather Maps: Displaying interactive maps with weather patterns and forecasts;

• Climate Analytics and Reporting: Providing analytics on climate trends and changes;

• User Feedback and Reporting: Allowing users to report local weather conditions;

• Multi-Language Support: Offering forecasts and information in multiple languages.

# Meu Projeto Spring Boot

Este é um projeto de exemplo usando Spring Boot para construir uma aplicação Java.

## Requisitos

- Java JDK 11 ou superior
- Maven ou Gradle (dependendo da configuração do projeto)
- IDE (como IntelliJ IDEA ou Eclipse)
- Entre no repositório do https://github.com/rinvyssondev/weather-forecasting-mobile e siga as instruções.

## Estrutura do Projeto

O projeto é dividido em módulos:

- `weatherforecasting`: módulo principal da aplicação
- `config`: módulo de configuração
- `controller`: módulo de controle
- `remote.DTO`: módulo de transferência de dados remotos
- `service`: módulo de serviço

## Design Patterns Utilizados

- **Singleton**: Foi utilizado para garantir que certas classes, como a configuração da API do OpenWeather, tenham apenas uma instância durante o ciclo de vida da aplicação. Isso é útil para evitar recriações desnecessárias e garantir que todas as partes da aplicação acessem a mesma configuração.

- **Factory**: Esse padrão foi usado para criar instâncias de diferentes tipos de previsões (curto prazo, longo prazo, etc.) com base em condições específicas, ajudando a desacoplar o código da lógica de criação de objetos. Isso facilita a extensão do sistema para incluir novos tipos de previsão sem modificar o código existente.

- **Builder**: O padrão Builder foi empregado para criar objetos complexos, como objetos de previsão de clima que podem exigir diversos parâmetros e configurações. Com o Builder, o código se torna mais legível e é fácil adicionar novos parâmetros sem modificar a lógica de criação existente.

- **Iterator**: Utilizei o padrão Iterator para permitir a navegação através de coleções de dados de clima, como listas de dados históricos ou de alertas meteorológicos, de maneira uniforme e sem expor a implementação interna das coleções. Isso ajuda a simplificar o código e a manipulação de dados agregados no sistema.

## Configuração do Ambiente

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/rinvyssondev/weather-forecasting.git
   cd weatherforecasting
   ```
2. **Execute o projeto:**
   ```bash
   mvn spring-boot:run 
   ```
3. **Acesse a aplicação:**
   - (http://localhost:8084)
