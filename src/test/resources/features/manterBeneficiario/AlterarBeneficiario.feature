#language: pt
@EditarBeneficiario
Funcionalidade: Manter Beneficiario

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Editar Beneficiario
    Dado que o usuário acesse o menu afim de alterar um beneficiario
    Quando alterar o beneficiário
      | beneficiario | Sônia Antonella Lúcia Silva |
    E editar os dados
      | nome completo    | Sônia Antonella Lúcia Silva |
      | vinculo          | Outros                      |
      | cpf              | 072.573.210-51              |
      | data nascimento  | 13/02/1996                  |
      | e-mail           | soniaantonella@teste.com    |
      | telefone celular | (11) 99916-9959             |
    E salvar o beneficiario
    Então será editado os dados beneficiario
