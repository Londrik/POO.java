🗺️ Mapa Conceitual: Fundamentos de Java

Este guia integra o conteúdo histórico e técnico das primeiras aulas.

1. O que é Java? (Aula 1)

História: Criado pela Sun Microsystems (James Gosling) e hoje mantido pela Oracle.

Filosofia: "Write Once, Run Anywhere" (Escreva uma vez, rode em qualquer lugar).

JVM (Java Virtual Machine): É o que permite a portabilidade, rodando o bytecode.

JDK vs JRE: * JDK: Kit para o desenvolvedor (contém o compilador).

JRE: Ambiente de execução para o usuário final.

2. Ambiente de Desenvolvimento (Aula 2)

IDE Eclipse: Facilita a escrita, organização e depuração do código.

Organização: Workspace (pasta mãe) -> Projects (pastas dos programas).

3. Sintaxe e Regras de Ouro

Tipos de Dados Principais

int: Números inteiros (padrão).

double: Números com casas decimais (padrão).

boolean: Valores lógicos (true/false).

char: Único caractere (16 bits - UTF-16).

String: Sequências de texto (não é primitivo, é uma Classe).

Convenções de Nomenclatura (CamelCase)

Estrutura

Regra

Exemplo

Classes

Primeira letra Maiúscula

ProcessadorDados

Métodos

Primeira minúscula, resto Maiúscula

calcularImposto()

Variáveis

Igual aos métodos

valorTotal

Constantes

Tudo Maiúsculo com _

PI_VALOR

4. Estruturas de Dados Homogêneas (Arrays)

Em Java, arrays são tratados como objetos.

Instanciação: tipo[] nome = new tipo[tamanho];

Vantagem: Possuem o atributo .length, eliminando a necessidade de passar o tamanho manualmente para funções, como ocorre no C.

Este material serve como base para os desafios de Orientação a Objetos que virão a seguir.