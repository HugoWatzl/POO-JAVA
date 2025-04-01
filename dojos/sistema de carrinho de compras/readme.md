Você está desenvolvendo um sistema de carrinho de compras para um e-commerce e foi
encarregado de implementar a classe que representa um produto adicionado ao
carrinho. Para isso, deverá criar uma classe chamada ItemProduto, que conterá todas as
informações e operações relacionadas a um item do carrinho.
Implemente essa classe obedecendo aos seguintes requisitos:
1.Abstração:
•A classe deve conter os seguintes atributos: nome do produto, quantidade comprada,preço
unitário, subtotal (calculado automaticamente com base na quantidade × preço unitário).
•Todos os atributos devem ser definidos de forma apropriada para que representem
corretamente as informações de uma vaga.
2.Encapsulamento:
•Os atributos devem ser privados, e seu acesso deve ser controlado por meio de métodos
get, quando necessário.
•O valor do subtotal não deve ser alterado diretamente, apenas calculado internamente
com base nas alterações de quantidade e preço.
3.Métodos obrigatórios:
•atualizarQuantidade(novaQuantidade): atualiza a quantidade do produto. Não permite
valores menores que 1. Sempre que a quantidade for alterada, o subtotal deve ser
atualizado automaticamente.
•atualizarPreco(novoPreco): atualiza o preço unitário do produto. Não permite valores
negativos ou zero. O subtotal também deve ser recalculado automaticamente.
•exibirInformacoes(): imprime o nome do produto, quantidade, preço unitário e subtotal.
