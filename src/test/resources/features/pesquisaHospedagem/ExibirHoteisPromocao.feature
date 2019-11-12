#language: pt
@ExibirHoteisPromocao
Funcionalidade: Visualizar Hotéis com Promoção

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Listar Hotéis com Promoção
    Dado que eu realize uma pesquisa
      | cidade/uf | CALDAS NOVAS |
    Quando refinar a busca por hóteis que estejam com Promoção
    Então serão exibidos hóteis que possuem promoção ativa
