📦 POO3: Organização de Código - Serviços e Estruturas de Dados

Este documento técnico apresenta a análise arquitetural sobre a transição do paradigma procedural para o estruturado/orientado a objetos em Java, focando na modularização por meio de métodos, separação de responsabilidades (classes de serviço) e criação de tipos complexos (classes de dados).

1. Modularização por Meio de Métodos

No ecossistema Java, as sub-rotinas (conhecidas no C como funções e procedimentos) são chamadas de Métodos.

Propósito de Engenharia: Reduzir o tempo de manutenção corretiva, adaptativa e evolutiva através do reuso de blocos lógicos.

Assinatura do Método: É composta pelo nome do método e sua lista de parâmetros/argumentos.

Métodos Estáticos (static): Métodos que pertencem à classe, e não a uma instância específica. Podem ser invocados diretamente através do nome da classe (ex: NomeClasse.metodo()).

2. Mecanismos de Passagem de Parâmetros

O gerenciamento de memória do Java impacta diretamente como os dados são transmitidos para os métodos:

Tipos Primitivos (Passagem por Cópia de Valor): O Java aloca um novo espaço de memória e duplica o valor lógico. Alterações dentro do escopo do método não afetam a variável original.

Objetos e Arrays (Passagem por Cópia de Referência): O Java duplica o endereço de memória que aponta para o objeto original. Alterações nos atributos internos ou nos índices de um array dentro do método refletem diretamente no objeto original. Nota: Não há aritmética de ponteiros disponível, diferenciando-se da passagem por referência pura do C/C++.

3. Divisão de Responsabilidades e Sobrecarga

Acoplamento e Coesão: A arquitetura de software orientada a objetos dita que métodos devem ser altamente coesos (fazer apenas uma coisa muito bem feita). Métodos complexos devem ser decompostos em métodos menores de baixa complexidade (princípio de Dividir para Conquistar).

Sobrecarga de Métodos (Overloading): Capacidade de definir múltiplos métodos com o mesmo identificador (nome) na mesma classe, desde que suas assinaturas (quantidade ou tipo de parâmetros) sejam distintas.

4. Classes de Serviço vs. Classes de Dados

Classes de Serviço: Classes especialistas em fornecer comportamentos e algoritmos (ex: uma classe MatematicaUtil ou LeitorTeclado). Geralmente contêm apenas métodos utilitários estáticos.

Classes de Dados (Entidades): Estruturas que representam entidades de negócio heterogêneas (equivalentes às structs da linguagem C). Contêm variáveis de instância (atributos) para armazenar estados (ex: a entidade Aluno contendo nome, matrícula e nota).

5. Gerenciamento de Memória de Objetos e Arrays de Referência

A alocação de objetos em Java é explicitada pelo operador new.

Declaração: Aluno al; cria apenas uma referência nula na pilha de execução (Stack).

Instanciação: al = new Aluno(); aloca espaço físico na memória dinâmica (Heap) e associa este endereço à referência.

NullPointerException: Ocorre quando tenta-se acessar atributos ou métodos a partir de uma referência que aponta para null (área não alocada).

Arrays de Objetos: A instrução Aluno[] turma = new Aluno[3]; cria um array contendo 3 referências nulas. É obrigatório instanciar cada posição do vetor individualmente antes de manipular seus dados (ex: turma[0] = new Aluno();), sob pena de disparo de exceção em tempo de execução.