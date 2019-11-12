#language: pt
@AdicionarFormaPagamento
Funcionalidade: Manter Forma de Pagamento

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Adicionar nova forma de pagamento
    Dado que o usuário acesse o menu para cadastrar uma nova forma de pagamento
    Quando informar o novo tipo de pagamento
      | tipo pagamento | Débito              |
      | banco          | SANTANDER           |
      | agencia        |                0816 |
      | conta          | 01015052-9          |
      | numero cartao  | 5159.2501.7884.8908 |
      | validade mes   |                  02 |
      | validade ano   |                2021 |
    E salvar
    Então será adicionado a nova forma de pagamento
