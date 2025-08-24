# 👨‍🚀 Acha Distro
Algoritmo que identifica a distribuição linux no SO.

## 🤔 O que faz?
Busca primeiramente o SO do usuário, caso detecte um sistema Linux - e somente linux - busca a distribuição linux do usuário. 
Em casos de outros sistemas indica que não foi possível encontrar um sistema linux e depois indica o sistema do usuário.

### Como usar:
1. Clone localmente esse repositório:
```bash
git clone https://github.com/GabrielGit10110/Acha_Distro.git
```

*(2a: terminal, 2b: IDE)*
2.a Entre no diretório clonado:
```bash
cd Acha_Distro
```

2.a2 Compile os arquivos para arquivos.class:
```bash
javac -s src -d bin .\src\view\Main.java .\src\controller\DistroController.java
```

2.a3 Execute:
```bash
java -cp dist view.Main
```

---

2.b Importe a pasta com o projeto em sua IDE (Eclipse, Intellij, etc).

2.b2 Execute ou compile para um jar executável.
