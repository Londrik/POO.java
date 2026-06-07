 // --- ATIVIDADE 5: TESTE DA CLASSE MYMATH ---
        System.out.println("\n[Atividade 5] Testes Matemáticos (MyMath):");
        System.out.print("Digite um número para testar fatorial, paridade e primalidade: ");
        int numeroTeste = leitor.nextInt();
        System.out.println("Fatorial: " + MyMath.fatorial(numeroTeste));
        System.out.println("É maior que 10? Maior número entre ele e 10 é: " + MyMath.retornarMaior(numeroTeste, 10));
        System.out.println("É par? " + MyMath.isPar(numeroTeste));
        System.out.println("É primo? " + MyMath.isPrimo(numeroTeste));
