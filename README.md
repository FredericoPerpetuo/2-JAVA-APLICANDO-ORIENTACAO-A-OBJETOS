# Java: Aplicando a Orientação a Objetos — Alura

Exercícios e projetos do curso de orientação a objetos da formação Desenvolvimento Back-End Java da escola Alura. Progressão prática dos pilares da OOP: modelagem com classes, encapsulamento com getters/setters, hierarquia via herança e contratos via interfaces.

## Estrutura do Projeto

```
src/br/com/devfred/
├── secao01/      # Classes, objetos e primeiros métodos
├── secao02/      # Encapsulamento, getters/setters e BigDecimal
├── secao03/      # Herança e polimorfismo
├── secao04/      # Interfaces
└── audiomatch/   # Projeto final consolidando todos os pilares
```

As seções contêm subpacotes `desafioNN/entities/` (e opcionalmente `helpers/` e `interfaces/`) com a entidade modelada e um `Main.java` de uso. O `audiomatch` possui estrutura própria com `entities/`, `utils/` e `principal/`.

## Conteúdo por Seção

### Seção 1 — Classes e Objetos

Primeiros modelos orientados a objetos: criação de classes, atributos, construtores e métodos de comportamento.

| Desafio | Entidade | O que pratica |
|---|---|---|
| 01 | `Pessoa` | Classe mínima com método `saudacao()` |
| 02 | `Calculadora` | Método `dobro(int)` — retorno de valor |
| 03 | `Musica` | Acumulador de avaliações, média e ficha técnica com text block |
| 04 | `Carro` | Cálculo de idade do veículo via `LocalDate`, ficha técnica |
| 05 | `Aluno` | `toString()` customizado com text block |

### Seção 2 — Encapsulamento

Atributos privados, acesso controlado via getters/setters, validações e uso de `BigDecimal` para valores monetários.

| Desafio | Entidade | O que pratica |
|---|---|---|
| 01 | `Conta` + `ContaHelper` | Saldo com `BigDecimal`, depósito e saque com validação, classe auxiliar estática |
| 02 | `IdadePessoa` | Getters/setters, verificação de maioridade |
| 03 | `Produto` | `BigDecimal`, aplicação de desconto percentual |
| 04 | `Aluno` | Três notas com getters/setters e cálculo de média |
| 05 | `Livro` | Getters/setters e `exibirDetalhes()` com text block |

### Seção 3 — Herança

Hierarquias de classes com `extends`, reutilização de comportamento e sobrescrita de métodos.

| Desafio | Hierarquia | O que pratica |
|---|---|---|
| 01 | `Carro` ← `ModeloCarro` | Herança simples, maior e menor preço entre três anos |
| 02 | `Dispositivo` ← `SensorTemperatura`, `CameraSeguranca` | Polimorfismo com `enviarSinal()` |
| 03 | `ContaBancaria` ← `ContaCorrente` | `protected`, herança de operações bancárias, tarifa mensal |
| 04 | `NumerosPrimos` ← `VerificadorPrimo`, `GeradorPrimo` | Herança de lógica de verificação, geração do próximo primo |

### Seção 4 — Interfaces

Definição de contratos com `interface`, múltiplas implementações e separação entre tipo e comportamento.

| Desafio | Interface | Implementações |
|---|---|---|
| 01 | `ConversaoFinanceira` | `ConversorMoeda` — conversão dólar → real |
| 02 | `CalculoGeometrico` | `CalculadoraSalaRetangular` — área e perímetro |
| 03 | `Tabuada` | `TabuadaAdicao`, `TabuadaSubtracao`, `TabuadaMultiplicacao`, `TabuadaDivisao` |
| 04 | `ConversorTemperatura` | `ConversorTemperaturaPadrao` — Celsius ↔ Fahrenheit |
| 05 | `Calculavel` | `ProdutoFisico`, `Livro` — `calcularPrecoFinal()` polimórfico |
| 06 | `Vendavel` | `Produto`, `Servico` — preço por quantidade e desconto |

### Projeto Final — AudioMatch

Simulador de plataforma de streaming que integra todos os conceitos do curso em um único projeto coeso.

**Hierarquia de classes:**

```
Audio (base)
├── Musica   — classificação baseada em reproduções (≥2000 → 10, ≥1000 → 8, demais → 4)
└── Podcast  — classificação baseada em curtidas   (≥500  → 10, ≥300  → 8, demais → 6)
```

**Demais componentes:**

| Classe | Pacote | Responsabilidade |
|---|---|---|
| `Preferidas` | `entities` | Recebe qualquer `Audio` e emite recomendação com base na classificação polimórfica |
| `AudioMatchUtils` | `utils` | Métodos estáticos para simular reproduções e curtidas em lote |
| `Main` | `principal` | Cria músicas (Angra, Nightwish) e podcasts, simula interações e consulta `Preferidas` |

O projeto demonstra na prática: herança (`extends Audio`), polimorfismo (`@Override getClassificacao()`), encapsulamento (atributos privados com getters), e separação de responsabilidades entre entidade, utilitário e ponto de entrada.

## Requisitos

- Java 15+ (uso de text blocks)
- IntelliJ IDEA (projeto configurado com `.iml` e `src` como source root)

## Contexto

Segundo curso da carreira **Desenvolvimento Back-End Java** da Alura. Parte da mesma formação iniciada no curso *Java: Criando sua Primeira Aplicação*, avançando dos fundamentos procedurais para os quatro pilares da orientação a objetos (abstração, encapsulamento, herança e polimorfismo).
