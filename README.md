# Gerenciamento de Encomendas de Placas

Mini Mundo

João confecciona placas por encomenda. Como o volume dos pedidos tem aumentado, ele
pediu para você fazer uma pequena aplicação que controle:
- o cadastro de seus clientes
- as encomendas

Quando ele recebe uma encomenda, João anota num caderninho o nome do cliente e seu
telefone.

Para a encomenda, ele registra: o tamanho da placa (altura e largura), a frase a ser
escrita, cor da placa (branca ou cinza), cor da frase (azul, vermelho, amarelo, preto ou
verde), data de entrega, valor do serviço e valor do sinal.

A aplicação deve obrigar que o valor do sinal seja de, no mínimo, 50%.
Para calcular o valor da placa, as seguintes fórmulas são usadas:

área = altura x largura
custo_material = área x R$ 147,30
custo_desenho = número letras x R$ 0,32
valor_placa = custo material + custo_desenho

Para calcular o prazo de entrega, considera-se que ele só consegue produzir seis placas
por dia.

João deseja que o sistema controle os pedidos, calcule o preço fnal das peças e o prazo de
entrega.

Deve ter uma tela para visualizar as placas que já foram produzidas e outra tela para
visualizar as placas que estão por ser produzidas com o seu valor fnal.
