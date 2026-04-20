## 📌 Sobre a API utilizada
Este projeto utiliza a [Dog API](https://dog.ceo/dog-api/documentation/), uma API pública e gratuita amplamente utilizada para testes e aprendizado em automação de APIs, que fornece imagens de cães organizadas por raça.

### Endpoints testados:

- /breeds/list/all -> Lista todas as raças disponíveis
- /breed/{breed}/images -> Retorna imagens de uma raça específica
- /breeds/image/random -> Retorna uma imagem aleatória de cachorro

---

## Pré-requisitos

Para executar este projeto localmente, é necessário ter instalado:

- **Java 17**
- **Maven 3+**

Certifique-se de que as variáveis de ambiente `JAVA_HOME` e `MAVEN_HOME` estejam configuradas corretamente.

---

## Executando os testes localmente

Para executar os testes localmente, navegue até o seguinte arquivo:

`src/test/java/functional/AcceptanceTest.java`

Em seguida, execute a classe `AcceptanceTest.java`. Você pode fazer isso diretamente pela sua IDE, clicando com o botão direito na classe e selecionando "Run".

Também é possível executar os testes via linha de comando utilizando Maven:

```bash
mvn -B test -Dtest=org.dog.com.acceptance.AcceptanceTest
```

## Tecnologias utilizadas

- **Java 17**
- **RestAssured**
- **TestNG**
- **Maven**