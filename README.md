# Strategy- DesignerPattern

Sistema de escolha do método de pagamento. 

- extensível e não precisa ser modificado diretamente para incluir novas formas de pagamento.

- controle feito de forma dinâmica, com base na escolha do usuário.

- O sistema permite a escolha do método de pagamento sem utilizar estruturas condicionais como if-else ou switch (diminuindo a complexidade ciclomatica).

- Utilização de enum para fornecer encapsulamento e organização.

- Manutenivel  design com o (Open/Closed Principle - OCP) do SOLID, permitindo a adição de novos comportamentos sem alterar o código existente.


