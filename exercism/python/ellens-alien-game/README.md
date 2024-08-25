# Jogo Alienígena da Ellen

Bem-vindo ao Jogo Alienígena da Ellen na Trilha de Python do Exercism.
Se você precisar de ajuda para rodar os testes ou enviar seu código, consulte `HELP.md`.
Se ficar preso no exercício, consulte `HINTS.md`, mas tente resolvê-lo sem usar essas dicas primeiro :)

## Introdução

## Programação Orientada a Objetos em Python

Se você tem programado em um estilo [funcional][functional], [declarativo][declarative], ou [imperativo][imperative], mudar o foco para [programação orientada a objetos][oop] (OOP) pode parecer um pouco estranho.
Uma abordagem OOP pede ao programador para pensar em modelar um problema como um ou mais `objetos` que interagem entre si, mantêm estado e atuam sobre dados.
Os objetos podem representar entidades do mundo real (_como carros ou gatos_) - ou conceitos mais abstratos (_como inteiros, veículos ou mamíferos_).
Cada objeto se torna uma instância única na memória do computador e representa alguma parte do modelo geral.

## Classes

`Classes` são as definições de novos tipos de objetos, a partir das quais novas `instâncias` de objetos são criadas.
Elas geralmente agrupam dados com código ou funções que operam sobre esses dados.
Nesse sentido, classes são _modelos_ ou conjuntos de instruções a partir dos quais muitos objetos de um tipo similar podem ser construídos e usados.
Um programa complexo pode ter muitas classes, cada uma construindo muitos tipos diferentes de objetos.
O processo de construir um objeto a partir de uma classe é conhecido como `instanciação` (_ou criar uma instância da classe_).

Uma definição de classe em Python é simples:

```python
class MyClass:
    # Corpo da classe vai aqui
```

### Atributos de Classe

Campos de classe (_também conhecidos como `propriedades`, `atributos`, `membros de dados` ou `variáveis`_) podem ser adicionados ao corpo da classe:

```python
class MyClass:
    number = 5
    string = "Hello!"
```

Uma instância (_objeto_) de `MyClass` pode ser criada e vinculada a um nome chamando a classe (_da mesma forma que uma função é chamada_):

```python
>>> new_object = MyClass()

# A classe é instanciada e o objeto resultante é vinculado ao nome "new_object".
# Nota: o endereço do objeto 'at 0x15adc55b0' variará de acordo com o computador.
>>> new_object
<__main__.MyClass at 0x15adc55b0>
```

Os `atributos de classe` são compartilhados entre todos os objetos (_ou instâncias_) criados a partir de uma classe, e podem ser acessados via [`notação de ponto`][dot notation] - um `.` colocado após o nome do objeto e antes do nome do atributo:

```python
>>> new_object = MyClass()

# Acessando o atributo de classe "number" via notação de ponto.
>>> new_object.number
5

# Acessando o atributo de classe "string" via notação de ponto.
>>> new_object.string
'Hello!'

# Instanciando um objeto adicional e vinculando-o ao nome "second_new_object".
>>> second_new_object = MyClass()

>>> second_new_object
# Nota: o endereço do objeto "at 0x15ad99970" variará de acordo com o computador.
<__main__.MyClass at 0x15ad99970>

# "Second_new_object" compartilha os mesmos atributos de classe que "new_object".
>>> new_object.number == second_new_object.number
True
```

Os atributos de classe são definidos no corpo da própria classe, antes de quaisquer outros métodos.
Eles pertencem à classe, permitindo que sejam compartilhados entre instâncias da classe.
Como esses atributos são compartilhados, seu valor pode ser acessado e manipulado diretamente pela classe.
Alterar o valor dos atributos de classe altera o valor _**para todos os objetos instanciados a partir da classe**_:

