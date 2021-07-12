# comeia-desafio
Desafio parcialmente concluido, vou descrevar a baixo os endPoints para o consumo da API.

Foi construido as principais fuções da entidade cliente e da entidade conta.

EndPoints do controller Cliente

localhost:8080/cliente/add - passando como parametros um objeto do tipo Cliente
localhost:8080/cliente/listar - Para listar todos os registros
localhost:8080/cliente/deletar{id} - Passando como parametro o ID do cliente, efetua a exclusão da conta
localhost:8080/cliente/atualizar - Passando como parametro um objeto do tipo Cliente com ID do mesmo cliente
localhost:8080/cliente/data-cadastro{id} - Passando o id do cliente, retorna a data de cadastro do cliente

EndPoints do controller Conta

localhost:8080/conta/add - Passando como parametro um objeto do tipo Conta
localhost:8080/conta/contas - Retorna todas as contas cadastradas
localhost:8080/conta/deletar{id} - Passando como parametro o id da conta, efetua a exclusão da conta
localhost:8080/conta/conta{id} - Passando como parametro o id da conta, retorna a conta especifica
localhost:8080/conta/saldo{id} - Retorna somente o saldo da conta do ID informado
localhost:8080/conta/saldo-total{idTitular} - Informando o id do cliente, retorna a soma do saldo de todas as contas do cliente



O arquivo do banco de dados é o *comeia.sql*
