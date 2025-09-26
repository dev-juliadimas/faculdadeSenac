# 🚌 Sistema Rodoviário em Java

Este projeto é um sistema simples de venda de passagens rodoviárias desenvolvido em Java. Ele permite ao usuário **escolher o destino, horário da viagem, informar a idade do passageiro** e calcular automaticamente o **desconto aplicável** e o **valor final da passagem**.

---

## 📋 Funcionalidades

1. **Escolha de destino**  
   - Destinos disponíveis com valores pré-definidos:  
     - Florianópolis - R$75,00  
     - Porto Alegre - R$120,00  
     - Curitiba - R$150,00  
     - São Paulo - R$180,00  
     - Rio de Janeiro - R$220,00  
     - Belo Horizonte - R$200,00  

2. **Escolha de horário**  
   - Horários específicos disponíveis para cada destino.  
   - Validação do horário escolhido.

3. **Cálculo de desconto por idade**  
   - Crianças menores de 6 anos: 100% de desconto  
   - Jovens de 6 a 17 anos: 50% de desconto  
   - Idosos acima de 60 anos: 30% de desconto  
   - Demais passageiros: sem desconto  

4. **Exibição do bilhete**  
   - Mostra destino, horário, idade, desconto aplicado e valor final da passagem.  

---

## 💻 Tecnologias utilizadas

- Java 8 ou superior  
- Entrada de dados via `Scanner`  
- Estruturas condicionais (`if`, `else if`, `switch`) para lógica de desconto e horários  
- Manipulação de `String` para validação de horários  