```python
>>> obj_one = MyClass()
>>> obj_two = MyClass()

# Acessando um atributo de classe a partir de um objeto.
>>> obj_two.number
5

# Acessando o atributo de classe diretamente a partir da classe.
>>> MyClass.number
5

# Modificando o valor do atributo de classe "number".
>>> MyClass.number = 27

# Modificar o atributo de classe "number" altera o atributo "number" para todos os objetos.
>>> obj_one.number
27

>>> obj_two.number
27
```

Ter um monte de objetos com dados sincronizados o tempo todo não é particularmente útil.
Felizmente, objetos criados a partir de uma classe podem ser personalizados com seus próprios `atributos de instância` (_ou propriedades de instância, variáveis ou campos_).
Como o nome sugere, os atributos de instância são únicos para cada objeto e podem ser modificados de forma independente.

## Customizando a Instanciação de Objetos com `__init__()`

O método especial ["dunder"][dunder] (_abreviação de "double underscore method"_) `__init__()` é usado para personalizar as instâncias da classe e pode ser utilizado para inicializar atributos ou propriedades de instância dos objetos.
Por seu papel na inicialização de atributos de instância, `__init__()` também é conhecido como `construtor de classe` ou `inicializador`.
O `__init__()` leva um parâmetro obrigatório chamado `self`, que se refere ao objeto recém-inicializado ou criado.
Os dados para os atributos ou propriedades de instância podem então ser passados como argumentos para o `__init__()`, seguindo o parâmetro `self`.

Abaixo, `MyClass` agora tem atributos de instância chamados `location_x` e `location_y`.
Como você pode ver, os dois atributos foram atribuídos aos primeiros e segundos índices do argumento `location` (_uma tupla_) que foi passado para `__init__()`.
Os atributos `location_x` e `location_y` para uma instância de classe agora serão inicializados quando você instanciar a classe e um objeto for criado:

```python
class MyClass:
    # Estes são atributos, variáveis ou campos de classe.
    number = 5
    string = "Hello!"

    # Este é o "construtor" da classe, com um parâmetro "location" que é uma tupla.
    def __init__(self, location):

        # Este é um atributo, propriedade ou variável de instância ou objeto.
        # Note que estamos desempacotando o argumento da tupla em duas variáveis de instância separadas.
        self.location_x = location[0]
        self.location_y = location[1]

# Crie um novo objeto "new_object_one", com a propriedade do objeto (1, 2).
>>> new_object_one = MyClass((1, 2))

# Crie um segundo novo objeto "new_object_two" com a propriedade do objeto (-8, -9).
>>> new_object_two = MyClass((-8, -9))

# Note que new_object_one.location_x e new_object_two.location_x têm valores diferentes.
>>> new_object_one.location_x
1

>>> new_object_two.location_x
-8
```

Note que você só precisa passar um argumento ao inicializar `MyClass` acima - o Python cuida de passar `self` quando a classe é chamada.

## Métodos

Um `método` é uma `função` que está vinculada à própria classe (_conhecida como [método de classe][class method], que será discutida em um exercício posterior_) ou a uma _instância_ da classe (objeto).
Os métodos que operam em um objeto (instância) precisam ser definidos com `self` como o primeiro parâmetro.
Você pode então definir o restante dos parâmetros como faria para uma função "normal" ou não vinculada:

```python
class MyClass:
    number = 5
    string = "Hello!"

    # Construtor da classe.
    def __init__(self, location):
        # Propriedades de instância
        self.location_x = location[0]
        self.location_y = location[1]

    # Método de instância. Note "self" como primeiro parâmetro.
    def change_location(self, amount):
        self.location_x += amount
        self.location_y += amount
        return self.location_x, self.location_y
```

Assim como o acesso aos atributos, chamar um método simplesmente requer colocar um `.` após o nome do objeto e antes do nome do método.
O método chamado não precisa de uma cópia do objeto como primeiro parâmetro - o Python preenche `self` automaticamente:

