## 1. Faça um programa contendo uma sub-rotina que retorne 1 se o número digitado for positivo ou 0 se for negativo.

Solução:
#### ALGORITMO

#### DECLARE num, x NUMÉRICO

#### LEIA num

#### x ← verifica(num)

#### SE x = 0

#### ENTÃO ESCREVA “Número positivo”

#### SENÃO ESCREVA “Número negativo”

#### FIM_ALGORITMO.

#### SUB-ROTINA verifica(num NUMÉRICO)

#### DECLARE res NUMÉRICO

#### SE num >= 0

#### ENTÃO res ← 1

#### SENÃO res ← 0

#### RETORNE res

#### FIM_SUB_ROTINA verifica


## 2. Faça um programa contendo uma sub-rotina que receba dois números positivos por parâmetro e re-
torne a soma dos N números inteiros existentes entre eles.

Solução:
#### ALGORITMO

#### DECLARE num1, num2, s NUMÉRICO

#### LEIA num1, num2

#### s ← somar(num1, num2)

#### ESCREVA “soma = “, s

#### FIM_ALGORITMO.

#### SUB-ROTINA somar(num1, num2 NUMÉRICO)

#### DECLARE i, s NUMÉRICO

#### s ← 0

#### PARA i ← num1+1 ATÉ num2-1 FAÇA

#### INÍCIO

#### s ← s + i

#### FIM

#### RETORNE s

#### FIM_SUB_ROTINA somar


## 3. Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior
que 1. A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e c) e retornar o resultado para ser impresso.

Solução:
#### ALGORITMO

#### DECLARE a, b, c, result NUMÉRICO

#### REPITA

#### LEIA a

#### ATÉ a>1

#### LEIA b,c

#### result ← divisores(a, b, c)

#### ESCREVA “Soma dos inteiros = “, result

#### FIM_ALGORITMO.

#### SUB-ROTINA divisores(a, b, c NUMÉRICO)

#### DECLARE i, s, r NUMÉRICO

#### s ← 0

#### PARA i ← b ATÉ c FAÇA

#### INÍCIO

#### r ← RESTO (i / a)

#### SE r = 0

#### ENTÃO s ← s + i

#### FIM

#### RETORNE s

#### FIM_SUB_ROTINA divisores


## 4. Faça uma sub-rotina que receba um único valor representando segundos. Essa sub-rotina deverá con-
vertê-lo para horas, minutos e segundos. Todas as variáveis devem ser passadas como parâmetro, não havendo variáveis globais.

Solução:
#### ALGORITMO

#### DECLARE seg NUMÉRICO

#### LEIA seg

#### transformacao(seg);

#### FIM_ALGORITMO.

#### SUB-ROTINA transformacao(segundos NUMÉRICO)

#### DECLARE h, m, s, r NUMÉRICO

#### h ← segundos / 3600

#### r ← RESTO(segundos / 3600)

#### m ← r / 60

#### s = RESTO(r / 60)

#### ESCREVA h, m, s

#### FIM_SUB_ROTINA transformacao


## 5. Crie um programa que receba os valores antigo e atual de um produto. Chame uma sub-rotina que
determine o percentual de acréscimo entre esses valores. O resultado deverá ser mostrado no programa principal.

Solução:
#### ALGORITMO

#### DECLARE precoantigo, precoatual, acrescimo NUMÉRICO

#### LEIA precoantigo

#### LEIA precoatual

#### acrescimo ← calculo_reajuste(precoantigo, precoatual)

#### ESCREVA acrescimo

#### FIM_ALGORITMO.

#### SUB-ROTINA calculo_reajuste(PA, PN NUMÉRICO)

#### DECLARE result NUMÉRICO

#### result ← (100 * PN – 100 * PA) / PA

#### RETORNE result

#### FIM_SUB_ROTINA calculo_reajuste


## 6. Faça uma sub-rotina que receba como parâmetro um inteiro no intervalo de 1 a 9 e mostre a seguinte
tabela de multiplicação (no exemplo, n = 9):


1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
6 12 18 24 30 36
7 14 21 28 35 42 49
8 16 24 32 40 48 56 64
9 18 27 36 45 54 63 72 81


Solução: 
#### ALGORITMO

