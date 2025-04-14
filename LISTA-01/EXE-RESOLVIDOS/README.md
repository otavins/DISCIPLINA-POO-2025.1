## Questão 01.
Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.

Solução:
###### ALGORITMO
###### DECLARE n1, n2, n3, n4, soma NUMÉRICO
###### LEIA n1, n2, n3, n4
###### soma ← n1 + n2 + n3 + n4
###### ESCREVA soma
###### FIM_ALGORITMO.

## Questão 02. 
Faça um programa que receba três notas, calcule e mostre a média aritmética.

##### 1a solução:
###### ALGORITMO
###### DECLARE nota1, nota2, nota3, media NUMÉRICO
###### LEIA nota1, nota2, nota3
###### media ← (nota1 + nota2 + nota3)/3
###### ESCREVA media
###### FIM_ALGORITMO.

##### 2a solução:
###### ALGORITMO
###### DECLARE nota1, nota2, nota3, soma, media NUMÉRICO
###### LEIA nota1, nota2, nota3
###### soma ← nota1 + nota2 + nota3
###### media ← soma/3
###### ESCREVA media
###### FIM_ALGORITMO.




## Questão 03. 
Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.

##### 1a solução:
###### ALGORITMO
###### DECLARE nota1, nota2, nota3, peso1, peso2, peso3, media NUMÉRICO
###### LEIA nota1, nota2, nota3, peso1, peso2, peso3
###### media← (nota1*peso1+ nota2*peso2+ nota3*peso3)/(peso1+ peso2+ peso3)
###### ESCREVA media
###### FIM_ALGORITMO.

##### 2a solução:
###### ALGORITMO

###### DECLARE nota1, nota2, nota3, peso1, peso2, peso3 NUMÉRICO

###### soma1, soma2, soma3, total, media NUMÉRICO

###### LEIA nota1, nota2, nota3, peso1, peso2, peso3

###### soma1 ← nota1 * peso1

###### soma2 ← nota2 * peso2
###### soma3 ← nota3 * peso3
###### total ← peso1 + peso2 + peso3
###### media ←(soma1 + soma2 + soma3)/total
###### ESCREVA media
###### FIM_ALGORITMO.


## Questão 04.
Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se
que este sofreu um aumento de 25%.
1a solução:
###### ALGORITMO
###### DECLARE sal, novosal NUMÉRICO
###### LEIA sal
###### novosal ← sal + sal * 25/100
###### ESCREVA novosal
###### FIM_ALGORITMO.
2a solução:
###### ALGORITMO
###### DECLARE sal, aumento, novosal NUMÉRICO
###### LEIA sal
###### aumento ← sal * 25/100
###### novosal ← sal + aumento
###### ESCREVA novosal
###### FIM_ALGORITMO.


## Questão 05.
Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre
o valor do aumento e o novo salário.
Solução:
###### ALGORITMO
###### DECLARE sal, perc, aumento, novosal NUMÉRICO
###### LEIA sal, perc
###### aumento ← sal * perc/100
###### ESCREVA aumento
###### novosal ← sal + aumento
###### ESCREVA novosal
###### FIM_ALGORITMO.


## Questão 06.
Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,

sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% tam-
bém sobre o salário base.

Solução:
###### ALGORITMO
###### DECLARE sal, salreceber, grat, imp NUMÉRICO
###### LEIA sal
###### grat ← sal * 5/100
###### imp ← sal * 7/100
###### salreceber ← sal + grat − imp
###### ESCREVA salreceber
###### FIM_ALGORITMO.


## Questão 07.
Faça um programa que receba o salário base de um funcionário, calcule e mostre seu salário a receber,
sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base.
Solução:
###### ALGORITMO
###### DECLARE sal, salreceber, imp NUMÉRICO
###### LEIA sal
###### imp ← sal * 10/100
###### salreceber ← sal + 50 − imp
###### ESCREVA salreceber
###### FIM_ALGORITMO.


## Questão 08.
Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e mostre o
valor do rendimento e o valor total depois do rendimento.
Solução:
###### ALGORITMO
###### DECLARE dep, taxa, rend, total NUMÉRICO
###### LEIA dep, taxa
###### rend ← dep * taxa/100
###### total ← dep + rend
###### ESCREVA rend
###### ESCREVA total
###### FIM_ALGORITMO.


## Questão 09.
Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base * altura)/2.

Solução:
###### ALGORITMO
###### DECLARE base, altura, area NUMÉRICO
###### LEIA base, altura
###### area ← (base * altura)/2
###### ESCREVA area
###### FIM_ALGORITMO.

## Questão 10.
Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: Área = p * R2


Solução:
###### ALGORITMO
###### DECLARE area, raio NUMÉRICO
###### LEIA raio
###### area ← 3.1415 * raio2
###### ESCREVA area
###### FIM_ALGORITMO.