```python
class MyClass:
    number = 5
    string = "Hello!"

    def __init__(self, location):
        self.location_x = location[0]
        self.location_y = location[1]

    def change_location(self, amount):
        self.location_x += amount
        self.location_y += amount
        return  self.location_x, self.location_y

# Crie um novo "test_object" com localização (3,7)
>>> test_object = MyClass((3,7))
>>> (test_object.location_x, test_object.location_y)
(3,7)

# Chame change_location para aumentar location_x e location_y em 7.
>>> test_object.change_location(7)
(10, 14)
```

Os atributos de classe podem ser acessados de dentro dos métodos de instância da mesma forma que são acessados fora da classe:

```python
class

 MyClass:
    number = 5
    string = "Hello!"

    def __init__(self, location):
        self.location_x = location[0]
        self.location_y = location[1]

    # Altere a variável de instância location_x e location_y
    def change_location(self, amount):
        self.location_x += amount
        self.location_y += amount
        return  self.location_x, self.location_y

    # Altere a variável de classe number para todas as instâncias de dentro de uma instância.
    def increment_number(self):
        # Incrementa a variável de classe 'number' em 1.
        MyClass.number += 1


>>> test_object_one = MyClass((0,0))
>>> test_object_one.number
5

>>> test_object_two = MyClass((13, -3))
>>> test_object_two.increment_number()
>>> test_object_one.number
6
```

## Implementação de Placeholder ou Stubbing com Pass

Em exercícios de conceitos anteriores e stubs de exercícios práticos, você terá visto a palavra-chave `pass` sendo usada dentro do corpo das funções no lugar de código real.
A palavra-chave `pass` é um placeholder sintaticamente válido - ela impede que o Python gere um erro de sintaxe para uma definição de função ou classe vazia.
Essencialmente, é uma forma de dizer ao interpretador Python: 'Não se preocupe! Eu _vou_ colocar código aqui eventualmente, só não fiz isso ainda.'

```python
class MyClass:
    number = 5
    string = "Hello!"

    def __init__(self, location):
        self.location_x = location[0]
        self.location_y = location[1]

    # Altere a variável de instância location_x e location_y
    def change_location(self, amount):
        self.location_x += amount
        self.location_y += amount
        return  self.location_x, self.location_y

    # Altere a variável de classe number para todas as instâncias
    def increment_number(self):
        # Incrementa a variável de classe 'number' em 1.
        MyClass.number += 1

    # Isso irá compilar e rodar sem erro, mas não tem funcionalidade atual.
    def pending_functionality(self):
        # Placeholder ou stubbing do corpo deste método.
        pass
```

[calling]: https://www.pythonmorsels.com/topics/calling-a-function
[class method]: https://stackoverflow.com/questions/17134653/difference-between-class-and-instance-methods
[dunder]: https://www.dataindependent.com/python/python-glossary/python-dunder/
[imperative]: https://en.wikipedia.org/wiki/Imperative_programming
[declarative]: https://en.wikipedia.org/wiki/Declarative_programming
[oop]: https://www.digitalocean.com/community/tutorials/how-to-construct-classes-and-define-objects-in-python-3
[functional]: https://en.wikipedia.org/wiki/Functional_programming
[dot notation]: https://stackoverflow.com/questions/45179186/understanding-the-dot-notation-in-python

Claro, aqui está a tradução das instruções para o português, mantendo os termos técnicos e o código em Python:

## Instruções

Ellen está criando um jogo onde o jogador deve lutar contra alienígenas. Ela acabou de aprender sobre Programação Orientada a Objetos (OOP) e está ansiosa para aproveitar o que o uso de `classes` pode oferecer ao seu programa.

Para a alegria de Ellen, você ofereceu ajuda e ela te deu a tarefa de programar os alienígenas que o jogador terá que enfrentar.

## 1. Criar a Classe Alien

Defina a classe Alien com um construtor que aceita dois parâmetros `<x_coordinate>` e `<y_coordinate>`, colocando-os nas variáveis de instância `x_coordinate` e `y_coordinate`. Cada alienígena também deve começar com um nível de saúde de 3, então a variável `health` também deve ser inicializada.

