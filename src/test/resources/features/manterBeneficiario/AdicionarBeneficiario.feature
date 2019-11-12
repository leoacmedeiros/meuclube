#language: pt
@AdicionarBeneficiario
Funcionalidade: Manter Beneficiario

  Contexto: Autenticar Meu Clube
    Dado que eu acesse o sistema Meu Clube
    Quando informar os dados de logon
      | Usuário | 812.236.091-20 |
      | Senha   |           0000 |
    Então deverá exibir a tela inicial do sistema

  Cenário: Adicionar Beneficiario
    Dado que o usuário acesse o menu afim de adicionar um beneficiario
    Quando preencher o formulario
      | nome completo    | Sônia Antonella Lúcia Silva |
      | vinculo          | Outros                      |
      | cpf              | 072.573.210-51              |
      | data nascimento  | 13/02/1996                  |
      | e-mail           | soniaantonella@teste.com    |
      | telefone celular | (85) 99916-9959             |
    E salvar o beneficiario
    Então será adicionado o novo beneficiario
