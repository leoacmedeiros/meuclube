# language: pt
@AlterarCategoria
Funcionalidade: Manter Categoria Título

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 038.055.191-84 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Efetuar Alteração de Categoria do Título
    Dado que o usuário acesse o menu para alterar a categoria do título
    Quando alterar a categoria do título selecionado
      | titulo         |     335272 |
      | nova categoria | Superior 2 |
    E avançar
    E confirmar a alteração de categoria do título
    Então será criado a solicitação de alteração da categoria do título
