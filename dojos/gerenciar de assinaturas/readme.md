### Você foi contratado para desenvolver um sistema simples de gerenciamento de planos de assinatura de streaming de músicas. Para isso, deverá criar uma classe chamada PlanoAssinatura, que represente um plano disponível para clientes desse streaming.Implemente essa classe obedecendo aos seguintes requisitos: 

## 1.Abstração:

• A classe deve conter os seguintes atributos: nome do plano, limite de quantidade de assinantes possíveis para o plano, quantidade total de assinantes do plano e valor daassinatura do plano.

• Todos os atributos devem ser definidos de forma apropriada para que representem
corretamente as informações de um plano.\


## 2.Encapsulamento:

•Os atributos devem ser privados, e seu acesso deve ser controlado por meio de métodos get, quando necessário.

•Os atributos da classe não poderão ser alterados diretamente por métodos set,
devendo ser manipulados apenas pelos métodos obrigatórios do plano.

## 3.Métodos obrigatórios:
• adicionarAssinante(): adiciona um assinante na quantidade total de assinantes do
plano. Não deve permitir adicionar assinantes acima do limite de quantidade de
assinantes possíveis para o plano.

• ofertarDesconto(desconto): subtrai o desconto do valor do plano. Não pode ser possível definir descontos acima de 50% do valor do plano. O desconto não é dado em
porcentagem.

• xibirDados(): imprime na tela o nome do plano, quantidade de assinantes e valor do plano.