```python
>>> alien = Alien(2, 0)
>>> alien.x_coordinate
2
>>> alien.y_coordinate
0
>>> alien.health
3
```

Agora, cada alienígena deve ser capaz de rastrear internamente sua própria posição e saúde.

## 2. O Método `hit`

Ellen gostaria que a classe Alien tivesse um método `hit` que diminui a saúde de um objeto alienígena em 1 quando chamado. Dessa forma, ela pode simplesmente chamar `<alien>.hit()` em vez de ter que alterar manualmente a saúde de um alienígena. Fica a seu critério se `hit()` deve reduzir a saúde _para_ ou _abaixo_ de zero.

```python
>>> alien = Alien(0, 0)
>>> alien.health

# Valor inicial da saúde.
3

# Diminui a saúde em 1 ponto.
>>> alien.hit()
>>> alien.health
2
```

## 3. O Método `is_alive`

Você percebe que, se a saúde continuar diminuindo, em algum momento ela provavelmente chegará a 0 (_ou até menos!_). Seria uma boa ideia adicionar um método `is_alive` que Ellen possa chamar rapidamente para verificar se o alienígena está... bem... vivo. 😉 `<alien>.is_alive()` deve retornar um valor booleano.

```python
>>> alien.health
1
>>> alien.is_alive()
True
>>> alien.hit()
>>> alien.health
0
>>> alien.is_alive()
False
```

## 4. O Método `teleport`

No jogo de Ellen, os alienígenas têm a habilidade de se teletransportar! Você precisará escrever um método `teleport` que receba novos valores de `x_coordinate` e `y_coordinate`, e altere as coordenadas do alienígena de acordo.

```python
>>> alien.teleport(5, -4)
>>> alien.x_coordinate
5
>>> alien.y_coordinate
-4
```

## 5. O Método `collision_detection`

Obviamente, se os alienígenas podem ser atingidos por algo, eles precisam ser capazes de detectar quando uma colisão ocorreu. No entanto, algoritmos de detecção de colisão podem ser complicados, e você ainda não sabe como implementar um. Ellen disse que fará isso mais tarde, mas ela gostaria que o método `collision_detection` aparecesse na classe como um lembrete para construir a funcionalidade. Será necessário que o método receba uma variável de algum tipo (provavelmente outro objeto), mas isso é tudo o que você sabe. Você precisará garantir que a definição do método na classe não cause erros quando chamado:

```python
>>> alien.collision_detection(other_object)
>>>
```

## 6. Contador de Alienígenas

Ellen voltou com um novo pedido. Ela quer acompanhar quantos alienígenas foram criados ao longo da vida do jogo. Ela diz que isso tem algo a ver com o sistema de pontuação.

Por exemplo:

```python
>>> alien_one = Alien(5, 1)
>>> alien_one.total_aliens_created
1
>>> alien_two = Alien(3, 0)
>>> alien_two.total_aliens_created
2
>>> alien_one.total_aliens_created
2
>>> Alien.total_aliens_created
# Acessando a variável diretamente da classe
2
```

## 7. Criar uma Lista de Alienígenas

Ellen adora o que você fez até agora, mas ela tem um favor a mais a pedir. Ela gostaria de uma função independente (_fora da classe `Alien()`_) que crie uma `list` de objetos `Alien()`, dado uma lista de posições (como `tuples`).

Por exemplo:

```python
>>> alien_start_positions = [(4, 7), (-1, 0)]
>>> aliens = new_aliens_collection(alien_start_positions)
...
>>> for alien in aliens:
    	print(alien.x_coordinate, alien.y_coordinate)
(4, 7)
(-1, 0)
```
## Source

### Created by

- @PaulT89
- @BethanyG

### Contributed to by

- @DjangoFett
- @kotp
- @IsaacG