#### DECLARE num NUMÉRICO

#### REPITA

#### LEIA num

#### ATÉ (num >= 1) E (num <= 9)

#### multiplicacao(num)

#### FIM_ALGORITMO.

#### SUB-ROTINA multiplicacao(n NUMÉRICO)

#### DECLARE i, j NUMÉRICO

#### PARA i ← 1 ATÉ n FAÇA

#### INÍCIO

#### PARA j ← 1 ATÉ i FAÇA

#### INÍCIO

#### ESCREVA i * j

#### FIM

#### FIM

#### FIM_SUB_ROTINA multiplicacao


## 7. Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâme-
tros e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se
for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida
ao programa principal para, então, ser mostrada.

Solução:
#### ALGORITMO

DECLARE nota1, nota2, nota3, m NUMÉRICO

letra LITERAL

LEIA nota1

LEIA nota2

LEIA nota3

REPITA

LEIA letra

ATÉ (letra = “A”) OU (letra = “P”)

m ← calcula_media(nota1, nota2, nota3, letra)

SE letra = “A”

ENTÃO ESCREVA “A média aritmética “ , m

SENÃO ESCREVA “A média ponderada “, m

FIM_ALGORITMO.

SUB-ROTINA calcula_media(n1, n2, n3 NUMÉRICO, l LITERAL)

DECLARE media NUMÉRICO

SE l = “A”

ENTÃO media ← (n1+n2+n3)/3

SENÃO media ←(n1*5+n2*3+n3*2)/(5+3+2)

RETORNE media

FIM_SUB_ROTINA calcula_media


## 8. Crie uma sub-rotina que receba como parâmetro a hora de início e a hora de término de um jogo,
ambas subdivididas em dois valores distintos: horas e minutos. A sub-rotina deverá retornar a duração
expressa em minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que
ele pode começar em um dia e terminar no outro.

Solução:
ALGORITMO

DECLARE hora_i, min_i, hora_f, min_f, minutos NUMÉRICO

LEIA hora_i, min_i

LEIA hora_f, min_f

minutos ← calculo(hora_i, min_i, hora_f, min_f)

ESCREVA minutos

FIM_ALGORITMO.

SUB-ROTINA calculo(h_i, m_i, h_f, m_f NUMÉRICO)

DECLARE tot_h, tot_m, total NUMÉRICO

SE m_f < m_i

ENTÃO INÍCIO

m_f ← m_f + 60

h_f ← h_f - 1

FIM

SE h_f < h_i

ENTÃO INÍCIO

h_f ← h_f + 24

FIM

tot_m ← m_f - m_i

tot_h ← h_f - h_i

total ← tot_h * 60 + tot_m

RETORNE total

FIM_SUB_ROTINA calculo


## 9. Faça uma sub-rotina que leia cinco valores inteiros, determine e mostre o maior e o menor deles.

Solução:
ALGORITMO

maior_menor;

FIM_ALGORITMO.

SUB-ROTINA maior_menor

DECLARE i, num, maior, menor NUMÉRICO

PARA i ← 1 ATÉ 5 FAÇA

INÍCIO

ESCREVA “Digite o “, i, “o número: “

LEIA num

SE i = 1

ENTÃO INÍCIO

maior ← num

menor ← num

FIM

SENÃO INÍCIO

SE num > maior

ENTÃO maior ← num

SE num < menor

ENTÃO menor ← num

FIM

FIM

ESCREVA “O maior número digitado foi: “,maior

ESCREVA “O menor número digitado foi: “,menor

FIM_SUB_ROTINA maior_menor


## 10. Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo N e retorne o valor de S,
obtido pelo seguinte cálculo:

S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!

Solução:
ALGORITMO

DECLARE num, s NUMÉRICO

LEIA num

s ← sequencia(num)

ESCREVA s

FIM_ALGORITMO.

SUB-ROTINA sequencia(n NUMÉRICO)

DECLARE a, b, f, seq NUMÉRICO

seq ← 1

PARA a ← 1 ATÉ n FAÇA

INÍCIO

f ← 1

PARA b ← 1 ATÉ a FAÇA

INÍCIO

f ← f * b

FIM

seq ← seq + 1 / f

FIM

RETORNE seq

FIM_SUB_ROTINA sequencia


