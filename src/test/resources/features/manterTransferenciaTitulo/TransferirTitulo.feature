#language: pt
@TransferirTitulo
Funcionalidade: Manter Transferência de Título

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 038.055.191-84 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Efetuar transferencia de Título
    Dado que o usuário acesse o menu para transferir títulos
    Quando selecionar o título que deseja transferir
      | titulo | 335272 |
    E informar os dados para quem quer transferir
      | tipo pessoa      | Pessoa Física   |
      | cpf/cnpj         | 005.838.141-40  |
      | nome             | Pessoa          |
      | orgao expedidor  | SSP             |
      | rg               |       2.415.425 |
      | data nascimento  | 19/01/1990      |
      | sexo             | Masculino       |
      | estado civil     | Casado          |
      | telefone celular | (61)99537-2000  |
      | telefone         | (61)3625-1067   |
      | email            | teste@teste.com |
      | cep              | 77060-318       |
      | complemento      | Casa            |
      | naturalidade     | Brasília        |
      | uf               | DF              |
    E informar os dados para pagamento
      | tipo pagamento | Cartão de Crédito   |
      | banco          | SANTANDER           |
      | agencia        |                0816 |
      | conta          | 01015052-9          |
      | numero cartao  | 5159.2501.7884.8908 |
      | validade mes   |                  02 |
      | validade ano   |                2021 |
      | dia debito     |                  20 |
    E inserir observações
      | observações | Observações da automação |
    E avançar
    E confirmar Transferência de título
    Então será criado o termo para Transferir o título
