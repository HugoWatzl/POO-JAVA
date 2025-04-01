### Você foi contratado para desenvolver um sistema simples de gerenciamento de contas bancárias. Para isso, deverá criar uma classe chamada ContaBancaria, que represente uma conta de cliente em um banco.Implemente essa classe obedecendo aos seguintes requisitos:

## 1.Abstração:


• A classe deve conter os seguintes atributos: titular (nome do cliente),
numeroConta (número da conta) e saldo (valor disponível).

•Todos os atributos devem ser definidos de forma apropriada para que
representem corretamente as informações de uma conta bancária.

## 2.Encapsulamento:


•Os atributos devem ser privados, e seu acesso deve ser controlado por
meio de métodos get e set, quando necessário.

•O atributo saldo não pode ser alterado diretamente por métodos set,
devendo ser manipulado apenas pelos métodos de operação da conta.

## 3.Métodos obrigatórios:

• depositar(valor): adiciona um valor ao saldo. Não deve permitir valores
negativos.

• sacar(valor): subtrai um valor do saldo. Para cada saque será debitada
também uma taxa de operação no valor de R$ 1,50. O saque só poderá ser
efetuado se houver saldo suficiente para a quantia solicitada mais a taxa da
operação.


• exibirDados(): imprime na tela o nome do titular, número da conta e saldo
atual.