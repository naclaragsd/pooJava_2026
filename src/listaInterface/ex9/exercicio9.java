package listaInterface.ex9;

/*
Sem a interfece ia ter que refazer o codigo todo, porque o e-commerce estaria
chamando direto os metodos da classe PagSeguroGateway, e não de uma interfece.
todas as variaveis seriam do tipo PagSeguroGateway e todas as chamadas usariam
os metodos do PagSeguro, com os nomes e parametros dele. Para trocar pelo MercadoPago
seria preciso encontrar cada um desses lugares no sistema, alterar um por um e
testar tudo de novo, tendo risco de esquecer algum e quebrar o pagamento

tendo uma interface GatewayDePagamento o e-commerce conhece só o contrato, e nao
a empresa, PagSeguroGateway e MercadoPagoGateway implementam os mesmos metodos da
interface, entao o resto do sistema não precisa saber qual dos dois está sendo usado,
para trocar só precisa mudar uma linha

 GatewayDePagamento gateway = new PagSeguroGateway();
 vira:
 GatewayDePagamento gateway = new MercadoPagoGateway();

 todo o resto do codigo continua igual, isso é desacoplamento, o sistema depende
 do contrato, e não de uma classe especifica

 */
public class exercicio9 {
}
